package librairie;

public class BDBroche extends BD {
    public BDBroche(String Titre, int Annee, int Pages, double Prix) {
        super(Titre, Annee, Pages, Prix);
    }

    public void AfficheLivre() {
        System.out.println("BD Broché");
        System.out.println("Titre: " + this.Titre);
        System.out.println("Année: " + this.Annee);
        System.out.println("Pages: " + this.Pages);
        System.out.println("Prix: " + this.Prix + "€\n");
    }
}
