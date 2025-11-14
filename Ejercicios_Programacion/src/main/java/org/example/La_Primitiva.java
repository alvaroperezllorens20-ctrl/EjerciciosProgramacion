package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class La_Primitiva {
    static void main() {
        Random aleatorio = new Random();
        Scanner teclado = new Scanner(System.in);
        int numero = aleatorio.nextInt(1,50);
        String complementario = "";
        String reintegro = "";
        boolean repetir = true;

        String boleto = "";

        do {
            System.out.println("Introduce tu boleto: ");
            boleto = teclado.nextLine();

            repetir = boleto.matches("\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}");
            complementario = boleto.substring(18,20);
            reintegro = boleto.substring(21,23);
        }while(!repetir);
            System.out.println(boleto);
            System.out.println(complementario);
            System.out.println(reintegro);
            String[] vector = {};

            for (int i = 0;i < boleto.length();i++){

                vector = boleto.split("-");
            }
        String vector_in = "";
            System.out.println(Arrays.toString(vector));
        while(repetir){
            repetir = false;
            for (int i = 0;i < vector.length;i++){
                int vector_int = Integer.parseInt(vector[i]);
                if (i != vector.length-1 && vector[i] == vector[i+1]) {
                    vector_int = aleatorio.nextInt(50);

                    repetir = true;
                }
            }
        }
       // System.out.println(Arrays.toString(vector_int));
    }
}
