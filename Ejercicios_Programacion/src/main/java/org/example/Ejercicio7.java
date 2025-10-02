package org.example;

import java.util.Scanner;

public class Ejercicio7 {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Hay jamon?(S/N)");
        char jamon = teclado.next().charAt(0);
        System.out.println("¿Hay aceite?");
        char aceite = teclado.next().charAt(0);
        System.out.println("¿Hay tomate?");
        char tomate = teclado.next().charAt(0);

        if (jamon=='S' && aceite=='S' && tomate=='S'){
            System.out.println("NO HACE FALTA QUE VAYAS A COMPRAR");
        }else {

            System.out.println("TIENES QUE IR A COMPRAR");
        }
    }
}
