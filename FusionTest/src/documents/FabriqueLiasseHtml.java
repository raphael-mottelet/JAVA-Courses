 package documents;

public class FabriqueLiasseHtml extends FabriqueLiasse{
	public FabriqueLiasseHtml(int NbDocs) {
		this.MaLiasse = new LiasseHtml(NbDocs);
	}

	public void FabriqueBonDeCommande(String NomClient, String DescriptionVehicule) {
		String doc;
		
		doc = "Bon de commande HTML - Client: ";
		doc = doc + NomClient;
		doc = doc + "\nVehicule: " + DescriptionVehicule;
		
		this.MaLiasse.AjouterDocument(doc);
	}

	public void FabriqueDemandeImmatriculation(String NomClient, String DescriptionVehicule) {
		String doc;
		
		doc = "Demande d'immatriculation HTML - Client: ";
		doc = doc + NomClient;
		doc = doc + "\nVehicule: " + DescriptionVehicule;
		
		this.MaLiasse.AjouterDocument(doc);
	}


	public void FabriqueFacture(String NomClient, String DescriptionVehicule) {
		String doc;
		
		doc = "Facture HTML - Client: ";
		doc = doc + NomClient;
		doc = doc + "\nVehicule: " + DescriptionVehicule;
		
		this.MaLiasse.AjouterDocument(doc);
	}

}
