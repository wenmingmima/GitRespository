package com.sgg02;

import java.util.Objects;

/**
 * @Author: shigg
 * @Date: 2021/6/24 16:49
 * @Description: com.sgg02
 * version: 1.0
 */
public class User {
    private String name ;
    private int age ;

    public User() {
        System.out.println("空参的构造方法");
    }
    public User(String name) {
        System.out.println("一个参数的构造方法");
        this.name = name;
    }

    public User(String name, int age) {
        System.out.println("两个参数的构造方法");
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()) {return false;}
        User user = (User) o;
        return age == user.age &&
                Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
