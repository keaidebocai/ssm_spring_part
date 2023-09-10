package top.woaibocai.tx;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import top.woaibocai.config.JavaConfig;
import top.woaibocai.service.StudentService;

import java.io.FileNotFoundException;

/**
 * @program: ssm-spring-part
 * @description: test
 * @author: woaibocai
 * @create: 2023-09-10 18:10
 **/
@SpringJUnitConfig(JavaConfig.class)
public class TxTest {

    @Autowired
    private StudentService studentService;
    @Test
    public void test() throws FileNotFoundException {
        studentService.changeInfo();
    }


}
