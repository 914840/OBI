package cwczenie3;

import java.util.IllformedLocaleException;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drukarka d1 = new Drukarka("cannon", 10000 , 0);
		Drukarka d2 = new Drukarka("HP", 15000, 3000);
		Drukarka.showIloscWydrukow(); // wydruk wszystkich stron
		
		d1.drukujStr(400);  	// ilość wydrukowanych stron
		d2.drukujStr(20000);
		
		
		Drukarka.showIloscWydrukow();
		d1.pokarzDrukarke();
		d2.pokarzDrukarke();
	}

}
