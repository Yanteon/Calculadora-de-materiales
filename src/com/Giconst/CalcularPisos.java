package com.Giconst;

import java.util.Scanner;

//este subproblema calculará cuanto de paño se debe colocar para un piso en base a la superficie
public class CalcularPisos {
    public static void main(String[] args) {
    }
    public static void calcularPisos(){
        //se pide al usuario que ingrese el alto y el ancho
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingresar el largo del paño de piso a colocar");
        int largoPano = entrada.nextInt();

        System.out.println("ingresar el ancho del paño de piso a colocar");
        int anchoPano = entrada.nextInt();


        double superficie = CalcularSuperficie.calcularSuperficie(largoPano, anchoPano);
        System.out.println("La superficie requerida es de "+ superficie + " m2" + " mas el 10% extra por recortes es "+ (superficie + (superficie*0.1))+" m2");
    }

}
