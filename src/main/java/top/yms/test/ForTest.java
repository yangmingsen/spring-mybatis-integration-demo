package top.yms.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ForTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-test.xml");

        TestChangeMethod test =(TestChangeMethod) context.getBean("changeMe");

        test.changeMe();
    }
}
