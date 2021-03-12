package top.yms.ui;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import top.yms.service.impl.AccountServiceImpl;

public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessBeforeInitialization..."+beanName+"..."+bean);
        if ("accountService".equals(beanName)) {

            AccountServiceImpl accountService = (AccountServiceImpl)bean;
            System.out.println("before="+accountService.getAccountDao());
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessAfterInitialization..."+beanName+"..."+bean);

        if ("accountService".equals(beanName)) {

            AccountServiceImpl accountService = (AccountServiceImpl)bean;
            System.out.println("after="+accountService.getAccountDao());
        }

        return bean;
    }
}
