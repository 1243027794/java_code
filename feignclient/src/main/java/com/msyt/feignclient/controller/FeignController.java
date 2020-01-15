package com.msyt.feignclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 简述：
 *
 * @author WangLipeng 1243027794@qq.com
 * @version 1.0
 * @since 2020/1/15 17:32
 */
@Controller
public class FeignController {
    @Autowired
    CommonInterface commonInterface;

    @GetMapping("test")
    @ResponseBody
    public String print() {
        for (int i = 0; i < 1000; i++) {
            commonInterface.print();
        }
        return commonInterface.print();
    }
}
