package cn.alenc.birthdaymanagement.config;

import cn.alenc.birthdaymanagement.Result;
import cn.alenc.birthdaymanagement.enums.StatusCode;
import org.springframework.mail.MailException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.mail.MessagingException;
import javax.servlet.http.HttpServletResponse;

/**
 * 全局异常处理类
 */
@ControllerAdvice
public class ExceptionHandle {

    /**
     * 全局异常处理
     * @param e
     * @param resp
     * @return
     */
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Result exceptionHandle(Exception e,HttpServletResponse resp){
        if(e instanceof MailException || e instanceof MessagingException){
            resp.setStatus(535);
            return new Result(StatusCode.ERROR_CODE_535,"邮件认证失败",e.getMessage());
        }
        resp.setStatus(400);
        return new Result(StatusCode.ERROR_CODE_400,"请求异常",e.getMessage());
    }
}
