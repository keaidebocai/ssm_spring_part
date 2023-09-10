package top.woaibocai.advice;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @program: ssm-spring-part
 * @description: 日志增强类
 * @author: woaibocai
 * @create: 2023-09-09 18:42
 **/
@Component
@Aspect
public class LogAdvice {
    @Before("execution(* top.woaibocai.service.impl.*.*(..))")
    public void start(){
        System.out.println("start");
    }
    @After("execution(* top.woaibocai.service.impl.*.*(..))")
    public void end(){
        System.out.println("end");
    }
    @AfterThrowing("execution(* top.woaibocai.service.impl.*.*(..))")
    public void error(){
        System.out.println("error");
    }
}
