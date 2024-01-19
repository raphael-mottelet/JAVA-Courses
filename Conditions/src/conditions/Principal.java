package conditions;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int y;
		
		OpConditions x = new OpConditions();
		x.Jour(5);
		x.Jour(3);
		x.Jour(4);
		
		y = x.Operations(62, 30, 15);
		System.out.println(y);

	}

}
