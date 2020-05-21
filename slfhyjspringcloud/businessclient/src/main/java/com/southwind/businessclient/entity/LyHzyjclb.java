package com.southwind.businessclient.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigInteger;

/**
 * (LyHzyjclb)实体类
 *
 * @author makejava
 * @since 2020-05-20 11:03:30
 */
@Data
public class LyHzyjclb implements Serializable {
    
    private BigInteger id;
    
    private String sfyxyj;
    
    private String yjsb;
    
    private String sbbh;
    
    private String clr;
    
    private String clsj;
    
    private String clzt;
    
    private String yjbh;
    /**
    * 预警前照片
    */
    private String yjqzp;
    /**
    * 预警后照片
    */
    private String yjhzp;
    /**
    * 推送时间
    */
    private String tssj;
    /**
    * 备注信息
    */
    private String bzxx;



}