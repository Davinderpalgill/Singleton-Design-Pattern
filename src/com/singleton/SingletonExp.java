package com.singleton;

public class SingletonExp {
    private static SingletonExp single;

    private SingletonExp(){}

    public static SingletonExp getObject(){
        return new SingletonExp();
    }

    public void display(){
        System.out.println("in singleton class");
    }
}
