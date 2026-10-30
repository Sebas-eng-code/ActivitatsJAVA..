package Strings;

public class Strings1 {
    static void main(String[] args) {

        String nom = "Sebastian";
        System.out.println(nom);

        int n = nom.length();  // 4
        int posO= nom.indexOf('o');  // 1
        int posZ= nom.indexOf('z');  // -1
        int posDarreraO = nom.lastIndexOf('o'); //1

        char primera = nom.charAt(0); // 'S'
        char derrera = nom.charAt(nom.length()-1); // 'n'

        String part1 = nom.substring(2); // "an"
        String part2 = nom.substring(1,3); // "ian"
        String junts = "Alumno" + nom; // "AlumnoSebastian"
        String trabajo = "Alumno";
        String junts2 = nom.concat("Alumno"); // "AlumnoSebastian"
        String nomMaj = nom.toUpperCase(); // "SEBASTIAN"
        String nomMin = nom.toLowerCase(); // "sebastian"

        boolean començaS = nom.startsWith("S"); // true
        boolean començas = nom.startsWith("s"); // false
        boolean acabaI= nom.endsWith("I"); // false
        boolean acabaian = nom.endsWith("ian"); // true



    }
}
