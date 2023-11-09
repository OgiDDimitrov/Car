package com.company;

public class Car extends Vehicle {
    private int hp;

    @Override
    public void drive (double speed) {
        System.out.println("We are driving a car " + toString() + "with " + speed);
    }

    @Override
    public String toString() {
        return "Car{" + super.toString() +
                "hp=" + hp +
                '}';
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
