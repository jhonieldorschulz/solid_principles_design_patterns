package edu.guia.solid.ocp.decorator;

public class ZeroTax implements Tax { public double calculate(Budget b){ return 0; } }
