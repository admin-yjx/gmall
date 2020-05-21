package com.atguigu.gmall.ums.dao;

import com.atguigu.gmall.ums.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author yaojiaxun
 * @email 2624001338@qq.com
 * @date 2020-02-04 14:58:14
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
