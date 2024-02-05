package ru.rudnev.test.java;

import java.util.ArrayList;

public class Box<T extends Fruit> {

    private ArrayList<T> fruits = new ArrayList<>();

    public void addFruit(T fruit){
        fruits.add(fruit);
    }

    public double weight(){
        double weight = 0;
        for (T fruit : fruits){
            weight += fruit.getWeight();
        }
        return weight;
    }

    public boolean compare(Box <?> box){
        return Math.abs(this.weight() - box.weight()) < 0.0001;
    }

    public void transfer(Box <T> box){
        if (this == box){
            return;
        }
        box.fruits.addAll(this.fruits);
        this.fruits.clear();
    }
}
