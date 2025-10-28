package org.example;

import java.util.Random;

public class ejer1random {
    static void main() {
        Random aleatorio = new Random();
        int num = aleatorio.nextInt(6)+1;
        System.out.println(num);

        int num2 = aleatorio.nextInt(6)+1;
        System.out.println(num2);

        int suma = num + num2;
        System.out.println("La suma de los numero es: "+suma);
    }
}
