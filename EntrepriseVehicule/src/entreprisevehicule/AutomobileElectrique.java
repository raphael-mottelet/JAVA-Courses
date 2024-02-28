package entreprisevehicule;

public class AutomobileElectrique extends Automobile {
	public AutomobileElectrique(String Modele, String Couleur, int Puissance, double Masse) {
		super(Modele,Couleur,Puissance, Masse);
	}
	public void AfficheVehicule() {
		System.out.print("Automobile electrique ");
		System.out.print(this.Modele + " ");
		System.out.print(this.Couleur +" ");
		System.out.print(this.Puissance +" ");
		System.out.println(this.Masse + "\n");

	}
}
