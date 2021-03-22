package outrosDesafios;

public class DesafioAritmeticos {

	public static void main(String[] args) {
		int numA = (3+2)*6;
		numA = (int) Math.pow(numA, 2);		
		int denA = 3*2;
		int superiorA = numA/denA;
		
		System.out.println(superiorA);
		
		
		int numB = (1-5) * (2-7);
		int denB = 2;
		int superiorB = numB/denB;
		superiorB = (int) Math.pow(superiorB, 2);
		
		System.out.println(superiorB);
		
		int superior = superiorA - superiorB;
		superior = (int) Math.pow(superior, 3);
		int inferior = (int) Math.pow(10,3);
		
		int total = superior/inferior;
		
		System.out.println(total);
		
		
	}

}
