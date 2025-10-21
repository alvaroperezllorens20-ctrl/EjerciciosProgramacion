package org.example;

import java.util.Scanner;

public class calculadora {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        double operando = 0;
        String operacion = "";
        double operando2 = 0;
        double suma = 0;
        double resta = 0;
        double mult = 0;
        double div = 0;
        double raiz = 0;
        final int NEG = 0;
        boolean repetir = false;

        do {
            try {
                System.out.println("**** BIENVENIDO A LA CALCULADORA RÁPIDA ****");
                System.out.println("------------------------------");
                System.out.println("[+] -> sumar");
                System.out.println("[-] -> restar");
                System.out.println("[x] -> multiplicar");
                System.out.println("[/] -> dividir");
                System.out.println("[R] -> raíz cuadrada");
                System.out.println("------------------------------");
                System.out.println("Introduce operando: ");
                operando = teclado.nextInt();
                teclado.nextLine();

                System.out.println("Elige una operación: ");
                operacion = teclado.nextLine();
                operacion = operacion.toUpperCase();
                if (!operacion.equals("R")) {
                        System.out.println("Introduce el segundo operando");
                        operando2 = teclado.nextInt();
                }

                switch (operacion) {
                    case "+":
                        suma = operando + operando2;
                        System.out.println("El resultado de " + operando + " + " + operando2 + " es " + suma);
                        break;
                    case "-":
                        resta = operando - operando2;
                        System.out.println("El resultado de " + operando + " - " + operando2 + " es " + resta);
                        break;
                    case "X":
                        mult = operando * operando2;
                        System.out.println("El resultado de " + operando + " x " + operando2 + " es " + mult);
                        break;
                    case "/":

                        if (operando2 == NEG) {
                            System.out.println("No introduzcas 0 en el segundo operando");
                            repetir = false;
                            teclado.nextLine();
                            break;
                        }
                        System.out.println("El resultado de " + operando + " / " + operando2 + " es " + div);
                        div = operando / operando2;
                        break;
                    case "R":
                        if (operando < NEG) {
                            System.out.println("No se permiten numeros negativos");
                            teclado.nextLine();
                            break;
                        } else {
                            raiz = Math.sqrt(operando);
                            System.out.println("El resultado de la raiz de "+operando+" es "+raiz);
                            teclado.nextLine();
                            break;
                        }
                    default:
                        System.out.println("Formato incorrecto");
                        repetir = false;
                        break;
                }
            } catch (Exception err) {
                System.out.println("Formato incorrecto");
                repetir = false;
                teclado.nextLine();
            }
        } while (repetir == false);
    }
}