package fr.boucles;

public class ExerciceTableauEntier {
    public static void main(String[] args) {
        int [] tabEntier = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        System.out.println(tabEntier[0]);
        System.out.println(tabEntier.length);
        System.out.println(tabEntier[tabEntier.length-1]);
        tabEntier[4] = 8;
        System.out.println(tabEntier[4]);
    }
}
