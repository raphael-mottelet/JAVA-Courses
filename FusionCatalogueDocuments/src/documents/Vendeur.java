package documents;

public class Vendeur {
	private FabriqueLiasse FabriqueDuVendeur;
	
	public Vendeur(FabriqueLiasse FabriqueDuClient) {
		this.FabriqueDuVendeur = FabriqueDuClient;
	}
	
	public Liasse FabriqueDocuments(String NomClient, String DescriptionVehicule) {
		Liasse LiasseDuVendeur;
		this.FabriqueDuVendeur.FabriqueBonDeCommande(NomClient, DescriptionVehicule);
		this.FabriqueDuVendeur.FabriqueDemandeImmatriculation(NomClient, DescriptionVehicule);
		this.FabriqueDuVendeur.FabriqueFacture(NomClient, DescriptionVehicule);
		LiasseDuVendeur = this.FabriqueDuVendeur.DonneLiasse();
		return LiasseDuVendeur;
	}
}
