package fr.tableaux;

public class ExerciceTableauChaines {
    public static void main(String[] args) {
        String[] villes = {"Toulouse", "Montpellier", "Montauban", "Narbonne", "Nantes"};

        for (int i = 0; i < villes.length; i++) {
            System.out.println(villes[i]);
        }

        System.out.println(villes.length + " villes au total");


        villes[3] = "Reims";
        for (int i = 0; i < villes.length; i++) {
            System.out.println(villes[i]);
        }
    }
}
