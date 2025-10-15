package org.example;

import java.util.Scanner;

public class cadenas1 {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        String frase2 = "";
        System.out.println("Introduce una frase");
        String frase = teclado.nextLine();
        System.out.println(frase);
        int longitud = frase.length();
        System.out.println(longitud);
        String cambiar = frase.replace("Prueba ejercicio caracteres","Pruebaejerciciocaracteres");
        System.out.println(cambiar);
        String mitad1 = frase.substring(0,13);
        String mitad2 = frase.substring(13,27);
        String frase_concat = frase2.concat("Primera mitad del texto es: "+mitad1+ " y la segunda mitad del texto es: "+mitad2);
        System.out.println(frase_concat);
        String frase_may = frase.toUpperCase();
        System.out.println(frase_may);

    }
}
