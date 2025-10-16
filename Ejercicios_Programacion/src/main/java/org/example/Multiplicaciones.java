package org.example;

import java.util.Scanner;

public class Multiplicaciones {
    static void main() {

        Scanner teclado = new Scanner(System.in);
        int num1=0;
        int num=0;
        int num_derecha_int = 0;
        int num_centro_int = 0;
        int num_izquierda_int = 0;
        boolean repetir = false;
        do {
            try{
                System.out.println("Introduce el multiplicando(3 cifras): ");//pido numeros
                num1 = teclado.nextInt();
                System.out.println("Introduce el multiplicador(3 cifras): ");//pido numeros
                num = teclado.nextInt();

                if (((num1<100 || num1>999) && (num1>-100 || num1<-999) || (num<100 || num>999) && (num>-100 || num<-999))){//si el numero tiene 1,2,4 o mas cifras da error, incluyendo negativos y se repite
                    System.out.println("ERROR: solo se permiten numeros de 3 cifras");
                    repetir = false;
                }else {
                    repetir = true;
                }
            }catch (Exception err){
                System.out.println("ERROR: Formato incorrecto");
                teclado.nextLine();
                repetir = false;
            }
        }while (repetir==false);
        String num_string = Integer.toString(num); //paso num a string
        if (num<0){ //si num es negativo

            String num_izquierda = num_string.substring(1,2); //coje el segundo caracter ya que el primero es un "-"
            num_izquierda_int = Integer.parseInt(num_izquierda);//lo guardo
            String num_centro = num_string.substring(2,3);//cojo el tercer caracter
            num_centro_int = Integer.parseInt(num_centro);//lo guardo
            String num_derecha = num_string.substring(3,4);//cojo el cuarto caracter
            num_derecha_int = Integer.parseInt(num_derecha);//lo guardo

        }else{ //si es positivo

            String num_izquierda = num_string.substring(0,1);//cojo el primer caracter
            num_izquierda_int = Integer.parseInt(num_izquierda);//lo guardo
            String num_centro = num_string.substring(1,2);//cojo el segundo caracter
            num_centro_int = Integer.parseInt(num_centro);//lo guardo
            String num_derecha = num_string.substring(2,3);//cojo el tercer caracter
            num_derecha_int = Integer.parseInt(num_derecha);//lo guardo

        }
        int res = num1*num_derecha_int; //multiplico los numeros guardados por el multiplicando
        int res2 = num1*num_centro_int;//multiplico los numeros guardados por el multiplicando
        int res3 = num1*num_izquierda_int;//multiplico los numeros guardados por el multiplicando
        System.out.println("El producto de la multiplicación es: "+num1*num);//muestor el resultado de la multiplicacion
        System.out.println("El proceso es: ");
        System.out.println("  "+num1);//muestro multiplicando
        System.out.println("x "+num);//muestro multiplicador
        System.out.println("------");
        System.out.println("  "+res);//muestros los resultados separados
        System.out.println(" "+res2+"x");//muestros los resultados separados
        System.out.println(res3+"xx");//muestros los resultados separados
        System.out.println("------");
        System.out.println(num1*num);//muestro el resultado final

    }
}
