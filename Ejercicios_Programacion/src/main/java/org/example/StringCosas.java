package org.example;

public class StringCosas {
    static void main() {
        String frase = "barcelona 2-8";
        int tamanyo = frase.length(); // cuenta los caracteres de frase
        System.out.println(tamanyo);
        System.out.println(frase.charAt(12));//cojo el caracter de la posicion 10
        String trozo = frase.substring(10,13); //cojo de los caracteres 10 al 13
        System.out.println(trozo);
        String trozo2 = frase.substring(10); //indico el primer caracter desde el caul quiero empezar a contar
        System.out.println(trozo2);
        int palabra = frase.indexOf("na"); //busca posicion
        System.out.println(palabra);
        int palabra2 = frase.indexOf("lo",2);
        System.out.println(palabra2);
        int palabra3 = frase.lastIndexOf("na");//coje el ultimo "na" de la frase
        System.out.println(palabra3);
        String frase_may = frase.toUpperCase();//convierto a mayusculas
        System.out.println(frase_may);
        String frase_min = frase.toLowerCase(); //convierto den minuscula
        System.out.println(frase_min);
        String nombre = "alvaro                ";
        System.out.println(nombre.trim());//quita los espacios
        boolean igual = nombre.trim().equals("alvaro");//con trim sale true sin trim sale false
        System.out.println(igual);
        String nombre_may = nombre.toUpperCase();
        boolean igual2 = nombre.trim().equals("ALVARO");
        System.out.println(igual2);
        boolean iguales2 = nombre_may.equalsIgnoreCase("alvaro");
        System.out.println(iguales2);
        String cambiado = frase.replace("barcelona","Barcelona");//cambia letra
        System.out.println(cambiado);
        String frase_concatenada = frase.concat(" a llorar el barcelona");
        System.out.println(frase_concatenada);
    }
}
