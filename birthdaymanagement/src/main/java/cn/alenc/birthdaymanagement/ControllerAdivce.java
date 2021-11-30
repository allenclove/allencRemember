package cn.alenc.birthdaymanagement;

import cn.alenc.birthdaymanagement.enums.StatusCode;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ControllerAdivce {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Result bindException(MethodArgumentNotValidException e){
        return new Result(StatusCode.ERROR_CODE_777,e.getBindingResult().toString(),"");
    }
}
