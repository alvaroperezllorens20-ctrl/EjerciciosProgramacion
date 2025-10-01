package org.example;

import java.util.Scanner;

public class Ejercicio4 {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        int num1=0;
        int num2=0;
        int num3=0;
        try {
            System.out.println("Dime un numero: ");
            num1 = teclado.nextInt();
            System.out.println("Dime otro numero: ");
            num2 = teclado.nextInt();
            System.out.println("Dime otro numero");
            num3 = teclado.nextInt();
        }catch (Exception err){
            System.out.println("ERROR: Debes de introducir numeros");
        }
        if (num1==num2 || num2==num3 || num3==num1){
            System.out.println("ERROR: hay números introducidos que son iguales");
        }else {
            if (num1 < num2 && num1 < num3) {
                System.out.println("El: " + num1 + " es el minimo");
            } else if (num2 < num1 && num2 < num3) {
                System.out.println("El: " + num2 + " es el minimo");
            } else {
                System.out.println("El: " + num3 + " es el minimo");
            }
        }
    }
}
