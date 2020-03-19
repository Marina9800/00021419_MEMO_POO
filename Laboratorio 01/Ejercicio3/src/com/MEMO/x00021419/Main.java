package com.MEMO.x00021419;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        do {
            System.out.print("Digite un numero:");
            n = scan.nextInt();
            scan.nextLine();
        } while (n <= 0);
        numero(n);

    }


    public static void numero(int n) {
        for(int i = 1; i<=n;i++) {
        System.out.print(i);

        }
        for(int i = 1; i<n;i++) {
        System.out.print(n-i);
        }

    }
}
