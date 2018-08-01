package com.example.Utils;

/**
 * 返回结果集
 */
public class Result {

    //返回状态
    private Integer status;
    //返回描述
    private String msg;
    //返回结果
    private Object data;

    public Result() {
    }

    public Result(CodeEnum codeEnum, Object data) {
        this.status = codeEnum.getCode();
        this.msg = codeEnum.getMsg();
        this.data = data;
    }

    public Integer getStatus() {
        return status;
    }

    public Result setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public Result setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public Object getData() {
        return data;
    }

    public Result setData(Object data) {
        this.data = data;
        return this;
    }
}
