package top.yms.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.yms.ui.bean.MyCat;
import top.yms.ui.bean.TestEvent;

public class ApplicationClient {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("application-client.xml");
        int x = 1;
        MyCat mycat = ac.getBean(MyCat.class);

        System.out.println(mycat.getName());
    }
}
