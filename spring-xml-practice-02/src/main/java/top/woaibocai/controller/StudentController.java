package top.woaibocai.controller;

import top.woaibocai.pojo.Student;
import top.woaibocai.service.StudentService;

import java.util.List;

/**
 * @program: ssm-spring-part
 * @description: 业务层
 * @author: woaibocai
 * @create: 2023-09-03 18:05
 **/
public class StudentController {
    private StudentService studentService;

    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

    public List<Student> findAll(){
        List<Student> studentList = studentService.findAll();
        return studentList;
    }

    public List<Student> studentsForId(Integer id){
        List<Student> tableForId = studentService.getTableForId(id);
        return tableForId;
    }

    public List<Student> getAllOfName(){
        List<Student> allOfName = studentService.getAllOfName();
        return allOfName;
    }



}
