package com.hll.interceptor;

import com.hll.model.User;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AuthorizationInterceptor implements HandlerInterceptor {
    private static final String[] IGNORE_URI = {"/interLogin", "/interForm"};

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response,
                                Object handler, Exception e) {
        System.out.println("AuthorizationInterceptor afterCompletion !!!");
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response,
                           Object handler, ModelAndView mv) {
        System.out.println("AuthorizationInterceptor postHandle !!!");
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
                             Object handler) throws Exception {
        System.out.println("AuthorizationInterceptor preHandle !!!");
        boolean flag = false;
        String servletPath = request.getServletPath();
        for (String s : IGNORE_URI) {
            if (servletPath.contains(s)) {
                flag = true;
                break;
            }
        }

        if (!flag) {
            User user = (User) request.getSession().getAttribute("interUser");
            if (user == null) {
                System.out.println("AuthorizationInterceptor preHandle 请求拦截");
                request.setAttribute("message", "请先登录再访问");
                request.getRequestDispatcher("interForm").forward(request, response);
            } else {
                System.out.println("AuthorizationInterceptor preHandle 请求放行");
                flag = true;
            }
        }
        return flag;
    }
}
