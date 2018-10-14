package obi;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Calendar {

	public static void main(String args[]) {
		
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.YYYY");
		System.out.println(sdf.format(d.getDate()));
		
	}
}
