package com.singleton;

public class SingletonMain {
    public static void main(String[] args) {
        SingletonExp exp = SingletonExp.getObject();
        exp.display();
    }
}
