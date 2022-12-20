package com.kj.Interfaces.Example;

public class Bike implements Engine, Brake, MediaPlayer {
    @Override
    public void brake() {
        System.out.println(" i brake like normal Bike");
    }

    @Override
    public void start() {
        System.out.println(" i Start like normal Bike");
    }

    @Override
    public void stop() {
        System.out.println(" i stop like normal Bike");
    }

    @Override
    public void acc() {
        System.out.println(" i accelerate like normal Bike");
    }

}
