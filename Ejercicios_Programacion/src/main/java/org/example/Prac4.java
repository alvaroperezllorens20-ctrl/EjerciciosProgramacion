package org.example;

import java.util.Scanner;

public class Prac4 {
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
                System.out.println("Introduce el multiplicando(3 cifras): ");
                num1 = teclado.nextInt();
                System.out.println("Introduce el multiplicador(3 cifras): ");
                num = teclado.nextInt();

                if (((num1<100 || num1>999) && (num1>-100 || num1<-999) || (num<100 || num>999) && (num>-100 || num<-999))){
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
        String num_string = Integer.toString(num);
        if (num<0){

            String num_izquierda = num_string.substring(1,2);
            num_izquierda_int = Integer.parseInt(num_izquierda);
            String num_centro = num_string.substring(2,3);
            num_centro_int = Integer.parseInt(num_centro);
            String num_derecha = num_string.substring(3,4);
            num_derecha_int = Integer.parseInt(num_derecha);

        }else{

            String num_izquierda = num_string.substring(0,1);
            num_izquierda_int = Integer.parseInt(num_izquierda);
            String num_centro = num_string.substring(1,2);
            num_centro_int = Integer.parseInt(num_centro);
            String num_derecha = num_string.substring(2,3);
            num_derecha_int = Integer.parseInt(num_derecha);

        }
        int res = num1*num_derecha_int;
        int res2 = num1*num_centro_int;
        int res3 = num1*num_izquierda_int;
        System.out.println("El producto de la multiplicación es: "+num1*num);
        System.out.println("El proceso es: ");
        System.out.println("  "+num1);
        System.out.println("x "+num);
        System.out.println("------");
        System.out.println("  "+res);
        System.out.println(" "+res2+"x");
        System.out.println(res3+"xx");
        System.out.println("------");
        System.out.println(num1*num);

    }
}
