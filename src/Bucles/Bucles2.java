package Bucles;

// ACT 15 - Iprimir els números del 100 a l'1

public class Bucles2 {


    static void main(String[] args) {
        // For
        for (int i = 100; i >0; i = i - 1) {
            System.out.print(i + ", ");
        }

        System.out.println();
        //While
        int i = 100;
        while (i>0) {
            System.out.print(i + ", ");
            i = i - 1;
        }
        System.out.println();
        // Do- while
        int j = 1;
        do {

        } while (j <= 100);
    }
}
