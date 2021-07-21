package com.company;

public enum MathConstance {
    PI(1 * Math.PI),
    PYTHAGORASCONSTANT(1 * Math.sqrt(2)),
    THEODORUSCONSTANT( 1 *Math.sqrt(3)),
    IMAGINARYUNIT(1 * Math.sqrt(-1)),
    AVOGARDONUMBER(6.02214076 * Math.pow(10, 23));

    private  final double number;

    MathConstance(double number){
        this.number = number;
    }

    public double getNumber() {
        return number;
    }
}

