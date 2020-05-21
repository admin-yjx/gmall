//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.southwind.spaceclient.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import java.util.List;

import com.southwind.spaceclient.entity.LySpjk;
import com.southwind.spaceclient.entity.PublicClass;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface LySpjkDao extends BaseMapper<LySpjk> {
    List<PublicClass> getMonitoringES();

    Integer getStandArea();

    Integer getGrossArea();
}
