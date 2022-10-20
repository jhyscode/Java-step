package com.allen.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：jhys
 * @date ：Created in 2021/8/31 16:54
 * @Description ：
 */
public class Animal {
    public void eat(){
        System.out.println("animal eatting...");
    }
}
class Bird extends Animal{

    public void eat(){
        System.out.println("bird eatting...");
    }

    public void fly(){

        System.out.println("bird flying...");
    }
}

class Main {
    public static void main(String[] args) {
      List<Animal> animals = new ArrayList<>();
      List<Bird> birds = new ArrayList<>();
    }
}