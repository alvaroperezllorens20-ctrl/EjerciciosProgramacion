package org.example;

import java.util.Scanner;

public class calculadora {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        int operando = 0;
        String operacion = "";
        int operando2 = 0;
        int suma = 0;
        int resta = 0;
        int mult = 0;
        int div  = 0;
        double raiz = 0;
        boolean repetir = false;
        System.out.println("**** BIENVENIDO A LA CALCULADORA RÁPIDA ****");
        System.out.println("------------------------------");
        System.out.println("[+] -> sumar");
        System.out.println("[-] -> restar");
        System.out.println("[x] -> multiplicar");
        System.out.println("[/] -> dividir");
        System.out.println("[R] -> raíz cuadrada");
        System.out.println("------------------------------");
        do {
            try {
                System.out.println("Introduce operando: ");
                operando = teclado.nextInt();
                teclado.nextLine();
                System.out.println("Elige una operación: ");
                operacion = teclado.nextLine();
                System.out.println("Introduce el segundo operando");
                operando2 = teclado.nextInt();
                if (operacion.equals("+") || operacion.equals("-") || operacion.equals("x") || operacion.equals("X") || operacion.equals("/")){
                    System.out.println("Introduce el segundo operando");
                    operando2 = teclado.nextInt();
               }else {
                    repetir = false;
                }
                switch (operacion){
                    case "+":
                        suma = operando + operando2;
                        repetir = true;
                        break;
                    case "-":
                        resta = operando - operando2;
                        repetir = true;
                        break;
                    case "x":
                    case "X":
                        mult = operando * operando2;
                        repetir = true;
                        break;
                    case "/":
                        String operando2_string = Integer.toString(operando2);
                        if (operando2_string.equals("0")){
                            System.out.println("No introduzcas 0 en el operando 2");
                            return;
                        }
                        div = operando / operando2;
                        repetir = true;
                        break;
                    case "r":
                    case "R":
                        raiz = Math.sqrt(operando);
                        repetir = true;
                        break;
                    default:
                        System.out.println("Formato incorrecto");
                        repetir = false;
                        break;
                }
            }catch (Exception err){
                System.out.println("Formato incorrecto");
                repetir = false;
                teclado.nextLine();
            }
        }while (repetir==false);
        if (operacion.equals("+")){
            System.out.println("El resultado de "+operando+" + "+operando2+" es "+suma);
        } else if (operacion.equals("-")) {
            System.out.println("El resultado de "+operando+" - "+operando2+" es "+resta);
        } else if (operacion.equals("x") || operacion.equals("X")) {
            System.out.println("El resultado de "+operando+" x "+operando2+" es "+mult);
        } else if (operacion.equals("/")) {
            System.out.println("El resultado de "+operando+" / "+operando2+" es "+div);
        }else{
            System.out.println("El resultado de la raiz de "+operando+" es "+raiz);
        }
    }
}