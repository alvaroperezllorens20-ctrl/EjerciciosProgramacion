package org.example;

import java.util.Scanner;

public class Ejercicio3 {
    static void main() {
        final int condicion = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un numero: ");
        int num= teclado.nextInt();
        if (num>condicion){
            System.out.println("El numero introducido: " +num + " es positivo");
        }else if (num<condicion){
            System.out.println("El numero introducido: " +num + " es negativo");
        }else{
            System.out.println("El numero introducido: " +num + " es natural");
        }
    }
}
