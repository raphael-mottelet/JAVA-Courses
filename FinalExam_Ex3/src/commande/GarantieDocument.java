package commande;

public class GarantieDocument extends Document {

    private int dureeGarantie;

    public GarantieDocument() {
        this.format = "HTML";
    }

    public int getDureeGarantie() {
        return dureeGarantie;
    }

    public void setDureeGarantie(int dureeGarantie) {
        this.dureeGarantie = dureeGarantie;
    }

    public void afficherDetailsGarantie() {
        System.out.println("Garantie pour : " + this.clientName);
        System.out.println("Appareil ID : " + this.appareilId);
        System.out.println("Durée de la garantie : " + this.dureeGarantie + " mois");
    }
}
