package top.woaibocai.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @program: ssm-spring-part
 * @description: 配置类
 * @author: woaibocai
 * @create: 2023-09-09 18:40
 **/
@Configuration
@ComponentScan(value = "top.woaibocai")
@EnableAspectJAutoProxy
public class JavaConfig {
}
