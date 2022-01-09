package com.github.codeqingkong.common;

import java.io.Serializable;
import java.util.LinkedHashMap;

/**
 * @author qingkong
 * @date 2022/1/9
 */
public class Result extends LinkedHashMap<String, Object> implements Serializable {
    private static final long SERIALIZATION_VERSION_UID = 1L;

    public static final int CODE_SUCCESS = 200;
    public static final int CODE_ERROR = 500;

    public Result(int code, String msg, Object data) {
        this.setCode(code);
        this.setMsg(msg);
        this.setData(data);
    }

    public Integer getCode() {
        return (Integer) this.get("code");
    }

    public String getMsg() {
        return (String) this.get("msg");
    }

    public Object getData() {
        return this.get("data");
    }

    public Result setCode(int code) {
        this.put("code", code);
        return this;
    }

    public Result setMsg(String msg) {
        this.put("msg", msg);
        return this;
    }

    public Result setData(Object data) {
        this.put("data", data);
        return this;
    }

    public static Result ok() {
        return new Result(CODE_SUCCESS, "ok", null);
    }

    public static Result error(String msg) {
        return new Result(CODE_ERROR, msg, null);
    }

    public static Result data(Object data) {
        return new Result(CODE_SUCCESS, "ok", data);
    }

    @Override
    public String toString() {
        return "{"
                + "\"code\": " + this.getCode()
                + ", \"msg\": \"" + this.getMsg() + "\""
                + ", \"data\": \"" + this.getData() + "\"";

    }
}
