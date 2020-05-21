package com.southwind.spaceclient.config;

import com.southwind.spaceclient.utlis.RespBean;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ControllerHandler {

    @ExceptionHandler
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public RespBean handleException(Exception ex) {
        System.out.println("程序异常：" + ex.toString());
        return RespBean.error("请求失败");
    }
}
