package commande;

public class FactureDocument extends Document {

    public FactureDocument() {
        this.format = "PDF";
    }
    
    @Override
    public String toString() {
        return "FactureDocument{" +
                "clientName='" + clientName + '\'' +
                ", appareilId=" + appareilId +
                ", prix=" + prix +
                ", format='" + format + '\'' +
                '}';
    }

    public void afficherDetailsFacture() {
        System.out.println("Facture pour : " + this.clientName);
        System.out.println("Appareil ID : " + this.appareilId);
        System.out.println("Prix : " + this.prix);
    }
}
