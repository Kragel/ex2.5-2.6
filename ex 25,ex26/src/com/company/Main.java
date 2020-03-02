package com.company;

public class Main {

    public static void main(String[] args) {
    Dog t1 = new Dog("Spot ", "Ruff!");
    Dog t2 = new Dog("Scruffy ","Wurf!");
    Dog t3 = new Dog("Cveta ", "Lol!");
    t1.displey();
    t2.displey();
    t3.displey();
    System.out.println(t1.equals(t3));
    System.out.println(t2==t3);
    System.out.println(t2.equals(t3));
    System.out.println(t2==t1);
    }

}
