package cwiczenie4;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bagaz b1 = new Bagaz(20,40,40,5,"Jan Nowak",true, true );
		Bagaz b2 = new Bagaz(30,30,30,12,"Anna Nowak", true, false);
		Bagaz b3 = new Bagaz(40,40,20,13,"Robert Kot", false, false);
		
		System.out.println("Suma bagazy: " + Bagaz.getLacznaWaga() + " kg");
	}

}
