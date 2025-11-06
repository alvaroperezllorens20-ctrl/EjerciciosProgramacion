package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class bateria_vectores {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();
        //  EJER 1
        //crea un array de numero aleaorios  y suma los numero del array
//        int numeros[] = new int[8];
//        int cont = 0;
        //sumo los valores cambiados del vector
//        for (int i = 0;i< numeros.length;i++){
//            numeros[i]= aleatorio.nextInt(501);//numero aleatorio entre 0 y 500
//
//            cont += numeros[i];
//        }
//        System.out.println(Arrays.toString(numeros));
//        System.out.println(cont);
        //EJER 2
        //invertir array
//        int vector[] = {8,7,1,1,3,4};
//        int aux = 0;
        //invierto numeros posicion por posicion
//        for (int i= 0 ;i<vector.length/2;i++){
//            aux = vector[i];
//            vector[i]=vector[vector.length-1-i];
//            vector[vector.length-1-i]=aux;
//            int num = aux;
//        }
//        System.out.println(Arrays.toString(vector));

        //EJER 3
        //mostrar cuantos numeros repetidos salen en un array
//        Random aleatorio = new Random();
//        Scanner teclado = new Scanner(System.in);
//        int numeros[] = new int[25];
//        int cont = 0;
//        System.out.println("Introduce un numero: ");
//        int num = teclado.nextInt();
//        for (int i = 0;i< numeros.length;i++){
//            numeros[i]= aleatorio.nextInt(101);//numero aleatorio entre 0 y 100
//            if (numeros[i] == num){
//                cont++;
//            }
//        }
//        System.out.println(Arrays.toString(numeros));
//        System.out.println(cont);
        //EJER 4
        //crear un nuevo vector para quitar un numero de un vector
//        int vector[] = {3,4,5,6,2};
//
//        int nuevo[] = new int[vector.length-1];
//        System.out.println("Introduce una posición entre 0-5");
//        int posicion = teclado.nextInt();
//
//        for (int i = 0;i<nuevo.length;i++){
//            if (i >= posicion){
//                nuevo[i]= vector[i+1];
//            }else {
//                nuevo[i]= vector[i];
//            }
//        }
//        System.out.println(Arrays.toString(nuevo));
//        EJER 5
        //paso el ultimo numero del array a el primero y se muetsran los demas cambiando posicion
//        int vector[] = {3,4,5,6,2};
//        int aux = 0;
//        for (int i = 0;i < vector.length;i++){
//            aux = vector[i];
//            vector[i] = vector[vector.length-1];
//            vector[vector.length-1] = aux;
//        }
//        System.out.println(Arrays.toString(vector));
        //EJER6
        //Crea un array de números enteros y verifica si es simétrico
//        int vector[] = {2,2,3,2,1};
//        for (int i = 0;i < vector.length;i++){
//           if (vector[i] != vector[vector.length-1-i]){
//               System.out.println("Este numero no es simetrico");
//               break;
//           }
//        }
//        System.out.println("Este numero es simetrico");
        //EJER9
        String vector[] = {"hola","kiko","eres","retrasado"};
        for (int i = 0;i < vector.length;i++){

        }
    }
}
