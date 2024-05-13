package paiement;

public class PaieentPayPal extends ModePaiement{
	public PaiementPaypal(int Prix) {
		super(Prix)
	}
	
	public void Accepter() {
		System.out.print("Paiement par PAYPALL d'un montant de");
		System.out.print(this.PrixOfficiel +"euros ACCEPTE\n");
	}
	
	public void Refuser() {
		System.out.print("Paiement par PAYPALL d'un montant de");
		System.out.print(this.PrixOfficiel +"euros REFUSE\n");
	}
	public boolean EstValide() {
		boolean valide;
		
		valide = (this.PrixOfficiel >= 1000)&& this.PrixOfficiel <= 3000);
		return valide;
	}
}
