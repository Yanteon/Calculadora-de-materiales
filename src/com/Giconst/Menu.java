package com.Giconst;
//en esta clase se tendra el menu y donde el usuario podra seleccionar la operacion a realizar
import java.util.Scanner;
public class Menu {
    public static void main(String[] args) {

    }
    public static void menu(){
        Scanner  entrada = new  Scanner (System . in);

        System.out.println("seleccione una opcion\n"+"1. Calcular muro de ladrillo\n" +
                "2. Calcular viga de hormigón\n" +
                "3. Calcular columnas de hormigón\n" +
                "4. Calcular contrapisos\n" +
                "5. Calcular techo\n" +
                "6. Calcular pisos\n" +
                "7. Calcular pintura\n" +
                "8. Calcular iluminación\n" +
                "9. Salir");

        byte seleccion = entrada.nextByte();
        switch (seleccion){
            case 1:
                CalcularMuro.calcularMuro();
                break;
            case 2:
                CalcularViga.calcularViga();
                break;
            case 3:
                CalcularColumna.calcularColumna();
                break;
            case 4:
                CalcularContrapisos.calcularContrapisos();
                break;
            case 5:
                CalcularTecho.calcularTecho();
                break;
            case 6:
                CalcularPisos.calcularPisos();
                break;
            case 7:
                CalcularPintura.calcularPintura();
                break;
            case 8:
                CalcularIlimunacion.calcularIluminacion();
                break;
            case 9:
                break;

        }

    }

}
