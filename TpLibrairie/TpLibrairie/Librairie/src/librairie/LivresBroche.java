package librairie;

public class LivresBroche implements Livres {
    public BD CreerBD(String Titre, int Annee, int Pages, double Prix) {
        return new BDBroche(Titre, Annee, Pages, Prix);
    }

    public Revues CreerRevues(String Titre, int Pages, double Prix, String Editeur) {
        return new RevuesBroche(Titre, Pages, Prix, Editeur);
    }

    public Romans CreerRomans(String Titre, int Annee, int Pages, double Prix) {
        return new RomansBroche(Titre, Annee, Pages, Prix);
    }
}
