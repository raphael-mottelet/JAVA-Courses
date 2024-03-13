package catalogue;

public abstract class Scooter {
	protected String Modele;
	protected String Couleur;
	protected int Puissance;
	protected int Prix;
	
	public Scooter(String Modele, String Couleur, int Puissance, int Prix) {
		this.Modele = Modele;
		this.Couleur = Couleur;
		if(Puissance > 5) {
			this.Puissance = Puissance;
		}else {
			this.Puissance = 5;
		}

		if(Prix > 50) {
			this.Prix = Prix;
		}else {
			this.Prix = 50;
		}
	}
	
	public abstract String AfficheVehicule();
}
