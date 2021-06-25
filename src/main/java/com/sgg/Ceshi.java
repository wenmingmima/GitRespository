package com.sgg;

import java.sql.SQLOutput;

/**
 * @Author: shigg
 * @Date: 2021/6/24 11:35
 * @Description: com.sgg
 * version: 1.0
 */
public class Ceshi {
    public static void main(String[] args) {

        LambdaTest lambdaTest = ()-> "Lambda表达式返回值name:" ;


        String result = lambdaTest.show();
        System.out.println(result);

    }
}
