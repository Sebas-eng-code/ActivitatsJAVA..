package Secuencial;

import java.util.Scanner;

public class Suma2 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter A: ");
        int a = input.nextInt();
        System.out.print("Enter B:");
        int b = input.nextInt();
        int suma;
        suma = a + b;
        System.out.print("La suma és:"); //se puede juntar en print de abajo solo poniendo delante de la doble comilla un + suma
        System.out.print(suma);
    }
}

