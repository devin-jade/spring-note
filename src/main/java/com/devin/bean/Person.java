package com.devin.bean;

/**
 * <p>
 *
 * </p>
 *
 * @author hkh
 * @since 2020/9/4
 */
public class Person {
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

    private String name ;

    private int age;

    public Person(){
        System.out.println("no param created fund invoke");
    }

    public Person(String name){
        this.name = name;
        System.out.println("person is created ");
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("all param created fun invoke");
    }

    public void print(){
        System.out.println("person method print invoked ");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
