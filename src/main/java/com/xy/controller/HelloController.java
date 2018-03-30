package com.xy.controller;

import com.xy.properties.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/*
* @author XY
* 这个类要通过web访问的话要加一个注解@RestController
* */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private GirlProperties girlProperties;

   // @RequestMapping(value = "/say",method = RequestMethod.GET)
    //@GetMapping(value = "/say")
    @PostMapping(value = "/say")
    public String say(@RequestParam(value = "id",required = false,defaultValue = "0") Integer myId){
        return "id:" + myId;
        //return "index";
        //return girlProperties.getPrettyLevel();
        //return content;
        //return prettyLevel + age;
        //return "Hello Spring Boot!";
    }
}
