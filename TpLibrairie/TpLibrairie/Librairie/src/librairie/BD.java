package librairie;

public abstract class BD {
	protected String Titre;
	protected int Annee;
	protected int Pages;
	protected double Prix;
	
	public BD(String Titre, int Annee, int Pages, double Prix) {
		this.Titre = Titre;
		this.Annee = Annee;
		this.Pages = Pages;
		
		if(Prix <1) {
			this.Prix = 1.0;
		}
		else {
			this.Prix = Prix;
		}
	}
	public abstract void AfficheLivre();

}
