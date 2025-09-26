package org.example;

import java.util.Scanner;

public class Ejercicio2 {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        final int Jornada = 40;
        final double extra = 1.5;
        System.out.println("Dime el numero de horas que trabajas: ");
        int horas = teclado.nextInt();
        System.out.println("Dime la tarifa por hora: ");
        double tarifa = teclado.nextDouble();


        if (horas>Jornada){
            double extras = horas - Jornada;
            double tarifa_extra = tarifa * extra;
            double salario_extra = extras * tarifa_extra;

            System.out.println("Salario(con extra): " + (salario_extra + (Jornada*tarifa)));
        }else{
            double salario = horas * tarifa;
            System.out.println("El salario bruto es: "+ salario + "€");
        }
    }
}
