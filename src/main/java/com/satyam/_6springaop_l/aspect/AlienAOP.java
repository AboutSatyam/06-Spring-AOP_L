package com.satyam._6springaop_l.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Before;

import java.time.LocalDateTime;

public class AlienAOP {

    @Before(value = "execution(* com.satyam._6springaop_l.rest.*.*(..))")
    //@Before(value = "execution(* com.satyam._6springaop_l.rest.AlienController.*(..))")

    //      @Before(value = "execution(* com.satyam._6springaop_l.rest.*.*(..))") Inside This Package And inside
    //      This Class that method can accept any no of parameter and any argument.
//    @After(value = "execution(* com.satyam._6springaop_l.rest.*.*(..))")

    public void beforeAdvice(JoinPoint joinPoint) {
        System.out.println("Requent Made To " + joinPoint.getSignature() + "at" + LocalDateTime.now());
    }
}
