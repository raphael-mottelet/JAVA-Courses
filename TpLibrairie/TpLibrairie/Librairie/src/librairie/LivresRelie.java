package librairie;

public class LivresRelie implements Livres {
    public BD CreerBD(String Titre, int Annee, int Pages, double Prix) {
        return new BDRelie(Titre, Annee, Pages, Prix);
    }

    public Revues CreerRevues(String Titre, int Pages, double Prix, String Editeur) {
        return new RevuesRelie(Titre, Pages, Prix, Editeur);
    }

    public Romans CreerRomans(String Titre, int Annee, int Pages, double Prix) {
        return new RomansRelie(Titre, Annee, Pages, Prix);
    }
}
