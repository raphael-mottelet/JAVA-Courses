package documents;

public abstract class FabriqueLiasse {
	protected Liasse MaLiasse;
	
	public abstract void FabriqueBonDeCommande(String NomClient, String DescriptionVehicule);
	public abstract void FabriqueDemandeImmatriculation(String NomClient, String DescriptionVehicule);
	public abstract void FabriqueFacture(String NomClient, String DescriptionVehicule);
	
	public Liasse DonneLiasse() {
		return MaLiasse;
	}
}
