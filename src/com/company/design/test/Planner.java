package com.company.design.test;

import java.util.Scanner;

public class Planner {
    Scanner sc = new Scanner(System.in);
    private int n = 5;
    private String name;
    private int age;
    private String purpose;
    private String[] mon = new String[n];

    private Planner(){};

    public Planner (String name, int age, String purpose) {
        this.name = name;
        this.age = age;
        this.purpose = purpose;
    }


    public void addSchedule(){

    }
}
