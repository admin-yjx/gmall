package com.southwind.businessclient.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.southwind.businessclient.entity.LyHzyjclb;
import com.southwind.businessclient.entity.User;
import com.southwind.businessclient.service.LyHzyjclbService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * (LyHzyjclb)表控制层
 *
 * @author makejava
 * @since 2020-05-20 11:03:32
 */
@RestController
@RequestMapping("api")
public class LyHzyjclbController {
    /**
     * 服务对象
     */
    @Resource
    private LyHzyjclbService lyHzyjclbService;

    @PostMapping("/getStatisticAnalysisOD")
    public Map<String,Object> getStatisticAnalysisOD(){
        List<LyHzyjclb> YjsbList = lyHzyjclbService.getLyHzyjclbByGroupYjsb();
        List<Map<String,Object>> mapList=new ArrayList<>();
        for (LyHzyjclb hzyjclb : YjsbList) {
            Map<String,Object> map = new HashMap<>();
            map.put("typeName", hzyjclb.getYjsb());
            map.put("warnTotal",
                    lyHzyjclbService.count(new QueryWrapper<LyHzyjclb>().
                            eq("YJSB",hzyjclb.getYjsb())));
            map.put("warnValidTotal",
                    lyHzyjclbService.count(new QueryWrapper<LyHzyjclb>().
                            eq("YJSB",hzyjclb.getYjsb()).eq("SFYXYJ","是")));
            map.put("warnTrueTotal",
                    lyHzyjclbService.count(new QueryWrapper<LyHzyjclb>().
                            eq("YJSB",hzyjclb.getYjsb()).eq("CLZT","已处理")));
            map.put("warnFalseTotal",
                    lyHzyjclbService.count(new QueryWrapper<LyHzyjclb>().
                            eq("YJSB",hzyjclb.getYjsb()).eq("SFYXYJ","否")));
            Integer cgcz=lyHzyjclbService.count(new QueryWrapper<LyHzyjclb>().
                    eq("YJSB",hzyjclb.getYjsb()).eq("CLZT","已处理"));
            Integer count=lyHzyjclbService.count(new QueryWrapper<LyHzyjclb>().
                    eq("YJSB",hzyjclb.getYjsb()));
            Integer wxyj=lyHzyjclbService.count(new QueryWrapper<LyHzyjclb>().
                    eq("YJSB",hzyjclb.getYjsb()).eq("SFYXYJ","否"));
            NumberFormat numberFormat = NumberFormat.getInstance();
            numberFormat.setMaximumFractionDigits(0);
            String warnTrueRate = numberFormat.format(((float)cgcz / (float)count )* 100);
            String warnFalseRate = numberFormat.format(((float)wxyj / (float)count )* 100);
            map.put("warnTrueRate", warnTrueRate+"%");
            map.put("warnFalseRate", warnFalseRate+"%");
            System.out.println(hzyjclb.getYjsb()+"已处理的数："+cgcz);
            System.out.println(hzyjclb.getYjsb()+"总条数："+count);
            System.out.println(hzyjclb.getYjsb()+"预警不是有效的个数："+wxyj);
            mapList.add(map);
        }
        Map<String,Object> map=new HashMap<>();
        map.put("dataList",mapList);
        map.put("message",null);
        map.put("result",1);
        map.put("total",0);
       return map;
    }
}