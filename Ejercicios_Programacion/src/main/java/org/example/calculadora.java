package org.example;

import java.util.Scanner;

public class calculadora {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        double operando = 0;
        String operacion = "";
        double operando2 = 0;
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
                if (!operacion.equals("+") && !operacion.equals("-") && !operacion.equals("X")
                        && !operacion.equals("/") && !operacion.equals("R")) {
                    System.out.println("Formato incorrecto. Tienes que usar +, -, x, / o R");
                    return;
                } else if (!operacion.equals("R")) {
                    System.out.println("Introduce el segundo operando");
                    operando2 = teclado.nextInt();
                }


                switch (operacion) {
                    case "+":
                        double suma = operando + operando2;
                        System.out.println("El resultado de " + operando + " + " + operando2 + " es " + suma);
                        break;
                    case "-":
                        double resta = operando - operando2;
                        System.out.println("El resultado de " + operando + " - " + operando2 + " es " + resta);
                        break;
                    case "X":
                        double mult = operando * operando2;
                        System.out.println("El resultado de " + operando + " x " + operando2 + " es " + mult);
                        break;
                    case "/":

                        if (operando2 == NEG) {
                            System.out.println("No introduzcas 0 en el segundo operando");
                            teclado.nextLine();
                            break;
                        }
                        double div = operando / operando2;
                        System.out.println("El resultado de " + operando + " / " + operando2 + " es " + div);
                        break;
                    case "R":
                        if (operando < NEG) {
                            System.out.println("No se permiten numeros negativos");
                            repetir = false;
                            break;
                        } else {
                            double raiz = Math.sqrt(operando);
                            System.out.println("El resultado de la raiz de "+operando+" es "+raiz);
                            repetir = false;
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