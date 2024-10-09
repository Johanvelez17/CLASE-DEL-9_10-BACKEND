package org.example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args)
    {
        Scanner lea = new Scanner(System.in);
        String nombre;
        System.out.println("Digita tu nombre");
        nombre = lea.nextLine();

        //1. Se consulta una expresion regular
        //Almacenandola en una variable de tipo string
        String expresionRegular = "^\\d{9}$";

        //2. ctivar el patron
        Pattern patron = Pattern.compile(expresionRegular);

        // 3. Se busca coincidencia entre la cadena y el patron
        Matcher coincidencia = patron.matcher();

        // 4. Indico si hubo o no hubo coincidencia

        if(coincidencia.find()){
            System.out.println("nombre exitoso, cumple el patron");
        }else{
            System.out.println("falla el formato del nombre digitado");
        }
    }
}