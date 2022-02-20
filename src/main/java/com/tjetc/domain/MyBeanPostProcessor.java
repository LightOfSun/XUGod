package com.tjetc.domain;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessBeforeInitialization()方法 ，bean = " + bean + ", beanName = " + beanName);
        User user=null;
        if (beanName.equals("user")){
            user= (User) bean;
            user.setUsername("李四");

        }
        return user;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessBeforeInitialization()方法 ，bean = " + bean + ", beanName = " + beanName);
        User user=null;
        if (beanName.equals("user")){
            user= (User) bean;
            user.setUsername("赵六");


        }
        return user;
    }

}
