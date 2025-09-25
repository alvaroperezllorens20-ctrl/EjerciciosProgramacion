package org.example;
import java.util.Scanner;

public class Actividad {
    static void main() {

        Scanner teclado = new Scanner(System.in);//Definir para pedir cosas
        System.out.println("¿Cómo te llamas?: "); //Escribir
        String nombre = teclado.nextLine();// next si el nombre no tiene espacio, nextline si tiene espacio
        System.out.println("¿Cual es tu curso?: ");
        String curso = teclado.next();
        System.out.println("Hola "+ nombre + ", bienvenido a "+ curso);
        System.out.println("Dime un numero: ");
        int num1= teclado.nextInt();
        System.out.println("Dime otro numero: ");
        int num2= teclado.nextInt(); //hacer variables
        int resultado = num1+num2;
        System.out.println("El resultado de: " +num1 + "+" +num2 + " es " +resultado);

    }
}
