package com.company;

public class Truck extends Vehicle {
    private int weight;

    @Override
    public void drive (double speed) {
        System.out.println("We are driving " + this.toString() + " with" + speed);
    }

    @Override
    public String toString() {
        return "Truck{" +
                "make=" + getMake() + " " +
                "model=" + getModel() + " " +
                "yearProduction=" + getYearProduction() + " " +
                "weight=" + getWeight() +
                '}';
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
