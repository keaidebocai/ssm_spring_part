package top.woaibocai.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import top.woaibocai.dao.StudentDao;
import top.woaibocai.pojo.Student;

import java.util.List;

/**
 * @program: ssm-spring-part
 * @description: 数据层
 * @author: woaibocai
 * @create: 2023-09-08 15:05
 **/
@Repository
public class StudentDaoImpl implements StudentDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public List<Student> findAll() {
        String sql = "select id , name , age , gender , class as classes from students  ;";
        List<Student> queryAll = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Student>(Student.class));
        return queryAll;
    }
}
