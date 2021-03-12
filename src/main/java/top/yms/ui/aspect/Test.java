package top.yms.ui.aspect;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext bf = new ClassPathXmlApplicationContext("spring-config.xml");
        TestBean bean = (TestBean)bf.getBean("test");
        bean.test();
    }
}
