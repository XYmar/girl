package com.xy.girl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/*
* @author XY
* 这个类要通过web访问的话要加一个注解@RestController
* */
@RestController
public class HelloController {

    @Value("${prettyLevel}")
    private String prettyLevel;      //通过注解把配置文件中的值注入到这个变量里了

    @Value("${age}")
    private Integer age;

    @Value("${content}")
    private String content;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String say(){
        return content;
        //return prettyLevel + age;
        //return "Hello Spring Boot!";
    }
}
