package Recursius;

public class RecursiusPar {
    static void main(String[] args) {
        System.out.printf("%d és pa? %d.%n", 8, par(8));
        System.out.printf("%d és impar? %d.%n", 8, impar(8));
    }

    public static boolean par(int n){
        if(n==0){
            return true;
        }
        else{
            return impar(n-1);
        }
    }
    public static boolean impar(int n){
        if(n==0){
            return false;
        }
        else{
            return par(n-1);
        }
    }

}
