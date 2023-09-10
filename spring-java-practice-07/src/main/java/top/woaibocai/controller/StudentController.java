package top.woaibocai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import top.woaibocai.pojo.Student;
import top.woaibocai.service.StudentService;
import top.woaibocai.service.impl.StudentServiceImpl;

import java.util.List;

/**
 * @program: ssm-spring-part
 * @description: 学生信息的业务层、
 * @author: woaibocai
 * @create: 2023-09-08 15:00
 **/
@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;

    public void findAll(){
        List<Student> all = studentService.findAll();
        System.out.println(all);
    }

}
