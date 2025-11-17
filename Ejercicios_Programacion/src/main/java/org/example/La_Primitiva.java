package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class La_Primitiva {
    static void main() {
        Random aleatorio = new Random();
        Scanner teclado = new Scanner(System.in);
        int boleto_ganador[] = new int[8];
        String complementario = "";
        String reintegro = "";
        boolean repetir = true;
        String[] vector = {};
        String boleto = "";

        do {
            System.out.println("Introduce tu boleto: ");
            boleto = teclado.nextLine();
            if (boleto.length() <= 23) {
                repetir = boleto.matches("\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}");
                complementario = boleto.substring(18, 20);
                reintegro = boleto.substring(21, 23);
                break;
            } else {
                continue;
            }
        } while (repetir);

        //boleto participante
        vector = boleto.split("-");

        //creo boleto ganador
        for (int i = 0; i < boleto_ganador.length; i++) {

            if (i == 7) {
                boleto_ganador[i] = aleatorio.nextInt(0, 10);
            } else {
                boleto_ganador[i] = aleatorio.nextInt(1, 50);
            }
        }

        for (int i = 0; i < boleto_ganador.length; i++) {
            int vector_int = Integer.parseInt(vector[i]);

            if (vector_int == boleto_ganador[i]) {
                System.out.println("Enhorabuena. Has acertados todos los numeros");
                break;
            }
            System.out.println(Arrays.toString(boleto_ganador));

            System.out.println(Arrays.toString(vector));
            System.out.println("Complementario: " + complementario);
            System.out.println("Reintegro: " + reintegro);
        }
    }
}
