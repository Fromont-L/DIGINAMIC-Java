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
        // Retourne 11 car 10 + 1
        System.out.println(a);

        // Pré-incrémentation
        // ++a
        // Post-incrémentation
        a++;
        // Retourne 12 car 11 + 1
        System.out.println(a);


        String c = a>0 ? "a est plus grand que 0" : "a est inférieur à 0";
        // Retourne "a est plus grand que 0"
        System.out.println(c);




        // Tests
        // String ch1 = "coucou"; // On crée une chaîne de caractère avec l'opérateur coucou stocké dans le String pool
        // String ch2 = "coucou"; // coucou existe déjà dans le String pool et donc ch2 référence la même zone mémoire
        String ch3 = new String("coucou"); // ici je ne'utilise pas l'oprateur " donc String pool pas utilisé

        String ch1 = new String("coucou");
        String ch2 = new String("coucou");

        if (ch3==ch2) { // Le "==" sur des objets compare les adresses mémoires
            System.out.println("Egal");
        } else {
            System.out.println("Diff");
        }

        if (ch1.equals(ch3)) {
            System.out.println("Egal");
        } else {
            System.out.println("Diff");
        }



    }
}
