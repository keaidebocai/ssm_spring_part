package top.woaibocai.dao.impl;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import top.woaibocai.dao.StudentDao;
import top.woaibocai.pojo.Student;

import java.util.List;

/**
 * @program: ssm-spring-part
 * @description: 学生信息的实现类
 * @author: woaibocai
 * @create: 2023-09-03 17:38
 **/
public class StudentDaoImpl implements StudentDao {
    private JdbcTemplate jdbcTemplatel;

    public void setJdbcTemplatel(JdbcTemplate jdbcTemplatel) {
        this.jdbcTemplatel = jdbcTemplatel;
    }

    @Override
    public List<Student> queryAll() {
        String sql = "select id , name , age , gender , class as classes from students  ;";
        List<Student> queryAll = jdbcTemplatel.query(sql, new BeanPropertyRowMapper<Student>(Student.class));
        return queryAll;
    }
    /**
    * @Description: 根据id查信息
    * @Param: [id]
    * @return: java.util.List<top.woaibocai.pojo.Student>
    * @Author: woaibocai
    * @Date: 2023/9/3
    */
    @Override
    public List<Student> getId(Integer id) {
        String sql = "select id , name , age , gender , class as classes from students where id=?  ;";
        List<Student> getIdForTable = jdbcTemplatel.query(sql, new BeanPropertyRowMapper<Student>(Student.class), id);
        return getIdForTable;
    }
}
