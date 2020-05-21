//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.southwind.spaceclient.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.southwind.spaceclient.entity.LyFhgld;
import com.southwind.spaceclient.entity.PublicClass;

import java.util.List;

public interface LyFhgldService extends IService<LyFhgld> {
    List<PublicClass> getFireBarrier();
}
