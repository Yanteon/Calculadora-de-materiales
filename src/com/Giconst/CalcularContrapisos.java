package com.Giconst;

import java.util.Scanner;

public class CalcularContrapisos {
    public static void main(String[] args) {
    }
    public static void calcularContrapisos(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese el espesor del contrapisos");
        int esperor = entrada.nextShort();

        System.out.println("ingrese el ancho del contrapisos");
        int ancho = entrada.nextShort();

        System.out.println("ingrese el volumen del contrapisos");
        int largo = entrada.nextShort();

        int volumen = esperor * largo * ancho;
        System.out.println("Por metro cúbico de contrapiso se necesita: "+(105*volumen)+" kg de cemento,"+(0.45*volumen)+ " m3 de arena y " + (0.9*volumen)+ " m3 de piedra.");

    }
}
