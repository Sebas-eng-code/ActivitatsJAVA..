package Secuencial;

import java.util.Scanner;

import static java.lang.Math.PI;

public class Area {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // imput R
        int r = input.nextInt();
        // calcul del area
        double area = PI* r * r;

        // ouput area
        System.out.println("AREA: " + area);
    }
}
