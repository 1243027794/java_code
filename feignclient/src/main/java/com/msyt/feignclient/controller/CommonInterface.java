package com.msyt.feignclient.controller;




import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 简述：
 *
 * @author WangLipeng 1243027794@qq.com
 * @version 1.0
 * @since 2020/1/15 17:29
 */
@FeignClient(name = "commonInterface", url = "http://localhost:8082/server")
public interface CommonInterface {

    @GetMapping("message")
    @ResponseBody
    String print();

    @Component
    class InnerClass implements CommonInterface{
        @Override
        public String print() {
            return "error";
        }
    }
}
