package com.wqy.boot;

import com.wqy.boot.bean.Pet;
import com.wqy.boot.bean.User;
import com.wqy.boot.config.MyConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
        String[] names = run.getBeanDefinitionNames();
        for(String name:names){
            System.out.println(name);
        }
//        //从容器中获取组件
//        Pet tom01 = run.getBean("tom", Pet.class);
//        Pet tom02 = run.getBean("tom", Pet.class);
//
//        System.out.println("组件："+(tom01==tom02));
//
//        MyConfig bean = run.getBean(MyConfig.class);
//        System.out.println(bean);
//
//        User user01 = bean.user01();
//        User user02 = bean.user01();
//        System.out.println("组件："+(user01==user02));
//
//        User user011 = run.getBean("user01", User.class);
//        Pet pet = run.getBean("tom", Pet.class);
//        System.out.println(pet == user011.getPet());

        boolean user01 = run.containsBean("user01");
        System.out.println(user01);
    }
}
