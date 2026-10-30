package Variable;

import java.util.Scanner;

public class variable22 {
    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Què te diven?");
        String nom = input.next();

        System.out.print("Quan anys tens?");
        int edat = input.nextInt();

        System.out.print("Quant medixes?");
        float altura = input.nextFloat();

        System.out.print("Quin grup ets?");
        char grup = input.next(). charAt(0);

        System.out.print("Ets major d'edat?");
        boolean majorEdat = input.nextBoolean();

        System.out.print("Nom: " + nom + ", tenc" + edat+ " anys" +
                "medeixo " + altura + "cm");
    }
}
