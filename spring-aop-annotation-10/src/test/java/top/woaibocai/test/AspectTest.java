package top.woaibocai.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import top.woaibocai.config.JavaConfig;
import top.woaibocai.service.Calculator;

/**
* @program: ssm-spring-part
*
* @description: test
*
* @author: woaibocai
*
* @create: 2023-09-09 18:48
**/
@SpringJUnitConfig(JavaConfig.class)
public class AspectTest {
    @Autowired
    private Calculator calculator;

    @Test
    public void test(){
        int add = calculator.add(1, 1);
        System.out.println(add);
    }

    @Test
    public void test1(){
        int div = calculator.add(1, 0);
        System.out.println(div);
    }



}
