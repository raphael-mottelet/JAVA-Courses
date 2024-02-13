package Exercice1;

public class Matrice {
    private int[][] T = {
        {1, 5, -3, 4},
        {2, 14, 0, -7},
        {8, 11, 20, 3}
    };

    public void Affiche() {
        for (int[] ligne : T) {
            for (int valeur : ligne) {
                System.out.print(valeur + "\t");
            }
            System.out.println();
        }
    }

    public void AfficheTransposee() {
        for (int j = 0; j < T[0].length; j++) {
            for (int i = 0; i < T.length; i++) {
                System.out.print(T[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
