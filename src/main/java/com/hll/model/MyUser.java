package com.hll.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class MyUser {
    private String name;

    private String sex;

    private Integer age;

    public MyUser() {}

    public MyUser(String name, String sex, Integer age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000000; i++) {
            list.add(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }
}
