package com.cos.reflect.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Dispatcher implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request =(HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse)servletResponse;

        System.out.println("컨텍스트 패스 : "+ request.getContextPath()); //프로젝스 시작 주소
        System.out.println("식별자 주소 : " + request.getRequestURI()); //전체 주소
        System.out.println("전체 주소 : "+request.getRequestURL());

        String endPoint = request.getRequestURI().replaceAll(request.getContextPath(),"");
        System.out.println("엔드 포인트 : "+endPoint);

    }
}
