package conditions;

public class OpConditions {
	public void Jour(int j) {
		switch(j) {
			case 1:{
				System.out.println("lundi");
				break;
			}
			case 2:{
				System.out.println("mardi");
				break;
			}
			case 3:{
				System.out.println("mercredi");
				break;
			}
			case 4:{
				System.out.println("jeudi");
				break;
			}
			case 5:{
				System.out.println("vendredi");
				break;
			}
			case 6:{
				System.out.println("samedi");
				break;
			}
			case 7:{
				System.out.println("dimanche");
				break;
			}
		}
	}
	
	public int Operations(int a, int b, int x) {
		int y;
		
		switch(x) {
			case 1:{
				y = (a+b);
				break;
			}
			case 2:{
				y = (a*b);
				break;
			}
			case 3:{
				y = (a/b);
				break;
			}
			case 4:{
				y = (a-b);
				break;
			}
			//il faut un cas default pour tout les autres cas. Le "default" case est nécessaire.
			default :{ 
				y = (a*a + b*b);
				break;
			}
		}
		return y;
	}

}
