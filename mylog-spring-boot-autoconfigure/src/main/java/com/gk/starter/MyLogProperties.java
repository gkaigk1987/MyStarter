package com.gk.starter;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Description: TODO
 * @Author: GK
 * @Date: 2019/9/21
 */
@Component
@ConfigurationProperties(prefix = "mylog")
public class MyLogProperties {

    private String name;

    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "MyLogProperties{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
