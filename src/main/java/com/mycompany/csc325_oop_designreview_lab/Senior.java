package com.mycompany.csc325_oop_designreview_lab;

public class Senior extends Student {
    private static final int MIN_CREDITS = 85;


    private final int Credits;
    public Senior(String name, short age, double Gpa , int Credits){
        super(name, age, Gpa);
        if (Credits < MIN_CREDITS){
            throw new IllegalArgumentException("Senior students must have at least " + MIN_CREDITS + " Credits.");
        }
        this.Credits = Credits;


    }
@Override
    public String toString(){
        return super.toString() + ", Credits:" + Credits;
    }
}
