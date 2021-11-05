package com.example.laba1_zaybert.spring_introduction;

public class Toyota  implements Car{
    @Override
    public void info(){
        System.out.println("Марка машины - Toyota");
        System.out.println("Объем двигателя - 3000 л");
    }
}
