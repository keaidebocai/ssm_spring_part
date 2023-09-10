package top.woaibocai.ioc02;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;


/**
 * @program: ssm-spring-part
 * @description: 114514
 * @author: woaibocai
 * @create: 2023-09-04 15:54
 **/

//多例
//@Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//单例
//@Scope(scopeName = ConfigurableBeanFactory.SCOPE_SINGLETON)
@Component
public class JavaBean {

    public void init(){

    }

    public void jieshule(){

    }

}
