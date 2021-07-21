package com.company;

import static java.lang.StrictMath.round;

public class Main {

    public static void main(String[] args) {
	MathConstance PiNumber = MathConstance.PI;
	MathConstance PythagorasConstant = MathConstance.PYTHAGORASCONSTANT;
	MathConstance TheodorusConstant = MathConstance.THEODORUSCONSTANT;
	MathConstance ImaginaryUnit = MathConstance.IMAGINARYUNIT;
	MathConstance Avogardo = MathConstance.AVOGARDONUMBER;

        System.out.println("The " + PiNumber + " is equal " + PiNumber.getNumber());
		System.out.println("The " + PythagorasConstant + " is equal " + PythagorasConstant.getNumber());
		System.out.println("The " + TheodorusConstant + " is equal " + TheodorusConstant.getNumber());
		System.out.println("The " + ImaginaryUnit + " is equal " + ImaginaryUnit.getNumber());
		System.out.println("The " + Avogardo + " is equal " + Avogardo.getNumber());

    }
}
