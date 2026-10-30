package Bucles;

import java.util.Scanner;

public class CuantosNumeros {
    static void main(String[] args) {
         Scanner input = new Scanner(System.in);

         int numPars = 0, numImpars = 0;
         int numPos = 0, numNeg = 0;


         for(int i=1; i<=10; i++) {
             System.out.print("Numero: "+ i + ": ");
             int n = input.nextInt();
             if(n>=0) {
                 numPos++;
             }
             else{
                 numNeg++;
             }
             if(n%2==0){
                 numPars++;
             }
             else{
                 numImpars++;
             }
         }

         System.out.println("Numero Positivos: " + numPos);
        System.out.println("Numero Ngeativos: " + numNeg);
        System.out.println("Numero Parells: " + numPars);
        System.out.println("Numero Imparells: " + numImpars);

    }
}
