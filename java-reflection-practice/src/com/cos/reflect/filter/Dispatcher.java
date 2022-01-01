package com.cos.reflect.filter;

import com.cos.reflect.annotation.RequestMapping;
import com.cos.reflect.controller.UserController;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Enumeration;

public class Dispatcher implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request =(HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse)servletResponse;

        System.out.println("컨텍스트 패스 : "+ request.getContextPath()); //프로젝스 시작 주소
        System.out.println("식별자 주소 : " + request.getRequestURI()); //전체 주소
        System.out.println("전체 주소 : "+request.getRequestURL());

        String endPoint = request.getRequestURI().replaceAll(request.getContextPath(),"");
        System.out.println("엔드  포인트 : "+endPoint);
        UserController userController = new UserController();
        Method[] methods = userController.getClass().getDeclaredMethods();
        for (Method method : methods) {

            Annotation annotation = method.getDeclaredAnnotation(RequestMapping.class); //해당 메소드에 선언되어 있는 어노테이션 중 RequestMapping 어노테이션 정보 가져옴
            RequestMapping requestMapping = (RequestMapping)  annotation; //다운캐스팅
            System.out.println("request mapping : "+requestMapping.uri());
            if(requestMapping.uri().equals(endPoint)){ //어노테이션 주소랑 엔드포인트랑 같은경우
                System.out.println("리플렉션 컨트롤러 함수 어노테이션 값 : "+requestMapping.uri());
                try{
                    Parameter[] params = method.getParameters(); //메소드에 선언되어 있는 모든 파라미터들
                    String path;
                    if(params.length!=0){//파라미터가 하나라도 있는 경우(login,join)
                        Object dtoInstance = params[0].getType().newInstance();
                        setData(dtoInstance,request);
                        path=(String) method.invoke(userController,dtoInstance);
                    }else{
                        path=(String) method.invoke(userController);
                    }
                    System.out.println("path : "+path);
                    RequestDispatcher dispatcher = request.getRequestDispatcher(path);
                    dispatcher.forward(request,response);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private String keyToMethodKey(String key){
        String firstKey = key.substring(0,1);
        String remainKey = key.substring(1);
        return "set"+firstKey.toUpperCase()+remainKey;
    }

    private <T> void setData(T instance, HttpServletRequest request){
        System.out.println("인스턴스 타입 : "+instance.getClass());
        Enumeration<String> params = request.getParameterNames(); //Enum iter

        while (params.hasMoreElements()) {
            String key = (String) params.nextElement();
            System.out.println("key : "+key);
            String methodKey=keyToMethodKey(key);
            System.out.println("실행할 setter 메서드 :"+methodKey);
            Method[] methods = instance.getClass().getMethods();
            for (Method method : methods) {
                if(method.getName().equals(methodKey)){
                    try {
                        method.invoke(instance,request.getParameter(key));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                }
            }

        }
    }

}
