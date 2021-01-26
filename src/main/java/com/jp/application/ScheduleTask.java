package com.jp.application;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class ScheduleTask implements InitializingBean {

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("scheduleTask init finish");
    }

}
