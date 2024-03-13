package catalogue;

public class ScooterHybride extends Scooter {
	public ScooterHybride(String Modele, String Couleur, int Puissance) {
		super(Modele,Couleur,Puissance);
	}
	public void AfficheVehicule() {
		System.out.print("Scooter hybride ");
		System.out.print(this.Modele + " ");
		System.out.print(this.Couleur +" ");
		System.out.println(this.Puissance +"\n");

	}

}
