package top.woaibocai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import top.woaibocai.dao.StudentDao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/*
|||
|-|-|
|核心点|掌握目标|
|spring框架理解|spring家族和spring framework框架|
|spring核心功能|ioc/di , aop , tx |
|spring ioc / di|组件管理、ioc容器、ioc/di , 三种配置方式|
|spring aop|aop和aop框架和代理技术、基于注解的aop配置|
|spring tx|声明式和编程式事务、动态事务管理器、事务注解、属性|
 */
@Service
public class StudentService {
    
    @Autowired
    private StudentDao studentDao;
    @Transactional(
            timeout = 3,
            readOnly = false,
            rollbackFor = Exception.class,
            noRollbackFor = IOException.class,
            isolation = Isolation.READ_COMMITTED,
            propagation = Propagation.REQUIRED)//isolation = Isolation.READ_COMMITTED 读已提交  propagation = Propagation.REQUIRED 事务的传播，推荐使用默认值，意为如果没父事务就新创一个，如果有了就加入
    public void changeInfo() throws FileNotFoundException {
        studentDao.updateAgeById(660,1);
        new FileInputStream("xxxx");
        System.out.println("-----------");
        studentDao.updateNameById("test1",1);
    }
}
