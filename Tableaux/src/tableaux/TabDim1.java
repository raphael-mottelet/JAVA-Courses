package tableaux;

pubic class TabDim1 {
	public void AficheTabInt(int [] Tab) {
		int i;
		 for(i=0;(i < Tab.length);i=i+1) {
			 System.out.print(Tab[i]+"\t");
		 }
		 System.out.print("\n");
	}
}