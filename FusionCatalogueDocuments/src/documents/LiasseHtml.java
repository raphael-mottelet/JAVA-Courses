package documents;

public class LiasseHtml extends Liasse{

	public LiasseHtml(int NbDocs) {
		super(NbDocs);
	}

	public void ImprimerLiasse() {
		int i;
		
		System.out.println("----- Impression HTML -----\n");

		for(i=0;(i < this.NbDocs);i++) {
			System.out.println((i+1) + "- " + this.Docs[i]);
		}
	}		

}
