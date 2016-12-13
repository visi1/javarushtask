package com.javarush.test;

/**
 * Created by gulin_ma on 13.12.2016.
 */
public class person extends Test1 {

    private String name;
    private int age;
    private String childName;

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

    public String getChildName() {
        return childName;
    }

    public void setChildName(String childName) {
        this.childName = childName;
    }

    @Override
    public String toString() {
        return name + age + childName;
    }
}
