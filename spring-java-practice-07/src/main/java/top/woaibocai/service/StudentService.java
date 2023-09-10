package top.woaibocai.service;

import top.woaibocai.pojo.Student;

import java.util.List;

/**
 * @program: ssm-spring-part
 * @description: 学士信息的逻辑层
 * @author: woaibocai
 * @create: 2023-09-08 15:00
 **/
public interface StudentService {

    public List<Student> findAll();
}
