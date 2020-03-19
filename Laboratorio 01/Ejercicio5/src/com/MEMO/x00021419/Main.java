package com.MEMO.x00021419;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite las letras que desee:");
        String letra = scan.nextLine();

        ArrayList<String> lista = new ArrayList<String>();

        lista.add(letra);

        System.out.print("Datos de la lista:");
        System.out.println(lista);



    }
}
