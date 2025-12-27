import java.util.Scanner;
import java.time.*;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DifferentTimeZone{
    public static void main(String[] arga){
	
	    // date time formatter
		//DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yy  HH:mm:ss z");
	
	    // gmt time zone
	    ZonedDateTime GMT = ZonedDateTime.now(ZoneId.of("GMT"));
		// IST time zone
		ZonedDateTime IST = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
		// PST time zone
		ZonedDateTime PST = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
		
		
		// displaying diffrent time zone
		System.out.println("IST : " + IST);
		System.out.println("PST : " + PST);
		System.out.println("GMT : " + GMT);

		
	}
}

		   
    