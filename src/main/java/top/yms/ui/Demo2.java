package top.yms.ui;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import top.yms.dao.IAccountDao;

public class Demo2 {
    public static void main(String[] args) {
// 根据 Xml 配置文件创建 Resource 资源对象，该对象中包含了 BeanDefinition 的信息
        int xy = 0;
        ClassPathResource resource = new ClassPathResource("spring-config.xml");
        BeanFactory bf = new XmlBeanFactory( resource);
        int x = 0;
        IAccountDao adao = (IAccountDao)bf.getBean("accountDao");
        Object factoryBean = bf.getBean("&accountDao");

        try {
            System.out.println(factoryBean);
//            System.out.println(factoryBean.getObject());
//            System.out.println(factoryBean.isSingleton());
//            System.out.println(factoryBean.getObjectType());
        } catch (Exception e) {
            e.printStackTrace();
        }



    }
}
