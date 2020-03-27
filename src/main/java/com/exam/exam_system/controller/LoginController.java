package com.exam.exam_system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author :
 * @ClassName : LoginController
 * @Description :
 * @Date : 2020/3/27 15:07
 */
@Controller
@RequestMapping("/exam")
public class LoginController {

    @GetMapping("/login")
    public String goLogin(){
        return "login";
    }
}
