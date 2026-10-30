package Bucles;

import java.util.Scanner;

public class SusecionesAritmeticas {
    static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("N: ");
         int n = input.nextInt();

         int p =1;

         for(int i=0; i<n; i++){
             System.out.println("X" + i + ": " + p);
         }
    }

}
