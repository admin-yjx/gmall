//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.southwind.spaceclient.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.List;
import javax.annotation.Resource;

import com.southwind.spaceclient.dao.LySpjkDao;
import com.southwind.spaceclient.entity.LySpjk;
import com.southwind.spaceclient.entity.PublicClass;
import com.southwind.spaceclient.service.LySpjkService;
import org.springframework.stereotype.Service;

@Service
public class LySpjkServiceImpl extends ServiceImpl<LySpjkDao, LySpjk> implements LySpjkService {
    @Resource
    private LySpjkDao lySpjkDao;

    public LySpjkServiceImpl() {
    }

    public List<PublicClass> getMonitoringES() {
        return this.lySpjkDao.getMonitoringES();
    }

    public Integer getStandArea() {
        return this.lySpjkDao.getStandArea();
    }

    public Integer getGrossArea() {
        return this.lySpjkDao.getGrossArea();
    }
}
