package com.example.Excptional;

import com.example.Utils.CodeEnum;

public class RusultExceptional extends RuntimeException {

    private Integer code;

    public RusultExceptional(CodeEnum codeEnum){
        super(codeEnum.getMsg());
        this.code=codeEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
