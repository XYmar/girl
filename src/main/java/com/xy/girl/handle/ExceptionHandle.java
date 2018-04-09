package com.xy.girl.handle;

import com.xy.girl.domain.Result;
import com.xy.girl.exception.GirlException;
import com.xy.girl.utils.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Author:XY
 * Date:2018/4/9 10:28
 * Description: 异常捕获
 */
@ControllerAdvice
public class ExceptionHandle {

    private  final static Logger logger = LoggerFactory.getLogger(ExceptionHandle.class);

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handle(Exception e){
        if(e instanceof GirlException){//判断异常是不是我们自己捕获的girl的exception
            GirlException girlException = (GirlException) e;
            return ResultUtil.error(girlException.getCode(),e.getMessage());

        }else{
            logger.error("【系统异常】{}",e);
            return ResultUtil.error(-1,"未知错误");
        }

    }
}
