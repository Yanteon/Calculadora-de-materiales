package com.Giconst;

import java.util.Scanner;

public class CalcularViga {
    public static void main(String[] args) {
    }
    public static void calcularViga(){
        Scanner  entrada = new Scanner(System.in);
        System.out.println("ingrese el largo de la viga");
        short largoViga = entrada.nextShort();
        System.out.println("se necesita "+(9*largoViga)+" kg de cemento, "+(0.02 * largoViga)+" m3 de arena, "
                +(0.02*largoViga)+" m2 de piedra, "+(4*largoViga)+" m de hierro del 8 y "+(3*largoViga)+" m de hierro del 4" );
    }
}
