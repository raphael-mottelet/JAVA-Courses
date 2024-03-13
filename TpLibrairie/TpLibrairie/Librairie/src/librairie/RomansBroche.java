package librairie;

public class RomansBroche extends Romans {
    public RomansBroche(String Titre, int Annee, int Pages, double Prix) {
        super(Titre, Annee, Pages, Prix);
    }

    public void AfficheLivre() {
        System.out.println("Romans Brochés");
        System.out.println("Titre: " + this.Titre);
        System.out.println("Année: " + this.Annee);
        System.out.println("Nombre de pages: " + this.Pages);
        System.out.println("Prix: " + this.Prix + "€\n");
    }
}
