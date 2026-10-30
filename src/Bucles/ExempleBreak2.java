package Bucles;

import java.util.Scanner;

public class ExempleBreak2 {
    static void main(String[] args) {

        Scanner input = new Scanner(System.in);
    int total = 0;
    int quants = 0;
    while(true){
        System.out.print("Cotinuar [S/N]: ");
        char reposta = input.next().charAt(0);

        if(reposta == 'S'){
            System.out.print("Numero: ");
            int n = input.nextInt();
            total += n;
            quants++;
        }
        else{
        break;
        }
    }
        System.out.printf("El total és %d.", total);
        System.out.printf("La mitjana és %d", total/quants);

    }
}
