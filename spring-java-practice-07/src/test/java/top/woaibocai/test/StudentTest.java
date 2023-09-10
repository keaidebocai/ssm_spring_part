package top.woaibocai.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import top.woaibocai.config.JavaConfig;
import top.woaibocai.controller.StudentController;
import top.woaibocai.pojo.Student;

import java.util.List;

/**
 * @program: ssm-spring-part
 * @description: test
 * @author: woaibocai
 * @create: 2023-09-08 15:14
 **/
@SpringJUnitConfig(value = JavaConfig.class)
public class StudentTest {
    @Autowired
    private StudentController studentController;


    @Test
    public void test1(){
        studentController.findAll();
    }

    @Test
    public void test(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        StudentController bean = context.getBean(StudentController.class);
        bean.findAll();


    }



}
