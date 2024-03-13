package documents;

public class LiassePdf extends Liasse{

	public LiassePdf(int NbDocs) {
		super(NbDocs);
	}

	public void ImprimerLiasse() {
		int i;
		
		System.out.println("----- Impression PDF -----\n");

		for(i=0;(i < this.NbDocs);i++) {
			System.out.println((i+1) + "- " + this.Docs[i]);
		}
	}		

}
