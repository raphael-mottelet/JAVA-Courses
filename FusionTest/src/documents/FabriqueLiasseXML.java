package documents;

public class FabriqueLiasseXML extends FabriqueLiasse{
	public FabriqueLiasseXML(int NbDocs) {
		this.MaLiasse = new LiasseXML(NbDocs);
	}

	public void FabriqueBonDeCommande(String NomClient, String DescriptionVehicule) {
		String doc;
		
		doc = "Bon de commande XML - Client: ";
		doc = doc + NomClient;
		doc = doc + "\nVehicule: " + DescriptionVehicule;
		
		this.MaLiasse.AjouterDocument(doc);
	}

	public void FabriqueDemandeImmatriculation(String NomClient, String DescriptionVehicule) {
		String doc;
		
		doc = "Demande d'immatriculation XML - Client: ";
		doc = doc + NomClient;
		doc = doc + "\nVehicule: " + DescriptionVehicule;
		
		this.MaLiasse.AjouterDocument(doc);
	}

	public void FabriqueFacture(String NomClient, String DescriptionVehicule) {
		String doc;
		
		doc = "Facture XML - Client: ";
		doc = doc + NomClient;
		doc = doc + "\nVehicule: " + DescriptionVehicule;
		
		this.MaLiasse.AjouterDocument(doc);
	}

}
