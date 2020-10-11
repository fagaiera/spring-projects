package com.fabiogaiera.getterandsetter.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class UserAspect {

    @Pointcut("execution(* get*()) || execution(void set*(*))")
    private void pointcut() {

    }

    @Before("pointcut()")
    public void adviceForGetterAndSetter(JoinPoint joinPoint) {
        System.out.println("Execution of getter or setter");
    }

}