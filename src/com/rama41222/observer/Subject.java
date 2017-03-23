/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rama41222.observer;

import com.rama41222.observer.thermometer.TemperatureListner;
import com.rama41222.observer.thermometer.Thermometer;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rama41222
 */
public class Subject implements TemperatureListner {

    private final static List<Observer> observers = new ArrayList<>();
    private static final Subject s = new Subject();
    private static final Thermometer tmo = new Thermometer(s);
    double temp;

    private Subject() {
    }

    public static void startThermo() {
        Thread task = new Thread() {
            @Override
            public void run() {
                tmo.run();
            }
        };
        task.start();
    }

    public static Subject getInstance() {
        return s;
    }

    public void setObserver(Observer s) {
        observers.add(s);
    }

    public double getState() {
        return this.temp;
    }

    public void notifyObservers() {
        observers.stream().forEach((ob) -> {
            ob.valueChange(this.temp);
        });
    }

    @Override
    public void newTemperature(double temp) {
        this.temp = temp;
        notifyObservers();
    }
}
