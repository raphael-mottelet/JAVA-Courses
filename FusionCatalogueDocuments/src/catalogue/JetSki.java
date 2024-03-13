package catalogue;

public abstract class JetSki {
	protected String Modele;
	protected String Couleur;
	protected int Puissance;
	protected double Masse;
	protected int Prix;
	
	public JetSki(String Modele, String Couleur, int Puissance, double Masse, int Prix) {
		this.Modele = Modele;
		this.Couleur = Couleur;
		
		if(Puissance > 60) {
			this.Puissance = Puissance;
		}else {
			this.Puissance = 60;
		}
		
		if(Masse > 500) {
			this.Masse = Masse;
		}else {
			this.Masse = 500;
		}

		if(Prix > 50) {
			this.Prix = Prix;
		}else {
			this.Prix = 50;
		}
	}
	
	public abstract String AfficheVehicule();

}
