package org.example;

import java.time.LocalDateTime;
import java.util.Scanner;

public class ActividadhasNextInt2 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Elige un modo");
        System.out.println("1.- Anyo de nacimiento");
        System.out.println("2.- Edad");
        System.out.println("----------------");

        int edad = 0;
        int modo = 0;
        int anyo_nacimiento_int = 0;
        final int ANYO_MIN = 1900;

        LocalDateTime fecha = LocalDateTime.now();
        int anyo_actual = fecha.getYear();



        if (teclado.hasNextInt()){
            modo = teclado.nextInt();

        }else{
            System.out.println("Introduce un valor válido...");
            return;
        }
        if (modo==1){

            try {
                System.out.println("Introduce tu anyo de nacimiento...");
                String anyo_nacimiento = teclado.next();
                anyo_nacimiento_int = Integer.parseInt(anyo_nacimiento);
            }catch (Exception err){
                System.out.println("Formato incorrecto");
                return;
            }
            } else if (modo==1) {
                if (teclado.hasNextInt()){
                    edad = teclado.nextInt();
                }else{
                    System.out.println("Formato incorrecto");
                    return;
                }
                if (edad>=0){
                    anyo_nacimiento_int = anyo_actual - edad;
                }
            }else {
                System.out.println("El modo no existe");
            }
        if (anyo_nacimiento_int >= ANYO_MIN && anyo_nacimiento_int <= anyo_actual){
            if (anyo_nacimiento_int <= 1927){
                System.out.println("Generación no baitizada");
            }else if (anyo_nacimiento_int <= 1928 && anyo_nacimiento_int <= 1944){
                System.out.println("Generación Silent");
            }else if (anyo_nacimiento_int >= 1945 && anyo_nacimiento_int <= 1964){
                System.out.println("Generación Baby Boomers");
            }else if (anyo_nacimiento_int >= 1965 && anyo_nacimiento_int <= 1981){
                System.out.println("Generación X");
            } else if (anyo_nacimiento_int >= 1982 && anyo_nacimiento_int <= 1994){
                System.out.println("Generación Y");
            }else {
                System.out.println("Generación Z");
            }
        }else{
            System.out.println("Formato incorrecto");
        }
    }
}
