package Bucles;

import java.util.Scanner;

public class TablaMultiplicar10 {
    static void main(String[] args) {

        for (int n = 1; n <= 10; n++) {
            System.out.println("Taula de Multiplicar del " + n);
            for (int i = 1; i <= 10; i++) {
                System.out.println(n + "x" + i + "=" + n * i);
            }
        }
    }
}
