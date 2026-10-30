package Recursius;

public class GirarParaula {

    static void main(String[] args) {
        System.out.printf("%s al rves es %s.", "hola", girar("hola"));
    }

    public static String girar(String p) {
        if(p.length()==1) {
            return p;
        }
        else{
            char primera = p.charAt(0);
            String subparaula = p.substring(1);
            return girar(subparaula) + primera;
        }
    }
}
