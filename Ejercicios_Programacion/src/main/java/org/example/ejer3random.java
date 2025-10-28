package org.example;

import java.util.Random;
import java.util.Scanner;

public class ejer3random {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();
        int num_ale = 0;
        System.out.println("Introduce el valor minimo: ");
        int num1 = teclado.nextInt();
        System.out.println("Introdue el valor máximo: ");
        int num2 = teclado.nextInt();
        System.out.println("Introduce cuantos numeros aleatorios quieres: ");
        int cont = teclado.nextInt();

        for (int i = 0;i < cont;i++){
            if (num1 < num2){
                num_ale = aleatorio.nextInt(num2)+num1;
                System.out.println(num_ale);

            } else if (num1 > num2) {
                num_ale = aleatorio.nextInt(num1)+num2;
                System.out.println(num_ale);
            }else{
                System.out.println("Los numeros introducidos son iguales.");
            }
        }
    }
}
