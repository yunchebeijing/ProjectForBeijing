package com.ghl.login2.Models;

public class Result<T> {
    private Integer errCode;
    private String errMessage;
    private T data;

    //省略getter和setter
    public void setErrCode(Integer errCode) {
        this.errCode = errCode;
    }

    public void setErrMessage(String errMessage) {
        this.errMessage = errMessage;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Integer getErrCode() {
        return errCode;
    }

    public String getErrMessage() {
        return errMessage;
    }

    public T getData() {
        return data;
    }


    @Override
    public String toString() {
        return "Result{" +
                "errCode=" + errCode +
                ", errMessage='" + errMessage + '\'' +
                ", data=" + data +
                '}';
    }
}