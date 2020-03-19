package com.MEMO.x00021419;

import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int n,num1,num2;

        do{
            System.out.print("Digite un numero mayor a 1:");
            n=in.nextInt(); in.nextLine();
        }while(n<=1);

        System.out.println("Los " + n + " primeros terminos de la serie fibonacci son: ");

        num1=1;
        num2=1;

        System.out.println(num1+"");
        for(int i=2;i<=n;i++){
            System.out.println(num2+"");
            num2=num1+num2;
            num1=num2-num1;
        }
        System.out.println();


    }
}
