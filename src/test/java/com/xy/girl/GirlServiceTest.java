package com.xy.girl;

import com.xy.girl.domain.Girl;
import com.xy.girl.service.GirlService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Author:XY
 * Date:2018/4/9 14:47
 * Description: 测试girlService
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class GirlServiceTest {

    @Autowired
    private GirlService girlService;

    @Test
    public void findByIdTest(){
        Girl girl = girlService.findById(8);
        Assert.assertEquals(new Integer(8),girl.getAge());
    }
}
