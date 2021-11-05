package com.example.laba1_zaybert.spring_introduction;

public class Employee {
    private Car car;
    private Pet pet;
    private String name;
    private int age;

    public void setPet(Pet pet) {this.pet = pet; }

    public void setCar(Car car){this.car = car;}

    public void setName(String name) {this.name = name; }

    public void setAge(int age) {this.age = age; }

    public String getName() {return name; }

    public int getAge() {return age; }

    public void callYourPet(){

        System.out.println("Кис-кис!");
        pet.say();
    }
    public void callYourCar(){
        System.out.println("Бип-бип!");
        car.info();
    }
    public Employee(){

    }
}
