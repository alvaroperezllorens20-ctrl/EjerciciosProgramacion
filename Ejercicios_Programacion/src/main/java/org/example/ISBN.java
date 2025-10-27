package org.example;

import java.util.Scanner;

public class ISBN {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        boolean repetir = false;
        String ISBN = "0";
        int total = 0;
        int cont = 10;
        int num_int = 0;
        int opcion = 0;
        int valido = 0;
        int tamanyo = 0;
        int falta = 0;
        String num = "0";
        int numero = 0;
        do {
            try {
                System.out.println("VALIDADOR DE ISBN");
                System.out.println("-----------------");
                System.out.println("1- Validar ISBN");
                System.out.println("2- Reparar ISBN");
                System.out.println("3- Salir");
                System.out.println("-----------------");
                System.out.println("Introduce lo que quieres hacer: ");

                opcion = teclado.nextInt();
                teclado.nextLine();

                if (opcion != 1 && opcion != 2 && opcion != 3){
                    System.out.println("Introduce solo 1, 2 o 3.");
                    repetir = false;
                    continue;
                }
                repetir = true;
            }catch (Exception err){
                System.out.println("ERROR: Formato incorrecto.");
                repetir = false;
                teclado.nextLine();
            }
        }while (repetir==false);
        switch (opcion){
            case 1:
                System.out.println("introduce un ISBN (máximo 10 dígitos): ");
                ISBN = teclado.nextLine();
                ISBN = ISBN.toUpperCase();
                tamanyo = ISBN.length();
                if (tamanyo != 10) {
                    System.out.println("Formato incorrecto. Introduce 10 caractéres.");
                }
                for (int i = 0; i < tamanyo; i++) {
                    num = ISBN.substring(i);
                    num = num.substring(0,1);


                    if (i == 9 && num.equals("X")) {
                        num = "10";
                        num_int = Integer.parseInt(num);
                    }
                    num_int = Integer.parseInt(num);
                    total += num_int * cont;
                    cont--;
                }
                valido = total % 11;
                if (valido == 0){
                    System.out.println("El ISBN es válido");
                }else{
                    System.out.println("El ISBN no es válido");
                }
                break;
            case 2:
                System.out.println("Introduce un ISBN (máximo 10 dígitos): ");
                ISBN = teclado.nextLine();
                ISBN = ISBN.toUpperCase();
                tamanyo = ISBN.length();

                if (tamanyo != 10) {
                    System.out.println("Formato incorrecto. Introduce 10 caractéres.");
                }
                for (int i = 0; i < tamanyo; i++) {
                    num = ISBN.substring(i);
                    num = num.substring(0,1);

                    if (num.equals("?")) {
                        falta = cont;
                        cont--;
                        continue;
                    }

                    if (i == 9 && num.equals("X")) {
                        num = "10";
                    }
                    num_int = Integer.parseInt(num);
                    total += num_int * cont;
                    cont--;
                }
                int pos = 0;
                do {
                    pos++;
                    numero = falta * pos;
                    total = total + numero;
                }while (total % 11 != 0);
                System.out.println("El digito que falta es: "+pos);
                break;
            case 3:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Formato incorrecto");
                break;
        }
    }
}