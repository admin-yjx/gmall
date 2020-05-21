package com.southwind.businessclient.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.southwind.businessclient.entity.LyHzyjclb;
import com.southwind.businessclient.dao.LyHzyjclbDao;
import com.southwind.businessclient.service.LyHzyjclbService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (LyHzyjclb)表服务实现类
 *
 * @author makejava
 * @since 2020-05-20 11:03:31
 */
@Service
public class LyHzyjclbServiceImpl extends ServiceImpl<LyHzyjclbDao,LyHzyjclb> implements LyHzyjclbService {
    @Resource
    private LyHzyjclbDao lyHzyjclbDao;

    @Override
    public List<LyHzyjclb> getLyHzyjclbByGroupYjsb() {
        return lyHzyjclbDao.getLyHzyjclbByGroupYjsb();
    }
}