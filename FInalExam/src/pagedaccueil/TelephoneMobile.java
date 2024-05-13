package pagedaccueil;

public class TelephoneMobile extends Appareil {
    private String marque;
    private int serie;
    private String versionSysteme;
    private int prix;

    public TelephoneMobile(String marque, int serie, String versionSysteme, int prix) {
        this.marque = marque;
        this.serie = serie;
        this.versionSysteme = versionSysteme;
        this.prix = prix;
    }

    public String getMarque() {
        return marque;
    }

    public int getSerie() {
        return serie;
    }

    public String getVersionSysteme() {
        return versionSysteme;
    }

    public int getPrix() {
        return prix;
    }

    public String toString() {
        return "Type: Téléphone Mobile, Marque: " + marque + ", Série: " + serie +
               ", Version Système: " + versionSysteme + ", Prix: " + prix + "€";
    }
}
