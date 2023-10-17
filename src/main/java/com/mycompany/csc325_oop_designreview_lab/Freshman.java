package com.mycompany.csc325_oop_designreview_lab;

public class Freshman extends Student {

    private final int Credits;
    public Freshman(String name, short age, double Gpa,  int Credits){
        super(name,age, Gpa);
        this.Credits = Credits;
    }

    @Override
    public String toString(){
        return super.toString() + ", Credits:" + Credits;
    }

}
