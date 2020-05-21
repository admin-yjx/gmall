//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.southwind.spaceclient.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import java.util.List;

import com.southwind.spaceclient.entity.LyFhgld;
import com.southwind.spaceclient.entity.PublicClass;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LyFhgldDao extends BaseMapper<LyFhgld> {
    List<PublicClass> getFireBarrier();
}