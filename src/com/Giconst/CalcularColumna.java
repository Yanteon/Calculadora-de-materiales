package com.Giconst;

import java.util.Scanner;

public class CalcularColumna {
    public static void main(String[] args) {

    }
    public static void calcularColumna(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese el largo de la columna");
        short largoColumna = entrada.nextShort();
        System.out.println("se necesita "+(7.5*largoColumna)+" kg de cemento, "+(0.016 * largoColumna)+" m3 de arena, "
                +(0.016*largoColumna)+" m2 de piedra, "+(6*largoColumna)+" m de hierro del 10 y "+(3*largoColumna)+" m de hierro del 4" );
    }
}
