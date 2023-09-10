package top.woaibocai.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * @program: ssm-spring-part
 * @description: 超级增强
 * @author: woaibocai
 * @create: 2023-09-10 13:28
 **/
@Aspect
@Component
public class LogLogAdvice {
    @Before("execution(* top.woaibocai..impl.*.*(..))")
    public void before(JoinPoint joinPoint){
        // 1.通过JoinPoint对象获取目标方法签名对象
        // 方法的签名：一个方法的全部声明信息
        Signature signature = joinPoint.getSignature();

        // 2.通过方法的签名对象获取目标方法的详细信息
        String methodName = signature.getName();
        System.out.println("methodName = " + methodName);

        int modifiers = signature.getModifiers();
        System.out.println("modifiers = " + modifiers);

        String declaringTypeName = signature.getDeclaringTypeName();
        System.out.println("declaringTypeName = " + declaringTypeName);

        // 3.通过JoinPoint对象获取外界调用目标方法时传入的实参列表
        Object[] args = joinPoint.getArgs();

        // 4.由于数组直接打印看不到具体数据，所以转换为List集合
        List<Object> argList = Arrays.asList(args);

        System.out.println("[AOP前置通知] " + methodName + "方法开始了，参数列表：" + argList);

    }
    @AfterReturning("execution(* top.woaibocai..impl.*.*(..))")
    public void afterRuturning(){

    }
    @After("execution(* top.woaibocai..impl.*.*(..))")
    public void after(){

    }
    @AfterThrowing("execution(* top.woaibocai..impl.*.*(..))")
    public void afterThorwing(){

    }





}
