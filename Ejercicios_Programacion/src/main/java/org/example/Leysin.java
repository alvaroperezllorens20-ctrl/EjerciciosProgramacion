package org.example;

import java.util.Scanner;

public class Leysin {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        int edad = 0;
        boolean repetir = false;
        final int ed = 21;
        final int ed2 = 18;
        do {
            try {
                System.out.println("Introduce la edad del comprador");
                edad = teclado.nextInt();
                if (edad<0){
                    System.out.println("ERROR. NO INTRODUZCA NUMEROS NEGATIVOS");
                    return;
                }
            }catch (Exception err){
                System.out.println("El formato introducido no es correcto");
                repetir = true;
return;
            }
        }while(repetir);
        if (edad>=ed){
            System.out.println("TODO TIPO DE ALCOHOL");
        } else if (edad>=ed2) {
            System.out.println("SOLO FERMENTADAS(cervezas y vinos)");
        }else {
            System.out.println("CONSUMO NO PERMITIDO");
        }
    }
}
