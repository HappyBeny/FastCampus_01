package com.company.design.test;

public class PlannerTestMain {
    public static void main(String[] args) {
        Planner P1 = new Planner("방동혁", 32, "테스트용");
        P1.changeStatus("방동혁", 32, "정보수정");

        P1.addSchedule();
    }
}
