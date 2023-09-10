package top.woaibocai;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import top.woaibocai.controller.StudentController;
import top.woaibocai.dao.StudentDao;
import top.woaibocai.dao.impl.StudentDaoImpl;
import top.woaibocai.pojo.Student;

import java.util.List;

/**
 * @program: ssm-spring-part
 * @description: 测试类
 * @author: woaibocai
 * @create: 2023-09-03 17:13
 **/
public class JdbcTest {

    @Test
    public void test1(){
        //创建ioc容器
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-01.xml");
        //获取bean
        JdbcTemplate jdbcTemplate = context.getBean("jdbcTemplate", JdbcTemplate.class);
        //操作
        String sql = "select id , name , age , gender , class as classes from students  ;";
        List<Student> studentList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Student>(Student.class));
        System.out.println(studentList);

    }

    @Test
    public void test2(){
        //创建ioc容器
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-02.xml");
        //获取bean
        StudentController controller = applicationContext.getBean(StudentController.class);
        List<Student> all = controller.findAll();
        System.out.println(all);
        //关闭容器
        applicationContext.close();
    }

    @Test
    public void test3(){
        //创建ioc容器
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-02.xml");
        //获取bean
        StudentController controller = applicationContext.getBean(StudentController.class);
        List<Student> students = controller.studentsForId(5);
        System.out.println(students);
        //关闭容器
        applicationContext.close();
    }

    @Test
    public void test4(){
        //创建ioc容器
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-02.xml");
        //获取bean
        StudentController controller = applicationContext.getBean(StudentController.class);
        List<Student> studentes = controller.getAllOfName();
        System.out.println(studentes);
        //关闭容器
        applicationContext.close();
    }



}
