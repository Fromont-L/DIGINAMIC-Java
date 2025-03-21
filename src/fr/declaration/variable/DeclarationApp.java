package fr.declaration.variable;

public class DeclarationApp {
    public static void main(String[]args){
        byte unByte = 1;
        short petitNombre = 23;
        int entierClassique = 243;
        long grosEntier = 500_000_000;
        float aVirgule = 1.1f;
        double aVirguleMaisMieux = 2.2;
        char unSeulCaractere = 'e';
        char caractereUnicode = '\u0043';
        boolean vraiOuFaux = true;
        String unTexte = "Un super texte";

        // double > float > long > int > short > byte
        // ex : double h = 10.0f;
        // ex : double l = 100L;

        System.out.println(unByte);
        System.out.println(petitNombre);
        System.out.println(entierClassique);
        System.out.println(grosEntier);
        System.out.println(aVirgule);
        System.out.println(aVirguleMaisMieux);
        System.out.println(unSeulCaractere);
        System.out.println(caractereUnicode);
        System.out.println(vraiOuFaux);
        System.out.println(unTexte);


    }



}
