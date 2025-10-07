package org.example;

import java.util.Scanner;

public class Delegados {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        int votos = 0;
        int votos2 = 0;
        final int max = 25;
        System.out.println("Introduce el nombre del primer candidato");
        String nombre = teclado.nextLine();
        System.out.println("Introduce el nombre del segundo candidato");
        String nombre2 = teclado.nextLine();
        try {
            System.out.println("Introduce votos para " + nombre);
            votos = teclado.nextInt();
            teclado.nextLine();
            System.out.println("Introduce votos para " + nombre2);
            votos2 = teclado.nextInt();

        } catch (Exception err) {
            System.out.println("No se debe volver a pedir el valor que se ha introducido incorrectamente.");
        }
        int total = votos + votos2;
        int blanco = max - total;
        if (total > max) {
            System.out.println("RESULTADOS:");
            System.out.println("Total de votos: " + total);
            System.out.println("ERROR. No pueden votar más personas(" + total + ") que estudiantes tiene la clase: 25");
        } else {
            if (votos>votos2){
                System.out.println("RESULTADOS:");
                System.out.println("Total de votos: "+total);
                System.out.println("Votos en blanco: "+blanco);
                System.out.println("DELEGADO: "+nombre);
            } else if (votos2>votos) {
                System.out.println("RESULTADOS:");
                System.out.println("Total de votos: "+total);
                System.out.println("Votos en blanco: "+blanco);
                System.out.println("DELEGADO: "+nombre2);
            }else{
                System.out.println("RESULTADOS:");
                System.out.println("Total de votos: "+total);
                System.out.println("Votos en blanco: "+blanco);
                System.out.println("REPETIR VOTACION");
            }
        }
    }
}

