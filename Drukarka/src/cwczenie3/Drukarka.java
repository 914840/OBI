package cwczenie3;

import java.util.ArrayList;

public class Drukarka {

	private String nazwa;
	private int toner;
	private static int licznik = 0;
	private int strony;
	private static int strWszystkie;
	private int id;

	public Drukarka(String nazwa, int toner, int strony) {
		this.nazwa = nazwa;
		this.toner = toner;
		this.strony = strony;
		this.id = licznik + 1;
		Drukarka.licznik++;
	}

	public void drukujStr(int iloscStron) {
		
		if(getToner() > iloscStron){
			System.out.println("Drukuje " + iloscStron + " stron");
			setToner(getToner() - iloscStron);
			setStrony(getStrony() + iloscStron);
			setStrWszystkie(getStrWszystkie() + iloscStron);
		}
		else 
			System.out.println("Drukarak nie wydrukuje tylu stron: " + iloscStron +", tonera starczy na: " + getToner());	
	}
	
	
	// Ilośc wszyztkich wydruków
	public static void iloscWydrukow() {
		System.out.println(getStrWszystkie());
	}
	
	// wywala na wyjście ilość wydruków z tekstem
	public static void showIloscWydrukow() {
		System.out.println("Ilość wydruków ze wszystkich drukarek: " + getStrWszystkie());
	}

	// wywala ilość tonera do konca
	public void tonerDoKonca() {
		System.out.println(getToner());
	}

	// Wywala drukarkę wraz ze stanem tonare Id itd itp
	public void pokarzDrukarke() {
		if(getToner()> 500){
		System.out.println("Strony do konca tonaer: " + getToner() + " Ilość wydrukowanych stron: " + getStrony()
				+ ", ID drukarki: " + getId());
		}
		else if(getToner()< 500){
		System.out.printf("Strony do Konca tonera: " + getToner() + " ZMIEŃ TONER !!!" + " Ilość wydrukowanych stron: " + getStrony() + ", ID drukarki: " + getId());
		}
	}
	
	// wywala liste drukarek
	public static void pokarzListeDrukarek() {
		
	}
	

	// Get I set ********************************************
	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public int getToner() {
		return toner;
	}

	public void setToner(int toner) {
		this.toner = toner;
	}

	public int getStrony() {
		return strony;
	}

	public void setStrony(int strony) {
		this.strony = strony;
	}

	public static int getStrWszystkie() {
		return strWszystkie;
	}

	public static void setStrWszystkie(int strWszystkie) {
		Drukarka.strWszystkie = strWszystkie;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
