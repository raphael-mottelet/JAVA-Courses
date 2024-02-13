package class_test2;

public class CompteBancaire {
    // Membre privé
    private double solde;

    // Constructeur
    public CompteBancaire(double soldeInitial) {
        this.solde = soldeInitial;
    }

    // Méthode publique pour déposer de l'argent sur le compte
    public void deposer(double montant) {
        if (montant > 0) {
            solde += montant;
            System.out.println("Dépôt de " + montant + " effectué. Nouveau solde: " + solde);
        } else {
            System.out.println("Le montant du dépôt doit être positif.");
        }
    }

    // Méthode publique pour consulter le solde
    public double consulterSolde() {
        return solde;
    }
}
