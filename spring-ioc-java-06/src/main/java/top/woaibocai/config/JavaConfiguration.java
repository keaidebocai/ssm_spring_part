package top.woaibocai.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

/**
 * @program: ssm-spring-part
 * @description: java配置类
 * @author: woaibocai
 * @create: 2023-09-08 13:26
 **/
@Configuration
@ComponentScan("top.woaibocai.ioc_01")
@PropertySource(value = "classpath:jdbc.properties")
public class JavaConfiguration {
    @Value("${woaibocai.url}")
    private String url;
    @Value("${woaibocai.driver}")
    private String driver;
    @Value("${woaibocai.username}")
    private String username;
    @Value("${woaibocai.password}")
    private String password;


    @Bean
    public DruidDataSource dataSource(){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl(url);
        dataSource.setDriverClassName(driver);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;
    }
    @Bean
    public JdbcTemplate jdbcTemplate(){
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource());
        return jdbcTemplate;
    }

}
