package librairie;

public class RevuesBroche extends Revues {
    public RevuesBroche(String Titre, int Pages, double Prix, String Editeur) {
        super(Titre, Pages, Prix, Editeur);
    }

    public void AfficheLivre() {
        System.out.println("Revues Brochées");
        System.out.println("Titre: " + this.Titre);
        System.out.println("Nombre de pages: " + this.Pages);
        System.out.println("Prix: " + this.Prix + "€");
        System.out.println("Éditeur: " + this.Editeur + "\n");
    }
}
