import java.util.Scanner;
import java.time.*;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateArithmetic{
    public static void main(String[] args){
	
	// creating scanner class object
	Scanner sc = new Scanner(System.in);
	
	// taking input from user
	String date = sc.nextLine();
	
	
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	
	LocalDate userDate = LocalDate.parse(date, formatter);
	
	userDate = userDate.plusYears(2).plusMonths(1).plusDays(7);
	userDate = userDate.minusWeeks(3);
	System.out.println(userDate);
	}
}	