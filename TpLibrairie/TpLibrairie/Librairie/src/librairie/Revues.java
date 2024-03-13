package librairie;

public abstract class Revues {
    protected String Titre;
    protected int Pages;
    protected double Prix;
    protected String Editeur;
    
    public Revues(String Titre, int Pages, double Prix, String Editeur) {
        this.Titre = Titre;
        this.Pages = Pages;
        this.Prix = Math.max(1.0, Prix);
        this.Editeur = Editeur;
    }
    
    public abstract void AfficheLivre();
}
