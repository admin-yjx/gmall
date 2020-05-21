//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.southwind.spaceclient.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.southwind.spaceclient.entity.LyHzyjxx;
import com.southwind.spaceclient.entity.PublicClass;
import com.southwind.spaceclient.vo.LyHzyjxxVo;

import java.util.List;

public interface LyHzyjxxService extends IService<LyHzyjxx> {
    List<PublicClass> getFireThreatMS();
    List<LyHzyjxxVo> getLyHzyjxxVos();
}
