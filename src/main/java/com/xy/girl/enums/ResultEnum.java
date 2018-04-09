package com.xy.girl.enums;

/**
 * Author:XY
 * Date:2018/4/9 11:24
 * Description: 将异常码与异常信息统一管理起来
 */
public enum ResultEnum {

    UNKNOWN_ERROR(-1,"未知错误"),
    SUCCESS(0,"成功"),
    PRIMARY_SCHOOL(100,"小学"),
    MIDDLE_SCHOOL(101,"初中"),
    ;
    private Integer code;
    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
