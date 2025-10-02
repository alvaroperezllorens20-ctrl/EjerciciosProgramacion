package org.example;

import java.util.Scanner;

public class Ejercicio5 {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        boolean repetir = true;
        do {
            try {
                System.out.println("Dime un numero: ");
                num1 = teclado.nextInt();
                System.out.println("Dime otro numero: ");
                num2 = teclado.nextInt();
                if (num2==0){
                    System.out.println("No se puede dividir entre 0");
                }else {
                    repetir = false;
                }
            }catch (Exception err){
                System.out.println("ERROR: no se puede dividir entre 0");
                teclado.nextLine();
            }
        }while (repetir==true);
        double resultado = num1/num2;
        System.out.println("El resultado de la división es: "+resultado);
    }
}
