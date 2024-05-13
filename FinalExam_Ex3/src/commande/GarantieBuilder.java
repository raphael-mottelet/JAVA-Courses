package commande;

public class GarantieBuilder implements DocumentBuilder {
    private GarantieDocument document;

    public GarantieBuilder() {
        this.document = new GarantieDocument();
    }

    public void construirePartieClient(String nomClient) {
        document.setClientName(nomClient);
    }

    public void construirePartieIdentifiantAppareil(int identifiantAppareil) {
        document.setAppareilId(identifiantAppareil);
    }

    public void construirePartiePrix(int prix) {
    }

    public void construirePartieDureeGarantie(int dureeGarantie) {
        document.setGarantie(dureeGarantie);
    }

    public Document getDocument() {
        return document;
    }
}
