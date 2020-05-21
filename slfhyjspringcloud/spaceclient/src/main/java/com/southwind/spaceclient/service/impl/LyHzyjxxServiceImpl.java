//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.southwind.spaceclient.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.List;
import javax.annotation.Resource;

import com.southwind.spaceclient.dao.LyHzyjxxDao;
import com.southwind.spaceclient.entity.LyHzyjxx;
import com.southwind.spaceclient.entity.PublicClass;
import com.southwind.spaceclient.service.LyHzyjxxService;
import com.southwind.spaceclient.vo.LyHzyjxxVo;
import org.springframework.stereotype.Service;

@Service
public class LyHzyjxxServiceImpl extends ServiceImpl<LyHzyjxxDao, LyHzyjxx> implements LyHzyjxxService {
    @Resource
    LyHzyjxxDao lyHzyjxxDao;

    public LyHzyjxxServiceImpl() {
    }

    public List<PublicClass> getFireThreatMS() {
        return this.lyHzyjxxDao.getFireThreatMS();
    }

    @Override
    public List<LyHzyjxxVo> getLyHzyjxxVos() {
        return lyHzyjxxDao.getLyHzyjxxVos();
    }
}
