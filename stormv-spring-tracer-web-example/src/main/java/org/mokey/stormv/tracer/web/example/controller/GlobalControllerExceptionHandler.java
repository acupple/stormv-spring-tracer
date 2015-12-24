package org.mokey.stormv.tracer.web.example.controller;

import org.mokey.stormv.tracer.web.example.exception.ControllerAdviceCatchException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author: holyeye
 */
@ControllerAdvice
public class GlobalControllerExceptionHandler {

    @ExceptionHandler
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ResponseBody
    public String handleException(ControllerAdviceCatchException ex) {
        return ex.getMessage();
    }
}
