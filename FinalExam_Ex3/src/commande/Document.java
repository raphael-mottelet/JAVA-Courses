package commande;

public abstract class Document {
    protected String clientName;
    protected int appareilId;
    protected double prix;
    protected int garantie;
    protected String format;

    public String getClientName() {
        return clientName;
    }

    public int getAppareilId() {
        return appareilId;
    }

    public double getPrix() {
        return prix;
    }

    public int getGarantie() {
        return garantie;
    }

    public String getFormat() {
        return format;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public void setAppareilId(int appareilId) {
        this.appareilId = appareilId;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public void setGarantie(int garantie) {
        this.garantie = garantie;
    }

    public void setFormat(String format) {
        this.format = format;
    }
}
