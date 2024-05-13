package commande;

public class Directeur {
    private DocumentBuilder builder;

    public Directeur(DocumentBuilder builder) {
        this.builder = builder;
    }

    public void construireDocument(String nomClient, int identifiantAppareil, int prix, int dureeGarantie, int format) {
        builder.construirePartieClient(nomClient);
        builder.construirePartieIdentifiantAppareil(identifiantAppareil);
        if ("PDF".equals(format)) {
            builder.construirePartiePrix(prix);
        } else if ("HTML".equals(format)) {
            builder.construirePartieDureeGarantie(dureeGarantie);
        }
    }

    public Document getDocument() {
        return builder.getDocument();
    }
}
