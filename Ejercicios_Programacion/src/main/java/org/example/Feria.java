package org.example;

import java.util.Scanner;

public class Feria {
    public static void main() {
        Scanner teclado = new Scanner(System.in);
        final int MIN2 = 140;
        final int MAX2 = 120;
        final int MAX = 230;
        System.out.println("BIENVENIDO AL RATÓN JUGUETÓN");
        int altura = 0;
        try {
            System.out.println("Leyendo altura (cm): ");//pido altura
            altura = teclado.nextInt();
        }catch (Exception err){
            System.out.println("ERROR DE LECTURA. BAJA DE LA BÁSCULA Y VUELVE A SUBIR…");//si el valor introducido no es un numero da error
        }
        if (altura<0 || altura>MAX){
            System.out.println("ERROR DE LECTURA. BAJA DE LA BÁSCULA Y VUELVE A SUBIR…");//si el numero es negativo o mayor que MAX(230) da error
        }else if (altura<MIN2) {//si la altura es menor que MIN2(140) da error
            int exc= MIN2 - altura; //calculo la altura que faltaria para subir a la atraccion
            System.out.println("LO SIENTO, NO PUEDES MONTAR EN LA ATRACCION. Te faltan "+exc+" cm");//muestro la altura que falta por pantalla
        }else{
            System.out.println("Leyendo peso (kg):"); //pido el peso
            double peso = teclado.nextDouble();
            double min = (altura * 2) / 8.0;//calculo el peso minimo
            if (peso<min){//si el peso es menor que el peso minimo(min2) da error
                System.out.println("NO CUMPLES CON EL PESO MÍNIMO");
            } else if (peso>MAX2) {//si el espo es mayor que el peso maximo(MAX2) da error
                double exc2 = peso - MAX2; //calculo lo que sobrepasa del peso maximo
                System.out.println("LO SIENTO, NO PUEDES MONTAR EN LA ATRACCIÓN. Sobrepasas "+exc2+" kg del peso máximo");//muestro el peso que sobrepasa por pantalla
            }else{
                System.out.println("Pesas "+peso+" kg. Peso mínimo calculado: "+min+"kg.");//muestro el peso y el peso minimo por pantalla
                System.out.println("SUBE A LA ATRACCION");
            }
        }
    }
}

