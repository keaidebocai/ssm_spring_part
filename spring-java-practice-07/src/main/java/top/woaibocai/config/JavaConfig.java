package top.woaibocai.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @program: ssm-spring-part
 * @description: java配置类
 * @author: woaibocai
 * @create: 2023-09-08 14:37
 **/
@Configuration
@ComponentScan("top.woaibocai")
@PropertySource(value = "classpath:jdbc.properties")
public class JavaConfig {
//    @Value("${woaibocai.url}")
//    private String url;
//    @Value("${woaibocai.driver}")
//    private String driver;
//    @Value("${woaibocai.username}")
//    private String username;
//    @Value("${woaibocai.password}")
//    private String password;

    /**
    * @Description: 把注入写在方法里主打一个安全
    * @Param: [url, driver, username, password]
    * @return: com.alibaba.druid.pool.DruidDataSource
    * @Author: woaibocai
    * @Date: 2023/9/8
    */
    @Bean
    public DruidDataSource dataSource(  @Value("${woaibocai.url}") String url,
                                        @Value("${woaibocai.driver}") String driver,
                                        @Value("${woaibocai.username}") String username,
                                        @Value("${woaibocai.password}") String password){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl(url);
        dataSource.setDriverClassName(driver);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate(DruidDataSource dataSource){
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource);
        return jdbcTemplate;
    }




}
