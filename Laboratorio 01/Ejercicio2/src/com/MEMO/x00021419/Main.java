package com.MEMO.x00021419;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite la palabra: ");
        String palabra=scan.nextLine();
        palindrome(palabra);

    }
    static void palindrome(String palabra){
        int fin=palabra.length()-1;
        int inicio=0;
        boolean palindrome=true;
        while(inicio<fin){
            if(palabra.charAt(inicio)!=palabra.charAt(fin)){
                palindrome=false;
            }
            inicio++;
            fin--;
        }
        if(palindrome){
            System.out.println("La palabra es palindrome");
        }else{
            System.out.println("La palabra NO es palindrome");
        }



    }



}
