package org.example;

import java.util.Scanner;

public class Contadorbisiesto {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        int anyo = 0;
        int anyo_actual = 2025;
        int bisiesto = 0;
        boolean repetir = false;
        do {
            try {
                System.out.println("Introduce una fecha mayor a 1900 y menor al año actual: ");
                anyo = teclado.nextInt();

                if (anyo < 1900 || anyo > 2025){
                    System.out.println("ERROR. Introduce un anyo entre el 1900 y el año actual");
                }else{
                    repetir = true;
                }
            }catch (Exception err){
                System.out.println("ERROR. Formato incorrecto");
            }
        }while (repetir==false);
        for (int i = anyo;i < anyo_actual;i++){
            if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0){
                System.out.println(i);
                bisiesto++;
            }
        }
        System.out.println("Han habido "+bisiesto+" años bisiestos");
    }
}
