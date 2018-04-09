package com.xy.girl.exception;

import com.xy.girl.enums.ResultEnum;

/**
 * Author:XY
 * Date:2018/4/9 10:55
 * Description: 自己写的异常类,可以自定义异常码
 */
public class GirlException extends RuntimeException {
    //注意，这儿继承的是RuntimeException，不是Exception，因为只有前者才会进行事务回滚，后者不会！
    private Integer code;

    public GirlException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
