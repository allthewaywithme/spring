package com.demo.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/*@Component
@Aspect*/
public class UserAspect {

   /* @Pointcut(value = "execution(* com.demo.service.*.*(..))")
    public void  pointCut(){    }*/

    /**
     * 连接点
     * @param joinPoint
     */
    /*@Before(value = "execution(* com.demo.service.*.*(..))")
    public void doBefore(JoinPoint joinPoint){
        //
        String name = joinPoint.getSignature().getName();
        Object [] args=joinPoint.getArgs();
        System.out.println(name+"切点拦截方法之前"+args.toString());
    }

    @After(value = "execution(* com.demo.service.*.*(..))")
    public void doAfter(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println(name + "切点拦截方法之后" + args.toString());
    }

    @AfterReturning(value = "execution(* com.demo.service.*.*(..))",returning = "result")
    public void afterReturning(JoinPoint joinPoint,Object result){
        System.out.println("返回的结果"+result);
    }*/

    /**
     * 这个方法为拦截方法 必须的
     */
    /*@Around(value = "execution(* com.demo.service.*.*(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint){
        try {
            proceedingJoinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }*/
}
