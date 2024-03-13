package documents;

public class LiasseXML extends Liasse{

	public LiasseXML(int NbDocs) {
		super(NbDocs);
	}

	public void ImprimerLiasse() {
		int i;
		
		System.out.println("----- Impression XML -----\n");

		for(i=0;(i < this.NbDocs);i++) {
			System.out.println((i+1) + "- " + this.Docs[i]);
		}
	}		

}
