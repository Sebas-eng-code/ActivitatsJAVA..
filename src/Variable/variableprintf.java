package Variable;

public class variableprintf {
    static void main(String[] args) {

        String nom ="Sebastian", llinatge ="Chacin";
        int edat = 17;
        float altura = 1.75f;
        char grup = 'b';
        boolean majorEdat = false;

        System.out.printf("Hola, Som en %s %s.%nTenc %d", nom, llinatge, edat);
        System.out.printf("Medeixo %f metres i el meu grupo de bachiller %c.", altura, grup);
        System.out.printf("Som major d'edat? %b", majorEdat);
    }
}
