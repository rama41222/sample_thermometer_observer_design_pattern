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
public class SubscriberFarenheit extends Observer {

    public SubscriberFarenheit(Subject s) {
        this.subject = s;
        this.subject.setObserver(this);
    }

    @Override
    public void valueChange(double temp) {
        System.out.println("Temperature in Farenheit " + temp);
    }

}
