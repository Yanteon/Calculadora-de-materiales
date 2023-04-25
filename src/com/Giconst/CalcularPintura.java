package com.Giconst;

import java.util.Scanner;

public class CalcularPintura {
    public static void main(String[] args) {
    }
    public static void calcularPintura(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese el largo del muro a pintar");
        double largoMuro = entrada.nextDouble();

        System.out.println("ingrese el alto del muro a pintar");
        double altoMuro = entrada.nextDouble();


        double superficieMuroAPintar = CalcularSuperficie.calcularSuperficie(largoMuro, altoMuro);

        System.out.println("se necesita " + (superficieMuroAPintar/6) + " litros de pintura");
    }
}
