package com.exam.exam_system.common.config.annotation;

import com.exam.exam_system.common.constant.LoginUserConstant;

import java.lang.annotation.*;

/**
 * @Author :
 * @ClassName : LoginUser
 * @Description :自定义注解获取当前登录用户
 * @Date : 2020/3/22 1:36
 */
@Target({ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface  LoginUser {

    /**
     * 当前用户在session对象中的key，LoginUserConstant.LoginUser是个全局字符串
     */
    String value() default LoginUserConstant.LoginUser;
}
