package top.woaibocai.service.impl;

import top.woaibocai.dao.StudentDao;
import top.woaibocai.dao.impl.StudentDaoImpl;
import top.woaibocai.pojo.Student;
import top.woaibocai.service.StudentService;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @program: ssm-spring-part
 * @description: 逻辑层的实现类
 * @author: woaibocai
 * @create: 2023-09-03 18:01
 **/
public class StudentServiceImpl implements StudentService{

    private StudentDao studentDao;

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public List<Student> findAll() {
        List<Student> students = studentDao.queryAll();
        return students;
    }

    @Override
    public List<Student> getTableForId(Integer id) {
        List<Student> studentDaoId = studentDao.getId(id);
        return studentDaoId;
    }
    /**
    * @Description: 获取所有学生姓名
    * @Param: []
    * @return: java.util.List<top.woaibocai.pojo.Student>
    * @Author: woaibocai
    * @Date: 2023/9/3
    */
    @Override
    public List<Student> getAllOfName() {
        List<Student> students = studentDao.queryAll();
        students.stream()
                .map(student -> student.getName())
                .distinct()
                .forEach(s -> System.out.print(s + " "));


        return students;
    }


}
