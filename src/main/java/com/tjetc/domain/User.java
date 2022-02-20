package com.tjetc.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;

public class User implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean , DisposableBean {
    private String username;
    private String password;


    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User() {
        System.out.println("User.User无参构造方法");
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        System.out.println("User.setUsername方法"+username);
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        System.out.println("User.setPassword 方法"+password);
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public void setBeanName(String s) {
        System.out.println("User.setBeanName 方法name="+s);
    }

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("User.setBeanFactory方法，beanFactory="+beanFactory);
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("User.setApplicationContext方法 appicationContext="+applicationContext);
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("User.afterPropertiesSet 方法");
    }

    private void userInit() {
        System.out.println("User.userInit方法");
    }

    public void destroy() throws Exception {
        System.out.println("User.destroy方法");
    }

    private void userDestory() {
        System.out.println("User.userDestory方法");
    }


}
