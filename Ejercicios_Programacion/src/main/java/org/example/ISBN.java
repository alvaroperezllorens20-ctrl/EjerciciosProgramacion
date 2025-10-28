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
            try {//muestro el menú y pido la opción al usuario
                System.out.println("VALIDADOR DE ISBN");
                System.out.println("-----------------");
                System.out.println("1- Validar ISBN");
                System.out.println("2- Reparar ISBN");
                System.out.println("3- Salir");
                System.out.println("-----------------");
                System.out.println("Introduce lo que quieres hacer: ");

                opcion = teclado.nextInt();
                teclado.nextLine();
                //si la opcion no es 1,2 o 3 da error y lo vuelve a pedir
                if (opcion != 1 && opcion != 2 && opcion != 3){
                    System.out.println("Introduce solo 1, 2 o 3.");
                    repetir = false;
                    continue;
                }
                repetir = true;//si no da error sale del bucle
            }catch (Exception err){
                System.out.println("ERROR: Formato incorrecto.");//controlo los errores
                repetir = false;
                teclado.nextLine();
            }
        }while (repetir==false);
        switch (opcion){
            case 1://pregunto el isbn y lo paso a mayúsculas y lo comparo, si no tiene 10 dígitos da error
                System.out.println("introduce un ISBN (máximo 10 dígitos): ");
                ISBN = teclado.nextLine();
                ISBN = ISBN.toUpperCase();
                tamanyo = ISBN.length();
                if (tamanyo != 10) {
                    System.out.println("Formato incorrecto. Introduce 10 caractéres.");
                }
                for (int i = 0; i < tamanyo; i++) {
                    //cojo el isbn y voy guardando los dígitos
                    num = ISBN.substring(i);
                    num = num.substring(0,1);

                    //si el ultimo digito es X, lo cambia por un 10 y lo pasa a numero(int)
                    if (i == 9 && num.equals("X")) {
                        num = "10";
                        num_int = Integer.parseInt(num);
                    }
                    //calculo el total del isbn
                    num_int = Integer.parseInt(num);
                    total += num_int * cont;
                    cont--;
                }//si el resto de valido es 0 el isbn es correcto, si no es invalido
                valido = total % 11;
                if (valido == 0){
                    System.out.println("El ISBN es válido");
                }else{
                    System.out.println("El ISBN no es válido");
                }
                break;
            case 2://pregunto el isbn y lo paso a mayúsculas y lo comparo, si no tiene 10 dígitos da error
                System.out.println("Introduce un ISBN (máximo 10 dígitos): ");
                ISBN = teclado.nextLine();
                ISBN = ISBN.toUpperCase();
                tamanyo = ISBN.length();

                if (tamanyo != 10) {
                    System.out.println("Formato incorrecto. Introduce 10 caractéres.");
                }

                for (int i = 0; i < tamanyo; i++) {
                    //cojo el isbn y voy guardando los dígitos
                    num = ISBN.substring(i);
                    num = num.substring(0,1);
                    //si hay una ? guarda la posicion, si el ultimo digito es X, lo cambia por un 10 y lo pasa a numero(int)
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
                //con la posicion voy probando numeros hasta que suma total de resto 0
                int pos = 0;
                do {
                    pos++;
                    numero = falta * pos;
                    total = total + numero;
                }while (total % 11 != 0);
                //muestro el digito que falta
                System.out.println("El digito que falta es: "+pos);
                break;
            case 3:
                //si el usuario introduce 3 sale del programa
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Formato incorrecto");//si la opcion no esta en el switch da error
                break;
        }
    }
}