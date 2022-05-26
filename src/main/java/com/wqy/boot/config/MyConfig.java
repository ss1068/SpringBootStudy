package com.wqy.boot.config;


import com.wqy.boot.bean.Pet;
import com.wqy.boot.bean.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = true)  //告诉springBoot这是一个配置类 == 配置文件
//bean注解创建的默认是单实例对象
//如果@Configuration(proxyBeanMethods = true)代理对象调用方法。SpringBoot总会检查这个组件是否在容器中有
//有就直接拿，没有就会创建一个新的,达到保持组件单实例的目的
public class MyConfig {
    @Bean("tom")
    public Pet tomcatPet(){
        return new Pet("tomcat");
    }

    //外部无论对配置类中的这个方法调用多少次，生成的都是之前注册容器中的单实例对象
    @ConditionalOnBean(name = "tom")
    @Bean  //给容器中添加组件，以方法名为组件id
    public User user01(){
        User user01 = new User("xiaogong", 18);
        user01.setPet(tomcatPet());
        return user01;
    }


}
