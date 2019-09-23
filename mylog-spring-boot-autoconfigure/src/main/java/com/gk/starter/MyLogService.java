package com.gk.starter;

/**
 * @Description: TODO
 * @Author: GK
 * @Date: 2019/9/21
 */
public class MyLogService {

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

    public MyLogService() {
    }

    public MyLogService(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getInfo() {
        return String.format("[name = %s, age = %d]", this.name, this.age);
    }
}
