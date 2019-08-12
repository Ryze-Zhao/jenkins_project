package com.zhaostudy.jenkins_project;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@CrossOrigin(origins = "*")
@RequestMapping("/test")
@ResponseBody
public class MyController {
    @RequestMapping("/test")
    public String testFunc() {
        System.out.println("自动构建=================》testFunc已进入");
        return "自动构建=================》testFunc已进入";
    }
}
