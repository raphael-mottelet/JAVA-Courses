package commande;

public interface DocumentBuilder {
    void construirePartieClient(String nomClient);
    void construirePartieIdentifiantAppareil(int identifiantAppareil);
    void construirePartiePrix(int prix);
    void construirePartieDureeGarantie(int dureeGarantie);
    Document getDocument();
}
