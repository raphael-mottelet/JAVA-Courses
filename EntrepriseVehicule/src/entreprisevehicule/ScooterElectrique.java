package entreprisevehicule;

public class ScooterElectrique extends Scooter{
	public ScooterElectrique(String Modele, String Couleur, int Puissance) {
		super(Modele,Couleur,Puissance);
	}
	public void AfficheVehicule() {
		System.out.print("Scooter electrique");
		System.out.print(this.Modele+"");
		System.out.print(this.Couleur+"");
		System.out.print(this.Puissance+"\n");
	}
}
