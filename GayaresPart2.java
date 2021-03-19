package casestudy;
import java.util.*;

public class GayaresPart2 {
	public static double ratehour = 100, tax = .2, totalNetPay = 0;
	public static Scanner input = new Scanner(System.in);
	public static String inputMonth = "";
	public static void main(String[] args) {
		System.out.print("Enter Month: ");
	inputMonth = input.next();
		setmonths(inputMonth);
		System.out.print("\nMonthly Salary for the month of : " + inputMonth + " is " + totalNetPay);	
	}
	
	
	static void setmonths(String months) {
		if(months.equalsIgnoreCase("January") || months.equalsIgnoreCase("February") || months.equalsIgnoreCase("March") || months.equalsIgnoreCase("April") || 
				months.equalsIgnoreCase("May") || months.equalsIgnoreCase("June") || months.equalsIgnoreCase("july") || months.equalsIgnoreCase("August")
				|| months.equalsIgnoreCase("September") || months.equalsIgnoreCase("October") || months.equalsIgnoreCase("November") || months.equalsIgnoreCase("December")) {
			System.out.println(inputMonth + " 1-15 Salary ");
			getComputation();
			System.out.println();
			System.out.println(inputMonth + " 16-30 Salary ");
			getComputation();
			
		}
		else {
			System.out.println("\nInvalid Month Please Type Correct Input ");
		}
	}
	
	
	static void getComputation() {
		
		System.out.print("Enter Total Days: ");
		int totalDays = input.nextInt();
		System.out.print("Enter Hours per day: ");
		int hoursperDay = input.nextInt();
		setTotalAmenities(totalDays,hoursperDay );
				
		return;
	}

	
	
	static void setTotalAmenities(int days, int hours) {
		int totalDayAndHours = days*hours;
		System.out.println("Total Hours: " + totalDayAndHours);
		
		double convertedSolution = new Double(totalDayAndHours);
		
		double grosspay = ratehour * convertedSolution;
		System.out.println("Grosspay: " + grosspay);

		double totalTax = grosspay * tax;
		System.out.println("Tax: " + totalTax);
		setHalfNetPayMonth(grosspay, totalTax);
		
	}
	
		
	static void setHalfNetPayMonth(double grossPay , double tacx) {
		double halfNetPayMonth = grossPay - tacx;
		System.out.println("Net Pay: " + halfNetPayMonth );
		
		totalNetPay += halfNetPayMonth;
	}
	
		
	
}
