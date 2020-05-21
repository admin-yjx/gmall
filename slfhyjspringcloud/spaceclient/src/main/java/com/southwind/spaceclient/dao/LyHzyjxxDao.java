//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.southwind.spaceclient.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import java.util.List;

import com.southwind.spaceclient.entity.LyHzyjxx;
import com.southwind.spaceclient.entity.PublicClass;
import com.southwind.spaceclient.vo.LyHzyjxxVo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LyHzyjxxDao extends BaseMapper<LyHzyjxx> {
    List<PublicClass> getFireThreatMS();
    List<LyHzyjxxVo> getLyHzyjxxVos();
}
