package Condicionales;

import java.util.Scanner;

public class condicionales {
    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Edat: ");
        int edat = input.nextInt();

        String m = (edat>=18) ? "Major d'edat" :  "Menor d'edat";

        System.out.println("Ets " + m);

    }
}
