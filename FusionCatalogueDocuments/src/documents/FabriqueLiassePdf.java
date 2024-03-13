package documents;

public class FabriqueLiassePdf extends FabriqueLiasse{
	public FabriqueLiassePdf(int NbDocs) {
		this.MaLiasse = new LiassePdf(NbDocs);
	}

	public void FabriqueBonDeCommande(String NomClient, String DescriptionVehicule) {
		String doc;
		
		doc = "Bon de commande PDF - Client: ";
		doc = doc + NomClient;
		doc = doc + "\nVehicule: " + DescriptionVehicule;
		
		this.MaLiasse.AjouterDocument(doc);
	}

	public void FabriqueDemandeImmatriculation(String NomClient, String DescriptionVehicule) {
		String doc;
		
		doc = "Demande d'immatriculation PDF - Client: ";
		doc = doc + NomClient;
		doc = doc + "\nVehicule: " + DescriptionVehicule;
		
		this.MaLiasse.AjouterDocument(doc);
	}

	public void FabriqueFacture(String NomClient, String DescriptionVehicule) {
		String doc;
		
		doc = "Facture PDF - Client: ";
		doc = doc + NomClient;
		doc = doc + "\nVehicule: " + DescriptionVehicule;
		
		this.MaLiasse.AjouterDocument(doc);
	}

}
