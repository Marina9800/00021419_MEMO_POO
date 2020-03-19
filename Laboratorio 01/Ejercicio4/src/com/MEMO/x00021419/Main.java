package com.MEMO.x00021419;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite una cadena de texto:");
        String cadena = scan.nextLine();

        cadena=cadena.replace('a','b').replace('A','B');

        System.out.print("Cadena modificada:");
        System.out.println(cadena);

    }

}
