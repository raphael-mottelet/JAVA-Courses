package librairie;

public class RevuesRelie extends Revues {
    public RevuesRelie(String Titre, int Pages, double Prix, String Editeur) {
        super(Titre, Pages, Prix, Editeur);
    }

    public void AfficheLivre() {
        System.out.println("Revues Reliées");
        System.out.println("Titre: " + this.Titre);
        System.out.println("Nombre de pages: " + this.Pages);
        System.out.println("Prix: " + this.Prix + "€");
        System.out.println("Éditeur: " + this.Editeur + "\n");
    }
}
