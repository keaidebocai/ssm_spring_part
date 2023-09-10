package top.woaibocai.ioc05;

import org.springframework.beans.factory.FactoryBean;

public class JavaBeanFactory implements FactoryBean<JavaBean> {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public JavaBean getObject() throws Exception {
        JavaBean javaBean = new JavaBean();
        javaBean.setName(name);
        return javaBean;
    }

    @Override
    public Class<?> getObjectType() {

        return JavaBean.class;
    }
}
