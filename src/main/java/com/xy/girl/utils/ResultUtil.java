package com.xy.girl.utils;

import com.xy.girl.domain.Result;

/**
 * Author:XY
 * Date:2018/4/8 13:55
 * Description:
 */
public class ResultUtil {

    //成功并返回对象信息
    public static Result success(Object object){
        Result result = new Result();
        result.setCode(0);
        result.setMsg("成功");
        result.setData(object);
        return result;
    }

    //成功但不返回对象信息
    public static Result success(){
        return success(null);
    }

    //失败并返回失败信息
    public static Result error(Integer code,String msg){
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
}
