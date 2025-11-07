package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class split {
    static void main() {

        Scanner teclado = new Scanner(System.in);

        String cadena = "MADRID,BARCELONA,VALENCIA,ELCHE";
        String equipos[] = cadena.split(",");

        System.out.println(Arrays.toString(equipos));


    }
}
