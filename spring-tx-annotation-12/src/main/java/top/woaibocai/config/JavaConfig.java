package top.woaibocai.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.TransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * @program: ssm-spring-part
 * @description: java配置类
 * @author: woaibocai
 * @create: 2023-09-10 18:02
 **/
@Configuration
@ComponentScan(value = "top.woaibocai")
@PropertySource("classpath:jdbc.properties")
@EnableTransactionManagement//事务相关注解
public class JavaConfig {

    @Bean
    public DataSource dataSource(
            @Value(value = "${woaibocai.url}") String url,
            @Value(value = "${woaibocai.driver}") String driver,
            @Value(value = "${woaibocai.username}") String username,
            @Value(value = "${woaibocai.password}") String password
    ){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl(url);
        dataSource.setDriverClassName(driver);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource){
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource);
        return jdbcTemplate;
    }
    /**
    * @Description: 装配事务管理实现对象
    * @Param: [dataSource]
    * @return: org.springframework.transaction.TransactionManager
    * @Author: woaibocai
    * @Date: 2023/9/10
    */
    @Bean
    public TransactionManager transactionManager(DataSource dataSource){
        //一定要用 DataSourceTransactionManager 他是 TransactionManager 的实现类
        DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager();
        dataSourceTransactionManager.setDataSource(dataSource);
        return dataSourceTransactionManager;
    }




}
