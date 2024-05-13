package pagedaccueil;

public interface AppareilFactory {
    Appareil creerTelephoneMobile(String marque, int serie, String versionSysteme, int prix);
    Appareil creerTablette(String marque, int serie, String versionSysteme, int prix);
}
