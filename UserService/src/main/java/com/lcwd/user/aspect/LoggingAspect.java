package com.lcwd.user.aspect;


import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@Slf4j
@Component
@EnableAspectJAutoProxy
public class LoggingAspect {

    @Pointcut("execution(* com.lcwd.user.*.*.*(..))")
    public void argumentTypeMethod() {
    }

    @Pointcut("execution(* com.lcwd.user.*.*.*())")
    public void noArgumentTypeMethod() {
    }



    @Before("argumentTypeMethod()")
    public void logBeforeMethodsForArgumentType(JoinPoint joinPoint) {
        printTheLogs("Before method execution : {}", joinPoint.getSignature().getName());
    }

    @After("argumentTypeMethod()")
    public void logAfterMethodsForArgumentType(JoinPoint joinPoint) {
        printTheLogs("After method execution : {}", joinPoint.getSignature().getName());
    }

    @Before("argumentTypeMethod()")
    public void logBeforeMethodsForNoArgumentType(JoinPoint joinPoint) {
        printTheLogs("Before method execution : {}", joinPoint.getSignature().getName());
    }

    @After("argumentTypeMethod()")
    public void logAfterMethodsForNoArgumentType(JoinPoint joinPoint) {
        printTheLogs("After method execution : {}", joinPoint.getSignature().getName());
    }

    public void printTheLogs(String str1,String str2)
    {
        log.info(str1,str2);
    }



}
