package org.mokey.stormv.tracer.web.example.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @author: holyeye
 */
@Service
public class HelloAsyncService {

    @Async
    public void asyncHello() {
    }
}
