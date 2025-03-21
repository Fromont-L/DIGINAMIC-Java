package fr.operateur;

public class DeclarationOperateur {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        boolean testEt = a>0 && b<10;
        // Retourne false
        System.out.println(testEt);


        boolean testOu = a>0 || b<10;
        // Retourne true
        System.out.println(testOu);


        a=a+1;
        // Retourne 11
        System.out.println(a);


        a++;
        // Retourn 12
        System.out.println(a);


        String c = a>0 ? "a est plus grand que 0" : "a est inférieur à 0";
        // Retourne "a est plus grand que 0"
        System.out.println(c);


    }
}
