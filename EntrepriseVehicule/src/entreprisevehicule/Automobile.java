package entreprisevehicule;

public abstract class Automobile {
	protected String Modele;
	protected String Couleur;
	protected int Puissance;
	protected double Masse;
	public Automobile(String Modele, String Couleur, int Puissance, double Masse) {
		this.Modele = Modele;
		this.Couleur = Couleur;
		
		if(Puissance < 10) {
			this.Puissance = 10;
		}else {
			this.Puissance = Puissance;
		}
		if(Masse < 500.00) {
			this.Masse = 500.0;
		}else {
			this.Masse = Masse;
		}
	}
	public abstract void AfficheVehicule();

}