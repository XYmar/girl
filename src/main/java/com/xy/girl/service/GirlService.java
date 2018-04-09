package com.xy.girl.service;

import com.xy.girl.domain.Girl;
import com.xy.girl.enums.ResultEnum;
import com.xy.girl.exception.GirlException;
import com.xy.girl.repository.GirlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.criteria.CriteriaBuilder;


@Service
public class GirlService {
    @Autowired
    private GirlRepository girlRepository;

    @Transactional
    public void insertTwo(){
        Girl girlA = new Girl();
        girlA.setAge(18);
        girlA.setPrettyLevel("A");
        girlRepository.save(girlA);

        Girl girlB = new Girl();
        girlB.setAge(20);
        girlB.setPrettyLevel("BBBB");
        girlRepository.save(girlB);
    }

    public void getAge(Integer id) throws Exception{
        Girl girl = girlRepository.findById(id).get();
        Integer ageReal = girl.getAge();

        if(ageReal < 10){
            throw new GirlException(ResultEnum.PRIMARY_SCHOOL);
        }else if(ageReal > 10 && ageReal < 16){
            throw new GirlException(ResultEnum.MIDDLE_SCHOOL);
        }

    }

    /*
    * 通过id去查询一个女生
    * 用于单元测试
    * */
    public Girl findById(Integer id){
        return girlRepository.findById(id).get();
    }
}
