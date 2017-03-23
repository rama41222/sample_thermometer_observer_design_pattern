/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rama41222.observer.thermometer;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rama41222
 */
public class Thermometer implements Runnable {

    private TemperatureListner tm;
    private static final Random RAND = new Random();

    public Thermometer(TemperatureListner t) {
        this.tm = t;
    }

    @Override
    public void run() {

        while (true) {

            try {
                Thread.sleep(3000);
                int no = RAND.nextInt(105 - 90) + 90;
                tm.newTemperature(no);
            } catch (InterruptedException ex) {
                System.err.println(ex.getMessage());;
            }
        }
    }

}
