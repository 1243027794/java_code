package com.msyt.feingserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 简述：
 *
 * @author WangLipeng 1243027794@qq.com
 * @version 1.0
 * @since 2020/1/15 16:05
 */
@RestController
@RequestMapping("server")
public class Controller {
    @GetMapping("message")
    public String print() {
        return "hello world!!";
    }
}
