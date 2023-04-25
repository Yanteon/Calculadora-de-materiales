package com.Giconst;

import java.util.Scanner;

public class CalcularTecho {
    public static void main(String[] args) {
    }
    public static void calcularTecho(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese el largo del techo");
        short largoTecho = entrada.nextShort();

        System.out.println("ingrese el ancho del techo");
        short anchoTecho = entrada.nextShort();

        System.out.println("por metro cuadrado de techo se necesita "+(33*largoTecho)+" kg de cemento, "+(0.072 * largoTecho)+" m3 de arena, "
                +(0.072*largoTecho)+" m2 de piedra, "+(7*largoTecho)+" m de hierro del 8 y "+(4*largoTecho)+" m de hierro del 6" );
    }
}
