package com.tourism.common;

import com.fasterxml.jackson.annotation.JsonInclude;



/**
 * HttpResult 所有Controller返回值都基层此基类
 * @author yb
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HttpResult<T> {
    private Integer code;
    private String msg;
    private T data;

    public HttpResult() {
        this.code = 200;
        this.msg = "成功";
        this.data = (T)new Object();
    }

    public HttpResult(T data) {
        this.code = 200;
        this.msg = "成功";
        this.data = data;
    }

    public HttpResult(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
        this.data = (T)new Object();
    }


    public HttpResult(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
