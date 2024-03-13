package librairie;

public class RomansRelie extends Romans {
    public RomansRelie(String Titre, int Annee, int Pages, double Prix) {
        super(Titre, Annee, Pages, Prix);
    }

    public void AfficheLivre() {
        System.out.println("Romans Reliés ");
        System.out.println("Titre: " + this.Titre);
        System.out.println("Année: " + this.Annee);
        System.out.println("Nombre de pages: " + this.Pages);
        System.out.println("Prix: " + this.Prix + "€\n");
    }
}
