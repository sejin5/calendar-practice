package main;

import java.text.SimpleDateFormat;
import java.util.Date;

public class page {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world!");
		SimpleDateFormat format1 = new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss");
		Date time = new Date();
		String timeF = format1.format(time);
		System.out.println(timeF);
		String goal = "make Calendar";
		System.out.println(goal);
	}

}
