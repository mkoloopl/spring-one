package com.csm;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import javax.annotation.Resource;

@Configuration
//@Import({UserDaoConfig.class, UserServiceConfig.class})
@ComponentScan("com.csm")
public class AppConfig {

}
