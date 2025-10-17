package org.example;

import java.util.Scanner;

public class numSuerte {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        boolean repetir = false;
        String fecha = "";
        final int MAX = 10;
        final int MAX_dia = 31;
        final int MAX_mes = 12;
        final int NEGATIVO = 0;
        int dia_int = 0;
        int mes_int = 0;
        int anyo_int = 0;
        do {
            try {
                System.out.println("Introduce tu fecha de nacimiento: "); //pido una fecha
                fecha = teclado.nextLine();//la guardo
                int tamanyo = fecha.length();//pido el tamaño de la fecha
                String dia = fecha.substring(0,2);//cojo el dia de la fecha
                dia_int = Integer.parseInt(dia);//lo paso a int
                String mes = fecha.substring(3,5);//cojo el mes de la fecha
                mes_int = Integer.parseInt(mes);//lo paso a int
                String anyo = fecha.substring(6,10);//cojo el anyo de la fecha
                anyo_int = Integer.parseInt(anyo);//lo paso a int
                if (dia_int <= NEGATIVO || mes_int <= NEGATIVO || anyo_int <= NEGATIVO) {//si el dia mes es negativo sale el error por pantalla
                    System.out.println("No introduzcas fechas negativas.");
                    repetir = false;
                } else if (dia_int > MAX_dia || mes_int > MAX_mes) {//si los valores no son correctos, dia mayor a 31 o mes mayor a 12 da error
                    System.out.println("Formato de fecha incorrecto.");
                    repetir = false;
                } else if (tamanyo == MAX && fecha.substring(2,3).equals("/") && fecha.substring(5,6).equals("/")) {//si hay 10 caracteres en la fecha y en el 3 y 6 caracter hay / se rompe el bucle y continua
                    repetir = true;
                } else {
                    System.out.println("ERROR. Formato incorrecto.");// si no da error se pide otra vez la fecha
                    repetir = false;
                }
            }catch (Exception err){//si se introduce una palabra en vez de un numero da error
                System.out.println("Formato incorreto.");
                repetir = false;
            }
        }while (repetir==false);

        int suma = dia_int + mes_int + anyo_int; // sumo la fecha

        String suma_string = Integer.toString(suma);//paso la suma de fecha a string

        String num1 = suma_string.substring(0,1);//cojo el primer caracter
        int num1_int = Integer.parseInt(num1);//lo paso a int
        String num2 = suma_string.substring(1,2);//cojo el segundo caracter
        int num2_int = Integer.parseInt(num2);//lo paso a int
        String num3 = suma_string.substring(2,3);//cojo el tercer caracter
        int num3_int = Integer.parseInt(num3);//lo paso a int
        String num4 = suma_string.substring(3,4);//cojo el cuarto caracter
        int num4_int = Integer.parseInt(num4);//lo paso a int

        int suma_final =num1_int + num2_int + num3_int +num4_int;//sumo los caracteres separados

        System.out.println(fecha);//muestro la fecha original
        System.out.println(dia_int+"+"+mes_int+"+"+anyo_int+" = "+suma);// muestro la fecha separada y el total de la suma
        System.out.println(num1_int+"+"+num2_int+"+"+num3_int+"+"+num4_int+" = "+suma_final);//muestro los caracteres de la suma separada
        System.out.println("Tu numero de la suerte es: "+suma_final);//muestro el total de la suma
    }
}
