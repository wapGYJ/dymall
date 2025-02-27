package com.wapgyj.common.Result;


public class Result<T> {
    private Integer code;
    private T data;
    private String msg;

    public static <T> Result<T> success(T data) {
        return new Result<>(data);
    }

    public static <T> Result<T> fail(Integer code, String msg) {
        return new Result<>(code, null, msg);
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

    public Result(Integer code, T data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    public Result(T data) {
        this.code = 200;
        this.data = data;
        this.msg = "success";
    }

}
