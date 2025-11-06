package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class vectores {
    static void main() {
        Scanner teclado =new Scanner(System.in);
        int vector[] = {8,7,0,1,3,4};
        System.out.println(Arrays.toString(vector)); //imprime los vectores

        String vectores[] = {"alvaro","kiko","raul"};

        System.out.println(Arrays.toString(vectores)); //imprime los vectores
        // cambio el valor de la variable vector
        vector[0]= 10; // pongo la posicion y el nuevo valor
        vector[1]= 30;
        vector[2]= 14;
        System.out.println(Arrays.toString(vector));

        int vector2[]= new int[6];
        System.out.println(Arrays.toString(vector2));

       // no se puede cambiar el tamaño de un vector
        String vectoor2[]= new String[6];
        System.out.println(vectoor2);

        //si igualo los vectores y luego cambio el valor de uno de los 2 vectores se cambia en los 2

        System.out.println(Arrays.toString(vector));
        System.out.println(Arrays.toString(vector2));

        vector = vector2;

        System.out.println(Arrays.toString(vector));
        System.out.println(Arrays.toString(vector2));

        //si pongo clone y luego cambio el valor no importa porque no se cambia en los 2, solo en el que ponga para cambiarlo
        vector = vector2.clone();
        vector[0]= 5;
        System.out.println(Arrays.toString(vector));
        System.out.println(Arrays.toString(vector2));

        System.out.println(vector.length); //tamaño del vector

        //recorro el vector y muestro los carcteres de la posicion
        for (int i = 0;i < vector.length;i++){
            System.out.println("Numero: "+vector[i]);
        }
        //recorro el vector alreves
        for (int i = vector.length-1;i>= 0;i--){
            System.out.println("Numero: "+vector[i]);
        }
    }
}
