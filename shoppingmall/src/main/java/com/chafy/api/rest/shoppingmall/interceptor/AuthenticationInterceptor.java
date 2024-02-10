package com.chafy.api.rest.shoppingmall.interceptor;

import jakarta.servlet.http.*;
import org.springframework.stereotype.*;
import org.springframework.web.servlet.*;

@Component
public class AuthenticationInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response,
                             Object handler) throws Exception {

        // 사용자 인증
        request.setAttribute("userId", "mike");
        return true;
    }
}
