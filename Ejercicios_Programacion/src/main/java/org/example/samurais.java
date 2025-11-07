package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class samurais {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();
        boolean repetir = true;
        String equipo1[] = new String[7];
        String equipo2[] = new String[7];
        int cont = 0;
        final int MAX = 30;
        int sab = 1;
        int eq1 = 0;
        int eq2 = 0;
        final int MAX2 = 6;
        final int SALIR = 4;
        do {
            cont = 0; //reinicio el contador a 0
            //pido al usuario que introduzca los numeros de su equipo y los introduzco en un vector con split
            System.out.println("Introduce equipo " +sab+": ");
            String cadena = teclado.nextLine();
            String equipo[] = cadena.split(" ");
            //recorro el vector y lo voy sumando
            for (int i = 0;i<equipo.length;i++){

                cont += Integer.parseInt(equipo[i]);
            }
            //si el total del vector no es 30 da error y lo vuelve a pedir
            if (cont != MAX) {
                System.out.println("ERROR. La potencia total no suma 30.");
                continue;
            }else{ //si no completa el equipo 1,clona equipo y lo define como equipo1 y cambia sab para pedir el equipo 2
                System.out.println("Equipo completo.");
                if (sab == 1){
                    equipo1 = equipo.clone();
                    sab = 2;
                }else {//guarda el equipo 2 en la siguiente vuelta al do while y sale del bucle
                    equipo2= equipo.clone();
                    break;
                }
            }
        }while(true);
        int num = aleatorio.nextInt(6,7); //pido un numero aleatorio entre 0 y 6
        System.out.println("¡Empieza la batalla!");
        System.out.println("La batalla empieza con el samurai "+num); //muestro por la posicion desde la que va a empezar la batalla
        //recorro los vectores y voy comparando la posicion de los vectores
        for (int i = num;i < equipo1.length; i++) {
            //los paso a int ya que con string no me dejaba compararlos
            int pri = Integer.parseInt(equipo1[i]);
            int seg = Integer.parseInt(equipo2[i]);
            if (pri > seg) {
                System.out.println("Samurai " + i + " Gana Equipo 1: " + pri + " vs " + seg);
                eq1++;
            } else if (pri < seg) {
                System.out.println("Samurai " + i + " Gana Equipo 2: " + pri + " vs " + seg);
                eq2++;
            } else {
                System.out.println("Samurai " + i + " Empate: " + pri + " vs " + seg);
            }//si un equipo gana 4 veces se rompe el bucle y ganan
            if (eq1 == SALIR || eq2 == SALIR){
                break;
            }//cuando i llegue a 6 se reiniciará a 0
            if (i == MAX2){
                i = 0;
            }
        }//compara los totales de los equipos y sale el ganador, si no es empate
        if (eq1 > eq2){
            System.out.println("Equipo 1 GANA. Equipo 1 ha tenido "+eq1+" bajas");
        } else if (eq2 > eq1) {
            System.out.println("Equipo 2 GANA. Equipo 2 ha tenido "+eq2+" bajas");
        }else{
            System.out.println("EMPATE. Los 2 equipos han tenido "+eq1+" bajas.");
        }
    }
}
