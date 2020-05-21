package com.southwind.spaceclient.controller;

import java.text.NumberFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;

import com.southwind.spaceclient.entity.LySpjk;
import com.southwind.spaceclient.entity.PublicClass;
import com.southwind.spaceclient.service.LyFhgldService;
import com.southwind.spaceclient.service.LyHzyjxxService;
import com.southwind.spaceclient.service.LySpjkService;
import com.southwind.spaceclient.vo.LyHzyjxxVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class ApiController {
    @Resource
    private LyHzyjxxService lyHzyjxxService;
    @Resource
    private LyFhgldService lyFhgldService;
    @Autowired
    private LySpjkService lySpjkService;
      public ApiController() {
    }

    @PostMapping("/FireThreatMS")
    public Map<String, Object> getFireThreatMS() {
        List<PublicClass> fireThreatMS = this.lyHzyjxxService.getFireThreatMS();

        for(int i = 0; i < fireThreatMS.size(); ++i) {
            fireThreatMS.get(i).setTypeId((i + 1)*10);
        }

        Map<String, Object> map = new HashMap<>();
        map.put("dataList", fireThreatMS);
        map.put("message", (Object)null);
        map.put("result", 1);
        map.put("total", this.lyHzyjxxService.count());
        return map;
    }

    @PostMapping("/getFireBarrier")
    public Map<String, Object> getFireBarrier() {
        List<PublicClass> fireBarrier = this.lyFhgldService.getFireBarrier();

        for(int i = 0; i < fireBarrier.size(); ++i) {
            ((PublicClass)fireBarrier.get(i)).setTypeId((i + 1) * 10);
        }

        Map<String, Object> map = new HashMap<>();
        map.put("dataList", fireBarrier);
        map.put("message", (Object)null);
        map.put("result", 1);
        map.put("total", this.lyFhgldService.count());
        return map;
    }

    @PostMapping("/getMonitoringES")
    public Map<String, Object> getMonitoringES() {
        List<PublicClass> monitoringES = this.lySpjkService.getMonitoringES();

        for(int i = 0; i < monitoringES.size(); ++i) {
            ((PublicClass)monitoringES.get(i)).setTypeId((i + 1) * 10);
        }

        Map<String, Object> map = new HashMap<>();
        map.put("dataList", monitoringES);
        map.put("message", (Object)null);
        map.put("result", 1);
        map.put("total", this.lySpjkService.count());
        int StandArea = this.lySpjkService.getStandArea();
        int GrossArea = this.lySpjkService.getGrossArea();
        NumberFormat numberFormat = NumberFormat.getInstance();
        numberFormat.setMaximumFractionDigits(0);
        String result = numberFormat.format(((float)StandArea / (float)GrossArea )* 100);
        System.out.println("StandArea和GrossArea的百分比为:" + result + "%");
        map.put("layout", result + "%");
        return map;
    }
    @PostMapping("/getFireForecastIB")
    public Map<String, Object> getLyHzyjxxVos(){
        List<LyHzyjxxVo> hzyjxxVos = lyHzyjxxService.getLyHzyjxxVos();
        Map<String, Object> map = new HashMap<>();
        map.put("dataList", hzyjxxVos);
        map.put("message", null);
        map.put("result", 1);
        map.put("total", hzyjxxVos.size());
        return map;
    }
    @PostMapping("/getLySpjks")
    public Map<String, Object> getLySpjks(){
        List<LySpjk> list = lySpjkService.list();
        Map<String, Object> map = new HashMap<>();
        map.put("dataList", list);
        map.put("message", null);
        map.put("result", 1);
        map.put("total", list.size());
        return map;
    }
}

