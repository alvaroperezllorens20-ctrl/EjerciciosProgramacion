package org.example;

import java.util.Scanner;

public class ISBN {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        boolean repetir = false;
        final int MAX = 10;
        int ultimo = 0;
        String ISBN = "0";
        int total = 0;
        int cont = 10;
        String num = "0";
        int num_int = 0;
        do {
            try {
                System.out.println("VALIDADOR DE ISBN");
                System.out.println("-----------------");
                System.out.println("1- Validar ISBN");
                System.out.println("2- Reparar ISBN");
                System.out.println("3- Salir");
                System.out.println("-----------------");
                System.out.println("Introduce lo que quieres hacer: ");

                int opcion = teclado.nextInt();
                teclado.nextLine();

                if (opcion != 1 && opcion != 2 && opcion != 3){
                    System.out.println("Introduce solo 1, 2 o 3.");
                    repetir = false;
                    continue;
                }
                switch (opcion){
                    case 1:
                        System.out.println("introduce un ISBN (máximo 10 dígitos): ");
                        ISBN = teclado.nextLine();
                        ISBN = ISBN.toUpperCase();
                        int tamanyo = ISBN.length();
                        if (tamanyo != 10) {
                            System.out.println("Foramto incorrecto. Introduce 10 caractéres.");
                            repetir = false;
                            continue;
                        }
                        for (int i = 0;i < tamanyo;i++){
                            num = ISBN.substring(i);
                            num = num.substring(0,1);
                            if (ISBN.substring(9,10).equals("X")){
                                num_int = 10;
                            }else{
                                num_int = Integer.parseInt(num);
                            }
                            total += num_int * cont;
                            cont--;
                        }
                        System.out.println(total);
                        break;
                    case 2:
                        System.out.println("introduce un ISBN (máximo 10 dígitos): ");
                        ISBN = teclado.nextLine();
                        break;
                    case 3:
                        System.out.println("Saliendo...");
                        repetir = true;
                        break;
                    default:
                        System.out.println("Formato incorrecto");
                        repetir = false;
                        break;
                }
            }catch (Exception err){
            System.out.println("ERROR: Formato incorrecto.");
            }
        }while (repetir==false);
    }
}