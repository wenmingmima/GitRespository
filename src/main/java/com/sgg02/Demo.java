package com.sgg02;

import org.junit.Test;

import javax.lang.model.element.VariableElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapters;
import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.*;
import java.util.function.*;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @Author: shigg
 * @Date: 2021/6/24 15:27
 * @Description: com.sgg02
 * version: 1.0
 */

public class Demo {
    List<User> users = Arrays.asList(
            new User("张三", 18),
            new User("李四", 19),
            new User("王五", 11),
            new User("赵六", 12),
            new User("冯七", 40),
            new User("张三", 18),
            new User("高八", 23)
    );

    @Test
    public void test01(){
        users.stream()
                .distinct()
                .forEach(System.out::println);
    }

}
