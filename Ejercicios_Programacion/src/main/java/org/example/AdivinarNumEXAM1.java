package org.example;

import java.util.Random;
import java.util.Scanner;

public class AdivinarNumEXAM1 {
    static void main() {
        Random aleatorio = new Random();
        Scanner teclado = new Scanner(System.in);

        int numero = aleatorio.nextInt(101);

        System.out.println("Acabo de pensar un número [0-100]… ¿puedes adivinarlo? ¡Tienes 10 intentos!");
        int num2 = 0;

        for (int i = 10;i>0;i--){
            try {
                System.out.println("Introduce un numero: ");
                num2 = teclado.nextInt();

                if (num2 > 100 || num2 < 0){
                    System.out.println("ERROR. Introduce un numero entre el 0-100");
                    continue;
                }
            }catch (Exception err){
                System.out.println("ERROR. Formato incorrecto");
                teclado.nextLine();
                continue;
            }
            if (num2 == numero){
                System.out.println("Felicidades adivinaste el numero");
            } else if (num2 < numero) {
                System.out.println("El numero que has introducido es menor que el numero que he pensado");
                System.out.println("Te quedan: "+i+" intentos.");
            } else {
                System.out.println("El numero que has introducido es mayor que el numero que he pensado");
                System.out.println("Te quedan: " + i + " intentos.");
                teclado.nextLine();
            }
        }
        System.out.println("Has gastado todos los intentos. Has perdido.");
    }
}
