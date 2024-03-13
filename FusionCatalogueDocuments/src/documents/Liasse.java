package documents;

public abstract class Liasse {
	protected int MaxDocs;
	protected int NbDocs;
	protected String [] Docs;
	
	public Liasse(int NbDocs) {
		int i;
		
		this.NbDocs = 0;
		
		if(NbDocs > 0) {
			this.MaxDocs = NbDocs;
		}else {
			this.MaxDocs = 1;
		}
		
		this.Docs = new String[this.MaxDocs];
		
		for(i=0;(i<this.MaxDocs);i++) {
			this.Docs[i] = "";
		}
		
	}


	public void AjouterDocument(String doc) {
		if(this.NbDocs < this.MaxDocs) {
			this.Docs[this.NbDocs] = doc;
			this.NbDocs++;
		}else {
			System.out.println("Impossible d'ajouter un document.");
		}
	}

	public abstract void ImprimerLiasse();
}
