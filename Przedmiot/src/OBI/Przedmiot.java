package OBI;

import java.util.Date;

public class Przedmiot {
	private String nazwa;
	private String prowadzacy;
	private double hTrwania;
	private int iluSluchaczy;
	private static int id = 0;
	private int serial;
	private Date dataDodania;

	public Przedmiot(String nazwa, String prowadzacy, double hTrwania, int ilusluchaczy) {
		this.nazwa = nazwa;
		this.prowadzacy = prowadzacy;
		this.hTrwania = hTrwania;
		this.iluSluchaczy = ilusluchaczy;
		int serial = getId();
		this.id++;
		dataDodania = new Date();
	}

	public String showPrzedmiot() {

		return "Nazwa Przedmiotu: " + getNazwa() + ", Prowadzący: " + getProwadzacy() + ", Czas Trwania: "
				+ gethTrwania() + ", Ilość Słuchaczy: " + getIluSluchaczy() + ", Ilośc przedmiotów w Bazie: " + getId()
				+ ", Data dodania:" + getdataDodania() + ", Serial: " + getSerial();

	}

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public String getProwadzacy() {
		return prowadzacy;
	}

	public void setProwadzacy(String prowadzacy) {
		this.prowadzacy = prowadzacy;
	}

	public double gethTrwania() {
		return hTrwania;
	}

	public void sethTrwania(double hTrwania) {
		this.hTrwania = hTrwania;
	}

	public int getIluSluchaczy() {
		return iluSluchaczy;
	}

	public void setIluSluchaczy(int iluSluchaczy) {
		this.iluSluchaczy = iluSluchaczy;
	}

	/**
	 * private void setId(int id) { this.id = +1; }
	 **/

	public int getId() {
		return id;
	}

	public Date getdataDodania() {
		return dataDodania;
	}

	public int getSerial() {
		return serial;
	}

}
