package Recursius;

public class CompteEnrera {

    public static void compteEnrera(int n){
        compteEnrera(10);
        if(n==0){
            System.out.print("BOOOOOOOOOM!!!!");
        }
        else{
            System.out.print(n +", ");
            compteEnrera(n-1);
        }
    }

}
