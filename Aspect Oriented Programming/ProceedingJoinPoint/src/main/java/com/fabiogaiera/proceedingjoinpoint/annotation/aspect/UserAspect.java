package com.fabiogaiera.proceedingjoinpoint.annotation.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class UserAspect {

    @Pointcut("execution(* com.fabiogaiera.proceedingjoinpoint.annotation.service.*.*(..))")
    private void pointcut() {
    }

    @Around("pointcut()")
    public void aroundAdvice(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("Before");
        pjp.proceed();
        System.out.println("After");
    }

}