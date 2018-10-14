package OBI;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Przedmiot obi = new Przedmiot("OBI", "Sliwa", 32, 16);
		Przedmiot ppj = new Przedmiot("PPJ", "Nowak", 20, 16);
		System.out.println(ppj.showPrzedmiot());
		System.out.println(obi.showPrzedmiot());
	}

}
