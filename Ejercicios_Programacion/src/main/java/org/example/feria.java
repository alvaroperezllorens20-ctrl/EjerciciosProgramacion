package org.example;

import java.util.Scanner;

public class feria {
    public static void main() {
        Scanner teclado = new Scanner(System.in);
        final int MIN2 = 140;
        final int MAX2 = 120;
        final int MAX = 230;
        System.out.println("BIENVENIDO AL RATÓN JUGUETÓN");
        int altura = 0;
        try {
            System.out.println("Leyendo altura (cm): ");
            altura = teclado.nextInt();
        }catch (Exception err){
            System.out.println("ERROR DE LECTURA. BAJA DE LA BÁSCULA Y VUELVE A SUBIR…");
        }
        if (altura<0 || altura>MAX){
            System.out.println("ERROR DE LECTURA. BAJA DE LA BÁSCULA Y VUELVE A SUBIR…");
        }else if (altura<MIN2) {
            int exc= MIN2 - altura;
            System.out.println("LO SIENTO, NO PUEDES MONTAR EN LA ATRACCION. Te faltan "+exc+" cm");
        }else{
            System.out.println("Leyendo peso (kg):");
            double peso = teclado.nextDouble();
            double min = altura * 2;
            double min2 = min / 8;
            if (peso<min2){
                System.out.println("NO CUMPLES CON EL PESO MÍNIMO");
            } else if (peso>MAX2) {
                double exc2 = peso - MAX2;
                System.out.println("LO SIENTO, NO PUEDES MONTAR EN LA ATRACCIÓN. Sobrepasas "+exc2+" kg del peso máximo");
            }else{
                System.out.println("Pesas "+peso+" kg. Peso mínimo calculado: "+min2+"kg.");
                System.out.println("SUBE A LA ATRACCION");
            }
        }
    }
}

