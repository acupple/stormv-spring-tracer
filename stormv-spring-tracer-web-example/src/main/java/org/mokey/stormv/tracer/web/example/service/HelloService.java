package org.mokey.stormv.tracer.web.example.service;

import org.mokey.stormv.tracer.web.example.repository.HelloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: holyeye
 */

@Service
public class HelloService {

    @Autowired
    HelloRepository helloRepository;

    public String hello(String name) {
        helloRepository.helloQuery();
        return "hello " + name;
    }

    public String helloException() throws Exception {
        throw new Exception("강제 예외");
    }
}
