package org.mokey.stormv.tracer.web.example.controller;

import org.mokey.stormv.tracer.web.example.exception.ControllerAdviceCatchException;
import org.mokey.stormv.tracer.web.example.exception.ExceptionHandlerCatchException;
import org.mokey.stormv.tracer.web.example.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * @author: holyeye
 */
@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @RequestMapping("test")
    public String test() {
        return helloService.hello("holyeye");
    }

    @RequestMapping("test-body")
    public String testBody(@RequestBody String body) {
        return helloService.hello(body);
    }

    @RequestMapping("exception")
    public String exception() throws Exception {
        return helloService.helloException();
    }

    @RequestMapping("exception-catch")
    public String exceptionCatch() {

        try {
            return helloService.helloException();
        } catch (Exception e) {
        }

        return "exception catch!";
    }

    @RequestMapping("controller-advice")
    public String controllerAdviceCatchException() throws Exception {
        throw new ControllerAdviceCatchException();
    }

    @RequestMapping("exception-handler")
    public String exceptionHandlerCatchException() throws Exception {
        throw new ExceptionHandlerCatchException();
    }

    @RequestMapping("exception-to-ok")
    public String exceptionBut200OK() throws Exception {
        throw new IllegalAccessException();
    }

    @ExceptionHandler
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public String handleException(IllegalAccessException ex) {
        return ex.getMessage();
    }

    @ExceptionHandler
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ResponseBody
    public String handleException(ExceptionHandlerCatchException ex) {

        return ex.getMessage();
    }

}
