package com.southwind.businessclient.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.southwind.businessclient.entity.LyHzyjclb;
import java.util.List;

/**
 * (LyHzyjclb)表服务接口
 *
 * @author makejava
 * @since 2020-05-20 11:03:31
 */
public interface LyHzyjclbService extends IService<LyHzyjclb> {
    List<LyHzyjclb> getLyHzyjclbByGroupYjsb();
}