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
        boolean repetir = false;
        do {
            try {
                System.out.println("Introduce operando: ");
                operando = teclado.nextInt();
                System.out.println("Elige una operación: ");
                operacion = teclado.nextLine();
                System.out.println("Introduce un operando");
                operando2 = teclado.nextInt();
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
                        mult = operando * operando2;
                        repetir = true;
                        break;
                    case "/":
                        div = operando / operando2;
                        repetir = true;
                        break;
                    case "R":
                        double raiz = Math.sqrt(operando);
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
        System.out.println("**** BIENVENIDO A LA CALCULADORA RÁPIDA ****");
        System.out.println("Introduce operando: ");
        System.out.println(operando);
        System.out.println("------------------------------");
        System.out.println("[+] -> sumar");
        System.out.println("[-] -> restar");
        System.out.println("[x] -> multiplicar");
        System.out.println("[/] -> dividir");
        System.out.println("[R] -> raíz cuadrada");
        System.out.println("------------------------------");
        System.out.println("Elige una operacion: ");
        System.out.println(operacion);
        System.out.println("Introduce el segundo operando: ");
        System.out.println(operando2);
        if (operacion.equals("+")){
            System.out.println("El resultado de "+operando+" + "+operando2+" es "+suma);
        }

    }
}
