//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.southwind.spaceclient.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.southwind.spaceclient.entity.LySpjk;
import com.southwind.spaceclient.entity.PublicClass;

import java.util.List;

public interface LySpjkService extends IService<LySpjk> {
    List<PublicClass> getMonitoringES();

    Integer getStandArea();

    Integer getGrossArea();
}
