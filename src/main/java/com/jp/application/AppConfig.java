package com.jp.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.util.CollectionUtils;

@Configuration
//@Import({UserDaoConfig.class, UserServiceConfig.class})
@ComponentScan("com.jp")
public class AppConfig {

    @EventListener
    public void refreshListener(ContextRefreshedEvent event){
        System.out.println(event.getTimestamp());
        ApplicationContext context = event.getApplicationContext();
        CollectionUtils.arrayToList(context.getBeanDefinitionNames()).forEach(item -> System.out.println(item));
    }

}
