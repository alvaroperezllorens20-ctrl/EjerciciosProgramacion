package org.example;

import java.util.Scanner;

public class ejercicio1 {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime el numero de horas que trabajas: ");
        int horas = teclado.nextInt();
        System.out.println("Dime la tarifa por hora: ");
        double tarifa = teclado.nextDouble();
        double salario = horas * tarifa;
        System.out.println("El salario bruto es: "+ salario + "€");

    }
}
