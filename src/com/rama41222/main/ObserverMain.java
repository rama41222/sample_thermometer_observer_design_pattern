/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rama41222.main;

import com.rama41222.observer.Subject;
import com.rama41222.subscriber.SubscriberCelsius;
import com.rama41222.subscriber.SubscriberFarenheit;

/**
 *
 * @author Rama41222
 */
public class ObserverMain {

    public static void main(String[] args) {

        Subject subject = Subject.getInstance();
        Subject.startThermo();
        new SubscriberCelsius(subject);
        new SubscriberFarenheit(subject);

        subject.getState();
        subject.getState();
    }
}
