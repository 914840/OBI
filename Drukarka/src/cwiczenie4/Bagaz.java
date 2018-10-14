package cwiczenie4;

public class Bagaz {
	private double szerokosc;
	private double wysokosc;
	private double glebokosc;
	private double waga;
	private String wlasciciel;
	private static double sumWag;
	private boolean wKg, wCm;
	private static final int PRZELICZNIK = 2;
	
	private static final double MAX_SZER = 50.00;
	private static final double MAX_WYS = 50.00;
	private static final double MAX_GLEM = 80.00;
	private static final double MAX_WAGA = 30.00;
	
	public Bagaz(double szerokosc, double wysokosc, double glebokosc, double waga, String wlasciciel, boolean wKg, boolean wCm ){
		
		this.wlasciciel = wlasciciel;
		
		// WAGA
		this.wKg = wKg;
		if(this.wKg = true){
			this.waga = waga;
			sumWag = sumWag + waga;
		}
		else{
			this.waga = waga * PRZELICZNIK;
			sumWag = sumWag + (waga*PRZELICZNIK);
		}
		
		//WYMIARY
		this.wCm = wCm;
		if(this.wCm = true){
			this.szerokosc = szerokosc;
			this.wysokosc = wysokosc;
			this.glebokosc = glebokosc;
		}
		else{
			this.przeliczoneNaCaleWymiar();
		}
		
	}
	
	public static double getLacznaWaga(){
		return sumWag;
	}
	
	private void przeliczoneNaCaleWymiar(){
		this.szerokosc = szerokosc / PRZELICZNIK;
		this.wysokosc = wysokosc / PRZELICZNIK;
		this.glebokosc = glebokosc / PRZELICZNIK;
	}
	
}
