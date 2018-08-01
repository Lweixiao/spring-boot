package com.example.Handle;

import com.example.Excptional.RusultExceptional;
import com.example.Utils.Result;
import com.example.Utils.ResultUtils;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ExcptionHandle {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handle(Exception e){
        if(e instanceof RusultExceptional){
            RusultExceptional rusultExceptional = (RusultExceptional) e;
            return ResultUtils.Error(rusultExceptional.getCode(), rusultExceptional.getMessage());
        }else{
            return ResultUtils.Error(-1,"未知异常");
        }
    }
}
