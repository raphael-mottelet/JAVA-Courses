package class_test;

public class MaClasse {
    // Membre privé
    private int maVariablePrivee;

    // Constructeur
    public MaClasse(int valeurInitiale) {
        this.maVariablePrivee = valeurInitiale;
    }

    // Méthode publique pour accéder à maVariablePrivee
    public int getMaVariablePrivee() {
        return maVariablePrivee;
    }

    // Méthode publique pour modifier maVariablePrivee
    public void setMaVariablePrivee(int nouvelleValeur) {
        this.maVariablePrivee = nouvelleValeur;
    }
}
