package fr.tableaux;

public class ExerciceDeclarationTab {
    public static void main(String[] args) {
        int[] listeDeNombreEntiers = new int[8];
        listeDeNombreEntiers[0] = 8;
        listeDeNombreEntiers[1] = -7;
        listeDeNombreEntiers[2] = 12;
        listeDeNombreEntiers[3] = 1;
        listeDeNombreEntiers[4] = -2;
        listeDeNombreEntiers[5] = 14;
        listeDeNombreEntiers[6] = 17;
        listeDeNombreEntiers[7] = 9;


        System.out.println(listeDeNombreEntiers[0]);
        System.out.println(listeDeNombreEntiers.length);
        System.out.println(listeDeNombreEntiers[7]);
        for (int i = 0; i < listeDeNombreEntiers.length; i++) {
            System.out.println(listeDeNombreEntiers[i]);
        }

        // Le code en dessous fera l'erreur suivante :
        // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 8
        //at fr.tableaux.ExerciceDeclarationTab.main(ExerciceDeclarationTab.java:27)
        // Car cela dépasse le nombre d'index possible dans la liste (total actuel = 8)
        // System.out.println(listeDeNombreEntiers[10]);
    }
}
