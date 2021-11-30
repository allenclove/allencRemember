package cn.alenc.birthdaymanagement;

import cn.alenc.birthdaymanagement.enums.StatusCode;


public class Result {

    private Enum<StatusCode> code;

    private String msg;

    private Object data;

    public Result() {
    }

    public Result(Enum<StatusCode> code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    @Override
    public String toString() {
        return "Result{" +
                "code=" + code.toString() +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }

    public Enum<StatusCode> getCode() {
        return code;
    }

    public void setCode(Enum<StatusCode> code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
