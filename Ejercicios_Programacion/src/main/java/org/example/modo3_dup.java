package org.example;

import java.util.Arrays;
import java.util.Random;

public class modo3_dup {
    static void main() {
        Random aleatorio = new Random();
        int numeros[] = new int[20];

        for (int i = 0; i < numeros.length;i++){

            numeros[i] = aleatorio.nextInt(10)+1;
        }

        System.out.println(Arrays.toString(numeros));

        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros));
        boolean repetir = true;
        while(repetir){
            repetir = false;
            for (int i = 0;i < numeros.length;i++){
                if (i != numeros.length-1 && numeros[i] == numeros[i+1]) {
                    System.out.println("Duplicado: " + numeros[i]);
                    System.out.println(Arrays.toString(numeros));
                    numeros[i] = aleatorio.nextInt(50)+1;
                    Arrays.sort(numeros);

                    repetir = true;
                }
            }

        }
    }
}
