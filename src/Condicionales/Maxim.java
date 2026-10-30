package Condicionales;

import java.util.Scanner;

public class Maxim {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("A ");
        int a = input.nextInt();

        System.out.print("b ");
        int b = input.nextInt();

        if(a>b){
            System.out.println("El màxim és :" + a);

        }
        else{
            System.out.println("El màxim és :" + b);
        }
    }
}
