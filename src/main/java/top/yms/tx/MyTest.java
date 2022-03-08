package top.yms.tx;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test1() {
        MyTransaction myTransaction = new MyTransaction();
        myTransaction.save();
    }

    @Test
    public void test2() {
        // 基于tx标签的声明式事物
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-tx-test.xml");
        AccountService studentService = ctx.getBean("accountService", AccountService.class);
        studentService.save();
    }

}
