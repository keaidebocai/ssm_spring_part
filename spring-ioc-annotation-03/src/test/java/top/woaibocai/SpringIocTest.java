package top.woaibocai;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.woaibocai.ioc01.XxxDao;
import top.woaibocai.ioc02.JavaBean;

/**
 * @program: ssm-spring-part
 * @description: 测试类
 * @author: woaibocai
 * @create: 2023-09-04 14:08
 **/
public class SpringIocTest {

    @Test
    public void test1(){
        ClassPathXmlApplicationContext applicationContext
                = new ClassPathXmlApplicationContext("spring-01.xml");
        XxxDao xxxDao = applicationContext.getBean("xxxDao", XxxDao.class);
        applicationContext.close();
    }

    @Test
    public void test2(){
        ClassPathXmlApplicationContext applicationContext
                = new ClassPathXmlApplicationContext("spring-02.xml");
        JavaBean bean = applicationContext.getBean("javaBean",JavaBean.class);
        applicationContext.close();
    }



}
