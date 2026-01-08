package com.silenthill.redbook.entity;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Result<T> {
    private int code;
    private String message;
    private T data;
    private Result(T data){
        this.data = data;
    }
    private Result(int code, String message){
        this.code = code;
        this.message = message;
    }
    private Result(int code, String message, T data){
        this.code = code;
        this.message = message;
        this.data = data;
    }
    public static Result ok(){
        return new Result(0, "success");
    }
    public static <T>Result<T> success(T data){
        return new Result<T>(0, "success", data);
    }
    public static Result ok(String message){
        return new Result(0, message);
    }
    public static Result error(){
        return new Result(1, "error");
    }
    public static Result error(String message){
        return new Result(1, message);
    }
}
