package com.example.Utils;


/**
 * 返回状态枚举类
 */
public enum CodeEnum {
    SUCCESS(1,"请求成功"),
    ERROR(0,"请求失败"),
    PARAMETER_ERROR(2,"参数错误"),
    ;

    private Integer code;
    private String msg;

    CodeEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }


    public String getMsg() {
        return msg;
    }

}
