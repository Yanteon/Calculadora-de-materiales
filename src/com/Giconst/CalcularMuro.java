package com.Giconst;

import java.util.Scanner;

public class CalcularMuro {
    public static void main(String[] args) {
    }
    public static void calcularMuro(){
        Scanner entrada = new  Scanner (System . in);
        System.out.println("¿cuanto sera el espesor del muro, 20 o 30 cm?");
        double espesorMuro = entrada.nextDouble();


        while (espesorMuro != 30 && espesorMuro != 20){
            System.out.println("elija entre 20 y 30 cm de espesor por favor");
            espesorMuro = entrada.nextDouble();
        }
        if (espesorMuro == 20 || espesorMuro == 30){
            System.out.println("¿Cuanto es el largo del muro?"); //considerar el largo del muro en metros
            double largoMuro = entrada.nextDouble();
            System.out.println("¿Cuanto es el alto del muro?");
            double altoMuro = entrada.nextDouble();

            double superficieMuro = CalcularSuperficie.calcularSuperficie(largoMuro, altoMuro);
            System.out.println("la superficie del muro es " + superficieMuro + " m2.");


            System.out.println("¿quiere hacer el calculo de los materiales?\n"+"Ingrese 1 para continuar\n"+"Ingrese 2 para omitir el calculo de los materiales");
            byte numero = entrada.nextByte();

            if(numero == 1){
                if (espesorMuro == 20){
                    System.out.println("Necesitaremos por metro cuadrado: " + (10.9 * superficieMuro) +
                            " kg de cemento, " + (0.09*superficieMuro) + " m3 de arena "+ " y "+ (90*superficieMuro) +" ladrillos.");
                }else{
                    System.out.println("Necesitaremos por metro cuadrado: " + (15.2 * superficieMuro) +
                            " kg de cemento, " + (0.115*superficieMuro) + " m3 de arena "+ " y "+ (120*superficieMuro) +" ladrillos.");
                }
            }


        }

    }

}
