package com.gk.starter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description: TODO
 * @Author: GK
 * @Date: 2019/9/21
 */
@Configuration
@ConditionalOnClass(value = {MyLogService.class})
@EnableConfigurationProperties(value = {MyLogProperties.class})
public class MyLogAutoConfiguration {

    @Autowired
    private MyLogProperties myLogProperties;

    @Bean
    @ConditionalOnMissingBean
    public MyLogService myLogService() {
        return new MyLogService(myLogProperties.getName(),myLogProperties.getAge());
    }
}
