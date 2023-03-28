package com.adecco.presentacion;

import java.util.Arrays;

public class ProbarArrays {
    public static void main(String[] args) {
        //Definición de Array
        int[]numeros = new int[3];
        //Para asignarle valor a la primera posicion:
        numeros[0]=10;
        numeros[1]=20;
        numeros[2]=5;
        System.out.println("Primera celda: " +numeros[0]);
        System.out.println("Segunda celda: " +numeros[1]);
        System.out.println("Tercera celda: " +numeros[2]);

        //También se puede hacer un ARRAY en DOS PARTES:
        String[] nombres; //aun no se cuantos van a ser, pero cuando ya lo sepa pongo:
        nombres = new String[3];
        nombres[0]= "Juan";
        nombres[1]= "Pedro";
        nombres[2]= "Ana";
        System.out.println("Primera celda: " +nombres[0]);
        System.out.println("Segunda celda: " +nombres[1]);
        System.out.println("Tercera celda: " +nombres[2]);

        //si quiero que me salgan todos los valores sin especificar posición:
        System.out.println(Arrays.toString(nombres));

    }
}
