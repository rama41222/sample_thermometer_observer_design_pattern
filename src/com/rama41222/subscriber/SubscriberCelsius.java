/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rama41222.subscriber;

import com.rama41222.observer.Observer;
import com.rama41222.observer.Subject;

/**
 *
 * @author Rama41222
 */
public class SubscriberCelsius extends Observer {

    public SubscriberCelsius(Subject s) {
        this.subject = s;
        this.subject.setObserver(this);
    }

    @Override
    public void valueChange(double temp) {
        double f = (temp - 32) * 5 / 9;
        double rf = Math.round(f * 100) / 100;
        System.out.println("Temp Celsius " + rf);
    }

}
