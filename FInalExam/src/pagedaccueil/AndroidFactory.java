package pagedaccueil;

public class AndroidFactory implements AppareilFactory {
    @Override
    public Appareil creerTelephoneMobile(String marque, int serie, String versionSysteme, int prix) {
        return new TelephoneMobile(versionSysteme, prix, versionSysteme, prix);
    }

    @Override
    public Appareil creerTablette(String marque, int serie, String versionSysteme, int prix) {
        return new Tablette(versionSysteme, prix, versionSysteme, prix);
    }
}
