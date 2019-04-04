package com.imooc.firstappdemo.exception;

import com.imooc.firstappdemo.util.IMoocJSONResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author Action
 * @Description:
 * @Date Create in 2019/4/3 11:05
 */
//@RestControllerAdvice
public class IMoocAjaxExceptionHandler {
    //@ExceptionHandler(value = Exception.class)
    public IMoocJSONResult defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception {

        e.printStackTrace();
        return IMoocJSONResult.errorException(e.getMessage());
    }
}
