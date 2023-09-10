package top.woaibocai.dao;

import top.woaibocai.pojo.Student;

import java.util.List;

/**
 * @program: ssm-spring-part
 * @description: dao
 * @author: woaibocai
 * @create: 2023-09-03 17:33
 **/
public interface StudentDao {
    /**
    * @Description: 查询全部学生信息
    * @Param: []
    * @return: java.util.List<top.woaibocai.pojo.Student>
    * @Author: woaibocai
    * @Date: 2023/9/3
    */
    List<Student> queryAll();
    /**
    * @Description: 根据id查信息
    * @Param: []
    * @return: java.util.List<top.woaibocai.pojo.Student>
    * @Author: woaibocai
    * @Date: 2023/9/3
    */
    List<Student> getId(Integer id);

}
