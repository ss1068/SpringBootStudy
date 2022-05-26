package com.wqy.boot.Controller;

import com.wqy.boot.bean.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    Car car;
    @RequestMapping("/hello")
    public String helloBoot(){
        return "Hello!Spring boot 2!";
    }
    @RequestMapping("/car")
    public Car car(){
        return car;
    }
}
