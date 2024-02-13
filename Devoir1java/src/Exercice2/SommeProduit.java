package Exercice2;

public class SommeProduit {
    private int[] Liste = {17, 89, 6, 8, 1, 45, 4, 2, 3};

    public void affiche() {
        for (int element : Liste) {
            System.out.print(element + "\t");
        }
        System.out.println();
    }

    public int sommeImpairs() {
        int somme = 0;
        for (int element : Liste) {
            if (element % 2 != 0) {
                somme += element;
            }
        }
        return somme;
    }

    public int produitPairs() {
        int produit = 1;
        for (int element : Liste) {
            if (element % 2 == 0) {
                produit *= element;
            }
        }
        return produit;
    }
}

