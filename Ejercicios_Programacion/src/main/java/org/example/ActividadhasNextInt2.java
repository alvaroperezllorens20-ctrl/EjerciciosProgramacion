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

        int modo = teclado.nextInt();
        LocalDateTime fecha = LocalDateTime.now();
        int anyo_nacimiento_int = 0;
        final int ANYO_MIN = 1900;


        int anyo_actual = fecha.getYear();

        switch (modo){
            case 1:
                System.out.println("Introduce tu anyo de nacimiento...");
                String anyo_nacimiento = teclado.next();
                try {
                    anyo_nacimiento_int = Integer.parseInt(anyo_nacimiento);
                }catch (Exception err){
                    System.out.println("Formato incorrecto");
                    return;
                }
                break;
            case 2:
                int edad = 0;
                System.out.println("Introduce tu edad: ");
                if (teclado.hasNextInt()){
                    edad = teclado.nextInt();
                }else{
                    System.out.println("Formato incorrecto");
                    return;
                }
                if (edad>=0){
                    anyo_nacimiento_int = anyo_actual - edad;
                }
                break;
            default:
                System.out.println("Introduce un valor válido...");
                break;
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
