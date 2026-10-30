package Condicionales;

import java.util.Scanner;

public class Switch {
    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Grup: ");
        char grup = input.next().charAt(0);

        switch (grup){
            case 'A' : System.out.println("Socials"); break;
            case 'B' : System.out.println("Cientific"); break;
            case 'C' : System.out.println("Tecnologic"); break;
            default:System.out.println("General");
        }

    }
}
