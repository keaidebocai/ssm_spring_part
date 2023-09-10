package top.woaibocai.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.woaibocai.dao.StudentDao;
import top.woaibocai.pojo.Student;
import top.woaibocai.service.StudentService;

import java.util.List;

/**
 * @program: ssm-spring-part
 * @description: 学生信息的实现类
 * @author: woaibocai
 * @create: 2023-09-08 15:01
 **/
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;


    @Override
    public List<Student> findAll() {
        List<Student> findAll = studentDao.findAll();
        return findAll;
    }
}
