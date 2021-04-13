package main;

import java.text.SimpleDateFormat;
import java.util.Date;

public class month {
	public static void month () {
		SimpleDateFormat format1 = new SimpleDateFormat ("yyyy-MM-dd");
		SimpleDateFormat format2 = new SimpleDateFormat ("HH:mm:ss");
		
		Date todays = new Date();
		
		String dates = format1.format(todays);
		String times = format2.format(todays);
		
		System.out.println(dates +" "+ times);
		
		String year = dates.substring(0,4);
		String month = dates.substring(5,7);
		String day = dates.substring(8);
		
		System.out.println(year+"³â "+month+"¿ù "+day+"ÀÏ");
		
	}
	 
	
}
