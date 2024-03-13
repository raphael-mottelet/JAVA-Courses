package catalogue;

public class ScooterEssence extends Scooter {
	public ScooterEssence(String Modele, String Couleur, int Puissance) {
		super(Modele,Couleur,Puissance);
	}
	public void AfficheVehicule() {
		System.out.print("Scooter essence ");
		System.out.print(this.Modele + " ");
		System.out.print(this.Couleur +" ");
		System.out.println(this.Puissance +"\n");

	}

}