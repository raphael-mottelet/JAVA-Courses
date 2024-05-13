package commande;

public class FactureBuilder implements DocumentBuilder {
    private FactureDocument document;

    public FactureBuilder() {
        this.document = new FactureDocument();
    }

    public void construirePartieClient(String nomClient) {
        document.setClientName(nomClient);
    }

    public void construirePartieIdentifiantAppareil(int identifiantAppareil) {
        document.setAppareilId(identifiantAppareil);
    }

    public void construirePartiePrix(int prix) {
        document.setPrix(prix);
    }

    public void construirePartieDureeGarantie(int dureeGarantie) {
    }

    public Document getDocument() {
        return document;
    }
}
