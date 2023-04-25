package com.Giconst;

import java.util.Scanner;

public class CalcularIlimunacion {
    public static void main(String[] args) {

    }
    public static void calcularIluminacion(){
        Scanner entrada = new Scanner(System.in);

        System.out.println("ingresar el largo de la habitacion");
        int largohabitacion = entrada.nextInt();
        System.out.println("ingresar el ancho de la habitacion");
        int anchohabitacion = entrada.nextInt();

        double superficieHabitacion = CalcularSuperficie.calcularSuperficie(largohabitacion,anchohabitacion);

        System.out.println((superficieHabitacion*0.2)+" Eso nos da la cantidad mínima de superficie de iluminación natural (ventanas y puertas de vidrio)");

    }

}
