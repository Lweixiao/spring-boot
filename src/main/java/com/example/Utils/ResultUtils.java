package com.example.Utils;

/**
 * 返回结果集
 */
public class ResultUtils {


    public static Result sussecc(Object object){
        Result result = new Result();
        result.setStatus(0);
        result.setMsg("成功");
        result.setData(object);
        return result;
    }
    public static Result Error(Integer code,String msg){
        Result result = new Result();
        result.setStatus(code);
        result.setMsg(msg);
        result.setData(null);
        return result;
    }
}
