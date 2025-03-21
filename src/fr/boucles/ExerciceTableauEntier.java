package fr.boucles;

public class ExerciceTableauEntier {
    public static void main(String[] args) {
        int[] tousLesEntiers = {1 ,2 ,3 ,4 ,5, 6, 7, 8, 9, 10};
        System.out.println(tousLesEntiers[0]);


        System.out.println(tousLesEntiers.length);

        System.out.println(tousLesEntiers[tousLesEntiers.length -1]);

        tousLesEntiers[4] = 8;
        System.out.println(tousLesEntiers[4]);
    }
}
