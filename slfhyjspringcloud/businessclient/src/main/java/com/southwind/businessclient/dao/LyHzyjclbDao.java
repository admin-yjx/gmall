package com.southwind.businessclient.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.southwind.businessclient.entity.LyHzyjclb;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * (LyHzyjclb)表数据库访问层
 *
 * @author makejava
 * @since 2020-05-20 11:03:30
 */
@Mapper
public interface LyHzyjclbDao extends BaseMapper<LyHzyjclb> {
    List<LyHzyjclb> getLyHzyjclbByGroupYjsb();
}