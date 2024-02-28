package entreprisevehicule;

public abstract class Scooter {
	protected String Modele;
	protected String Couleur;
	protected int Puissance;
	public Scooter(String Modele, String Couleur, int Puissance) {
		this.Modele = Modele;
		this.Couleur = Couleur;
		
		if(Puissance < 5) {
			this.Puissance = 5;
		}else {
			this.Puissance = Puissance;
		}
	}
	public abstract void AfficheVehicule();

}
