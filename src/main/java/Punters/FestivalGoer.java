package Punters;

import sun.reflect.generics.visitor.Visitor;

public class FestivalGoer {

    private int age;
    private double money;
    private String name;

    public FestivalGoer(int age, double money, String name){
        this.age = age;
        this.money = money;
        this.name = name;
    }

    public int getAge(){ return age;}

    public double getMoney(){
        return money;
    }

    public String getName(){
        return name;
    }


}
