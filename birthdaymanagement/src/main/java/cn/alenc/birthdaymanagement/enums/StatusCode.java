package cn.alenc.birthdaymanagement.enums;

public enum StatusCode {
    SUCCESS_CODE_200("200","请求成功"),
    ERROR_CODE_535("535","邮件认证失败"),
    ERROR_CODE_777("777","参数校验异常"),
    ERROR_CODE_400("400","请求异常");

    private String code;

    private String message;

    StatusCode(String code,String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "StatusCode{" +
                "code='" + code + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
