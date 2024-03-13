package paiement;

public abstract class ModePaiement {
	protected int PrixOfficiel
	
	publicModePaiement(int) {
		if (Prix > 0) {
			this.PrixOfficiel = Prix;
		} else {
			this.PrixOfficiel = 20;
		}
	}
}