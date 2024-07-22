package com.company.design.test;

import java.util.Scanner;

public class Planner {
    Scanner scanner = new Scanner(System.in);
    private int purposeNum = 5;
    private String name;
    private int age;
    private String purpose;
    private String[] Mon = new String[purposeNum];
    private String[] Tue = new String[purposeNum];
    private String[] Wed = new String[purposeNum];
    private String[] Thu = new String[purposeNum];
    private String[] Fri = new String[purposeNum];
    private String[] Sat = new String[purposeNum];
    private String[] Sun = new String[purposeNum];

    private Planner(){};

    public Planner (String name, int age, String purpose) {
        this.name = name;
        this.age = age;
        this.purpose = purpose;
    }

    public void changeStatus(String name, int age, String purpose){
        this.name = name;
        this.age = age;
        this.purpose = purpose;
    }
    
    public void setPurposeNum(int num){
        this.purposeNum = num;
    }

    public void addSchedule(){
        System.out.print("계획 수정을 원하는 요일을 세 글자로 입력해주세요(ex_mon) : ");
        String day = scanner.nextLine();
        day = Character.toUpperCase(day.charAt(0)) + day.substring(1);

        System.out.println(day);
    }
}
