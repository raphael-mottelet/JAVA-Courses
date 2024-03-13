package librairie;

public interface Livres {
    Romans CreerRomans(String Titre, int Annee, int Pages, double Prix);
    BD CreerBD(String Titre, int Annee, int Pages, double Prix);
    Revues CreerRevues(String Titre, int Pages, double Prix, String Editeur);
}
