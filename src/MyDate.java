import java.text.SimpleDateFormat;
import java.util.Date;

public class MyDate {

	void show(Date d) {
		
		System.out.println("Hello Kranti");
		
		System.out.println("Date :"+d);
		
		int day = d.getDay();
		int month = d.getMonth();
		int year = d.getYear();
		
		String date = day+"/"+month+"/"+year;
		
System.out.println(date);
		
	}
	public static void main(String[] args) {
		
		MyDate md = new MyDate();
		
		md.show(new Date(2015,8,9));
		
	}
}
