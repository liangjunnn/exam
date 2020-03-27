package com.exam.exam_system.common.config;

import com.exam.exam_system.common.config.annotation.LoginUser;
import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

/**
 * @Author :
 * @ClassName : CurrUserMethodArgumentResolver
 * @Description : 实现@LoginUser的参数解析器
 * @Date : 2020/3/22 1:39
 */
public class CurrUserMethodArgumentResolver implements HandlerMethodArgumentResolver {
    @Override
    public boolean supportsParameter(MethodParameter methodParameter) {
        if (methodParameter.hasParameterAnnotation(LoginUser.class)) {
            return true;
        }
        return false;

    }

    @Override
    public Object resolveArgument(MethodParameter methodParameter, ModelAndViewContainer modelAndViewContainer, NativeWebRequest nativeWebRequest, WebDataBinderFactory webDataBinderFactory) throws Exception {
        LoginUser currentUserAnnotation = methodParameter.getParameterAnnotation(LoginUser.class);
        return nativeWebRequest.getAttribute(currentUserAnnotation.value(), NativeWebRequest.SCOPE_SESSION);
    }
}

