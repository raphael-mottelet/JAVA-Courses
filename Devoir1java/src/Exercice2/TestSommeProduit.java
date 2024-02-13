package Exercice2;

public class TestSommeProduit {
    public static void main(String[] args) {
        SommeProduit sommeProduit = new SommeProduit();
        
        System.out.println("Liste :");
        sommeProduit.affiche();
        
        int sommeImpairs = sommeProduit.sommeImpairs();
        System.out.println("Somme des éléments impairs : " + sommeImpairs);
        
        int produitPairs = sommeProduit.produitPairs();
        System.out.println("Produit des éléments pairs : " + produitPairs);
    }
}