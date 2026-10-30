package Funcions;

public class PrimeraFuncio {

    static void main(String[] args) {
        imprimirNumero();
        imprimirNumeroFins(5);
        imprimirNumeroDesdeFins(5,10);
    }

    static void imprimirNumero() {


        for(int i=1; i<=10; i++){
            System.out.println(i);
        }

    }

    static void imprimirNumeroFins(int n) {

        for(int i=1; i<=10; i++){
            System.out.println(i);
        }
    }
    static void imprimirNumeroDesdeFins(int a, int b) {

        for(int i=a; i<=b; i++){
            System.out.println(i);
        }
    }
}
