package com.jejakin.utils;

public enum TestScenarios {
    T1("User Choose Route"),
    T2("User choose program payment");

    private String testCaseName;

    TestScenarios(String value){
        testCaseName = value;
    }

    public String getTestCaseName(){
        return testCaseName;
    }
}
