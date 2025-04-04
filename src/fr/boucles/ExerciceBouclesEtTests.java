package fr.boucles;

public class ExerciceBouclesEtTests {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        System.out.println("Afficher l'ensemble des éléments du tableau");
        for (int j : array) {
            System.out.println(j);
        }

        System.out.println("Afficher l'ensemble des éléments du tableau à l'envers");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }

        System.out.println("Afficher les éléments du tableau supérieurs à 3");
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 3) {
                System.out.println(array[i]);
            }
        }

        System.out.println("Afficher les éléments du tableaux pairs");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 ) {
                System.out.println(array[i]);
            }
        }

        System.out.println("Afficher les index du tableaux pairs");
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0 ) {
                System.out.println(i);
            }
        }

        System.out.println("Afficher les éléments du tableaux impairs");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1 ) {
                System.out.println(array[i]);
            }
        }

    }
}
