package com.example.laba1_zaybert.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context=
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Employee employee=context.getBean("myEmployee", Employee.class);
        employee.callYourPet();
        employee.callYourCar();

        System.out.println(employee.getName());
        System.out.println(employee.getAge());



    }
}
