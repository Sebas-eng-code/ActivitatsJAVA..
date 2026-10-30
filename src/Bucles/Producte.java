package Bucles;

import java.util.Scanner;

public class Producte {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("A: ");
        int a = input.nextInt();

        System.out.print("B: ");
        int b = input.nextInt();

        int p = 0;
        int i = 1;
        while(i<=a){
            p = p + b;
            i = i + 1;
        }
    }

}
