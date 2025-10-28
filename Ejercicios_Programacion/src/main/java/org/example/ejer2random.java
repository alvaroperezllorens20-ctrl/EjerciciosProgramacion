package org.example;

import java.util.Random;

public class ejer2random {
    static void main() {
        Random aleatorio = new Random();

        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String contra = "";
        for (int i = 0; i<12;i++){
            contra += caracteres.charAt(aleatorio.nextInt(caracteres.length()-1));
        }
        System.out.println(contra);
    }
}
