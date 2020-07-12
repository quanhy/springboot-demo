package com.demo.aspect;

import com.demo.annotation.Sendmq;
import com.demo.dto.MessageDTO;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Aspect
@Component
public class SendmqAspect {

    private final String POINT_CUT = "@annotation(com.demo.annotation.Sendmq)";

    @Pointcut("@annotation(com.demo.annotation.Sendmq)")
    public void pointCut(){

    }

    @Before("pointCut()")
    public void dobefore(){
        System.out.println("before");
    }

    @After("pointCut()")
    public void doAfter(){
        System.out.println("after");
    }

    @Around("pointCut()")
    public Object doAround(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("aaaaaa");
        String targetName = pjp.getClass().getName();
        Class<?> targetClass = Class.forName(targetName);
        Sendmq annotation = pjp.getClass().getAnnotation(Sendmq.class);
        String initMethod = annotation.init();
        Method[] methods = targetClass.getMethods();
        Object o = targetClass.newInstance();
        MessageDTO messageDTO = null;
        for(Method method : methods){
            if(method.getName().equals(initMethod)){
                messageDTO = (MessageDTO) method.invoke(o, null);
            }
        }


        // TODO send message to mq


        Object[] args = pjp.getArgs();
        Object proceed = pjp.proceed(args);
        // TODO
        return proceed;
    }

}
