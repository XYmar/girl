package com.xy.girl.controller;

import com.xy.girl.domain.Girl;
import com.xy.girl.domain.Result;
import com.xy.girl.repository.GirlRepository;
import com.xy.girl.service.GirlService;
import com.xy.girl.utils.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class GirlController {

    @Autowired
    private GirlRepository girlRepository;

    @Autowired
    private GirlService girlService;

    private final static Logger logger = LoggerFactory.getLogger(GirlController.class);
    /**
     * 查询所有女生列表
     * */
    @GetMapping(value = "/girls")
    public List<Girl> girlList(){
        logger.info("girlList");
        return girlRepository.findAll();
    }


    /**
     * 添加一个女生
     * */
    @PostMapping(value = "/girls")
    public Result<Girl> girlAdd(@Valid Girl girl, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return null;
            //return ResultUtil.error(1,bindingResult.getFieldError().getDefaultMessage());
        }

        return ResultUtil.success(girlRepository.save(girl));
    }
    /*public Girl girlAdd(@RequestParam("prettyLevel") String prettyLevel,
                          @RequestParam("age") Integer age){
        Girl girl = new Girl();
        girl.setPrettyLevel(prettyLevel);
        girl.setAge(age);
        return girlRepository.save(girl);
    }*/

    /*
     * 查询一个女生
     * */
    @GetMapping(value = "girls/{id}")
    public Girl girlFindOne(@PathVariable("id") Integer id){
        return girlRepository.findById(id).get();
    }

    /*
    * 更新一个女生信息
    * */
    @PutMapping(value = "girls/{id}")
    public Girl girlUpdate(@PathVariable("id") Integer id,
                           @RequestParam("prettyLevel") String prettyLevel,
                           @RequestParam("age") Integer age){
        Girl girl = new Girl();
        girl.setId(id);
        girl.setPrettyLevel(prettyLevel);
        girl.setAge(age);

        return girlRepository.save(girl);
    }

    /*
    * 删除一个女生
    * */
    @DeleteMapping(value = "girls/{id}")
    public void girlDelete(@PathVariable("id") Integer id){
        girlRepository.deleteById(id);
    }

    /*
    * 根据年龄来查询女生信息
    * */
    @GetMapping(value = "/girls/age/{age}")
    public List<Girl> girlByAge(@PathVariable("age") Integer age){
        return girlRepository.findByAge(age);
    }

    /*
    * 插入两条女生信息
    * */
    @PostMapping(value = ("/girls/two"))
    public void girlTwo(){
        girlService.insertTwo();
    }

    /*
    * 根据女生年龄返回不同信息
    * */
    @GetMapping(value = "/girls/getAge/{id}")
    public  void getAge(@PathVariable("id") Integer id) throws Exception{
        girlService.getAge(id);
    }
}
