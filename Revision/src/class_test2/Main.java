package class_test2;

public class Main {
    public static void main(String[] args) {
        // Création d'un compte avec un solde initial de 1000
        CompteBancaire compte = new CompteBancaire(1000);

        // Dépôt de 500 sur le compte
        compte.deposer(500);

        // Affichage du solde actuel
        System.out.println("Solde actuel: " + compte.consulterSolde());
    }
}
