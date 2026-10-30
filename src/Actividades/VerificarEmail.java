package Actividades;

import java.util.Scanner;

public class VerificarEmail {
    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("EMAIL: ");
        String email = input.next();


        int posAt = email.indexOf('@');
        int posDot = email.indexOf('.');
        int llarg = email.length();



        int nom = posAt;
        int domini = posDot - posAt - 1;
        int extensio = llarg - posDot - 1;

        if(nom>=3 && domini>=3 && (extensio==2 || extensio ==3)){
            System.out.println("Email Vàlid.");
        }
        else{
            System.out.println("Email no vàlid.");
        }
    }
}
