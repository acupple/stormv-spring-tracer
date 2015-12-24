package org.mokey.stormv.tracer.web.example.config;

import org.mokey.stormv.tracer.annotations.EnableTrace;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * User: HolyEyE
 */

@Configuration
@EnableWebMvc
@EnableTrace(basePackages = "org.mokey.stormv.tracer.web.example")
@ComponentScan(basePackages = "org.mokey.stormv.tracer.web.example.controller")
public class TestWebConfig extends WebMvcConfigurerAdapter {}
