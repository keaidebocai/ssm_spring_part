package top.woaibocai.service;

import top.woaibocai.pojo.Student;

import java.util.List;

public interface StudentService{
    List<Student> findAll();

    List<Student> getTableForId(Integer id);
    /**
    * @Description: 获取所有学生姓名
    * @Param: []
    * @return: java.util.List<top.woaibocai.pojo.Student>
    * @Author: woaibocai
    * @Date: 2023/9/3
    */
    List<Student> getAllOfName();

}
