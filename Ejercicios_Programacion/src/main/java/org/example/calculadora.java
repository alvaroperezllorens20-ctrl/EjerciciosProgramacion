package org.example;

import java.util.Scanner;

public class Calculadora {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        double operando = 0;
        String operacion = "";
        double operando2 = 0;
        final int NEG = 0;
        boolean repetir = false;

        do {
            try {//muestro el menu de la calculadora
                System.out.println("**** BIENVENIDO A LA CALCULADORA RÁPIDA ****");
                System.out.println("------------------------------");
                System.out.println("[+] -> sumar");
                System.out.println("[-] -> restar");
                System.out.println("[x] -> multiplicar");
                System.out.println("[/] -> dividir");
                System.out.println("[R] -> raíz cuadrada");
                System.out.println("------------------------------");
                System.out.println("Introduce operando: ");//pido el primer operando
                operando = teclado.nextInt();//lo guardo
                teclado.nextLine();

                System.out.println("Elige una operación: ");//pido la operacion
                operacion = teclado.nextLine();
                operacion = operacion.toUpperCase();//paso la operacion a mayusculas por si el usuario introduce x/r
                if (!operacion.equals("+") && !operacion.equals("-") && !operacion.equals("X")//si la operacion no es uno de los valores aceptados da error
                        && !operacion.equals("/") && !operacion.equals("R")) {
                    System.out.println("Formato incorrecto. Tienes que usar +, -, x, / o R");
                    return;
                } else if (!operacion.equals("R")) {//si la operacion no es R pide el segundo operando
                    System.out.println("Introduce el segundo operando");
                    operando2 = teclado.nextInt();
                }


                switch (operacion) {//comprueba que es operacion
                    case "+"://en caso de ser + suma los 2 operandos
                        double suma = operando + operando2;
                        System.out.println("El resultado de " + operando + " + " + operando2 + " es " + suma);
                        break;
                    case "-"://en caso de ser - resta los 2 operandos
                        double resta = operando - operando2;
                        System.out.println("El resultado de " + operando + " - " + operando2 + " es " + resta);
                        break;
                    case "X"://en caso de ser x multiplica los 2 operandos
                        double mult = operando * operando2;
                        System.out.println("El resultado de " + operando + " x " + operando2 + " es " + mult);
                        break;
                    case "/"://en caso de ser / divide los 2 operandos
                        if (operando2 == NEG) {//en caso de que operando 2 sea 0 da error
                            System.out.println("No introduzcas 0 en el segundo operando");
                            teclado.nextLine();
                            break;
                        }// si no divide los operando
                        double div = operando / operando2;
                        System.out.println("El resultado de " + operando + " / " + operando2 + " es " + div);
                        break;
                    case "R"://en caso de ser R muestra la raiz de operando
                        if (operando < NEG) {//si operando es negativo da error
                            System.out.println("No se permiten numeros negativos");
                            repetir = false;
                            break;
                        } else {//si no calcula y muestra la raiz de operando
                            double raiz = Math.sqrt(operando);
                            System.out.println("El resultado de la raiz de "+operando+" es "+raiz);
                            repetir = false;
                            break;
                        }
                    default://wn caso de que operacion no sea igual a ninguno de los case da error
                        System.out.println("Formato incorrecto");
                        repetir = false;
                        break;
                }
            } catch (Exception err) { //controla los errores como meter palabras en vez de numeros en operando y operacion
                System.out.println("Formato incorrecto");
                repetir = false;
                teclado.nextLine();
            }
        } while (repetir == false);
    }
}