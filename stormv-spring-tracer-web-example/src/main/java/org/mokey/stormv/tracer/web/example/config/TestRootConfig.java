package org.mokey.stormv.tracer.web.example.config;

import org.mokey.stormv.tracer.annotations.EnableTrace;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @author: holyeye
 */

@Configuration
@EnableAsync
@EnableTrace(basePackages = "org.mokey.stormv.tracer.web.example")
@ComponentScan(basePackages = {"org.mokey.stormv.tracer.web.example.repository", "org.mokey.stormv.tracer.web.example.service"})
public class TestRootConfig {
}
