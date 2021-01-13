package com.dicoding.javafundamental.generics;

class Monitor {
    private String name;
    private double mass;

    public Monitor(String name, double mass) {
        this.name = name;
        this.mass = mass;
    }
    public void print() {
        System.out.println("Monitor " + name + ", mass: " + mass);
    }
}
