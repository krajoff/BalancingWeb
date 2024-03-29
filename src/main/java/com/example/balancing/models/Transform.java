package com.example.balancing.models;

import static java.lang.Math.cos;
import static java.lang.Math.sin;

public class Transform {
    public static Complex toComplex(double magnitude, double phase) {
        double re = magnitude*cos(Math.toRadians(phase));
        double im = magnitude*sin(Math.toRadians(phase));
        return new Complex(re, im);
    }

    public static Complex toComplex() {
        return toComplex(0,0);
    }
}
