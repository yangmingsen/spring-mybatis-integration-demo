package top.yms.ui.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationAOPTest {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-aop.xml");
        CheckUserHolder.set("admin" +
                "");
        ProductService productService = ac.getBean(ProductService.class);
        productService.delete(1L);
    }
}
