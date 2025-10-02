package org.example;

import java.util.Scanner;

public class Ejercicio3 {
    static void main() {
        final int CONDICION = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un numero: ");
        int num= teclado.nextInt();
        if (num<CONDICION){
            System.out.println("El numero introducido: " +num + " es negativo");
        }else if (num>CONDICION){
            System.out.println("El numero introducido: " +num + " es positivo");
        }else{
            System.out.println("El numero introducido: " +num + " es natural");
        }
    }
}
