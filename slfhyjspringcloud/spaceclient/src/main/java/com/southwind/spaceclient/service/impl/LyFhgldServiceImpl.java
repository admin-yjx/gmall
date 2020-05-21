//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.southwind.spaceclient.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.List;
import javax.annotation.Resource;

import com.southwind.spaceclient.dao.LyFhgldDao;
import com.southwind.spaceclient.entity.LyFhgld;
import com.southwind.spaceclient.entity.PublicClass;
import com.southwind.spaceclient.service.LyFhgldService;
import org.springframework.stereotype.Service;

@Service
public class LyFhgldServiceImpl extends ServiceImpl<LyFhgldDao, LyFhgld> implements LyFhgldService {
    @Resource
    private LyFhgldDao lyFhgldDao;

    public LyFhgldServiceImpl() {
    }

    public List<PublicClass> getFireBarrier() {
        return this.lyFhgldDao.getFireBarrier();
    }
}
