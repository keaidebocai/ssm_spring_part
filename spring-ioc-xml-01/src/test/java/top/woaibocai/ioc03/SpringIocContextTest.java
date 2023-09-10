package top.woaibocai.ioc03;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.woaibocai.ioc04.JavaBean1;
import top.woaibocai.ioc05.JavaBean;
import top.woaibocai.ioc05.JavaBeanFactory;

public class SpringIocContextTest{

    public void createIoC(){
        //方式1 一步到位
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-03.xml");

        //方式2 源码常见的 先实例化，再指定配置文件，最后刷新容器触发Bean实例化动作 [springmvc源码和contextLoadListener源码方式]
        //1.ClassPathXmlApplicationContext
        //2.载入
        //3.刷新
        ClassPathXmlApplicationContext context1 = new ClassPathXmlApplicationContext();
        context1.setConfigLocations("spring-03.xml");
        context1.refresh();

    }
    @Test
    public void getBeanFromIoC(){
        //创建ioc
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext();
        context.setConfigLocations("spring-03.xml");
        context.refresh();
        //获取bean
        //方式1 直接把Object 强转成你所需的类型
        HappyComponent happyComponent1 = (HappyComponent) context.getBean("happyComponent");
        //方式2 根据beanId 来转化
        HappyComponent happyComponent2 = context.getBean("happyComponent", HappyComponent.class);
        //方式3 直接根据类型来转化，！！！！！！！但是此类型的bean必须唯一 如果是接口，那必须指向唯一的 一个实现类
        HappyComponent happyComponent3 = context.getBean(HappyComponent.class);

        happyComponent2.doWork();
        happyComponent2.逆天();

    }

    @Test
    public void test1(){
        //创建ioc容器
        ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("spring-04.xml");
        JavaBean1 javaBean1 = context.getBean("javaBean1", JavaBean1.class);
        JavaBean1 javaBean2 = context.getBean("javaBean1", JavaBean1.class);
        System.out.println(javaBean1 == javaBean2);
    }

    @Test
    public void test2(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-05.xml");
        JavaBean javaBean = context.getBean("JavaBean", JavaBean.class);
        javaBean.setName("orgbzi");
        System.out.println(javaBean);
    }

}
