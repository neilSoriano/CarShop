import java.util.Scanner;

public class Bobcar {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int car = 0, days = 0, member = 0;
		double platinum = 0, total = 0;

		System.out.print("Available cars: ");
		System.out.println("1 for Economy, 2 for Compact, 3 for Standard");
		System.out.print("Please choose the rental car: ");
		car = input.nextInt();

		System.out.print("Please enter the number of rental days: ");
		days = input.nextInt();

		System.out.print("Club member?: 1 for yes, 0 for no: ");
		member = input.nextInt();
		if (member == 1) {
			System.out.print("Platinum Exclusive Package?: 1 for yes, 0 for no: ");
			platinum = input.nextInt();
		}

		if (car == 1 && member == 1 && platinum == 1) {
			member = (days / 7) * 35;
			total = (days * 35);
			System.out.println("Base: " + days + " days for a Economy at $35 per day: \t$" + total);
			platinum = total * .15;
			total = total - member + platinum;
			System.out.println("Club Member Discount: -\t$" + member);
			System.out.println("Platinum Exclusive Package: +\t$" + platinum);
			System.out.println("Total Estimate for Rental: \t$" + total); 
		}
		else if (car == 1 && member == 1 && platinum != 1) {
			member = (days / 7) * 35;
			total = (days * 35);
			System.out.println("Base: " + days + " days for a Economy at $35 per day: \t$" + total);
			total = (days * 35) - member;
			System.out.println("Club Member Discount: -\t$" + member);
			System.out.println("Total Estimate for Rental: \t$" + total);
		}
		else if (car == 1 && member !=1){
			total = days * 35;
			System.out.println("Base: " + days + " days for a Standard at $35 per day: \t$" + total);
			System.out.print("Total Estimate for Rental: \t$" + total);
		}
		else if (car == 2 && member == 1 && platinum == 1) {
			member = (days / 7) * 45;
			total = (days * 45);
			System.out.println("Base: " + days + " days for a Compact at $45 per day: \t$" + total);
			platinum = total * .15;
			total = total - member + platinum;
			System.out.println("Club Member Discount: -\t$" + member);
			System.out.println("Platinum Exclusive Package:  +\t$" + platinum);
			System.out.print("Total Estimate for Rental: \t$" + total);
		}
		else if (car == 2 && member == 1 && platinum != 1) {
			member = (days / 7) * 45;
			total = (days * 45);
			System.out.println("Base: " + days + " days for a Compact at $45 per day: \t$" + total);
			total = (days * 45) - member;
			System.out.println("Club Member Discount: -\t$" + member);
			System.out.println("Total Estimate for Rental: \t$" + total);	
		}
		else if (car == 2 && member != 1){
			total = days * 45;
			System.out.println("Base: " + days + " days for a Standard at $45 per day: \t$" + total);
			System.out.print("Total Estimate for Rental: \t$" + total);
		}
		else if (car == 3 && member == 1 && platinum == 1) {
			member = (days / 7) * 95;
			total = (days * 95);
			System.out.println("Base: " + days + " days for a Standard at $95 per day: \t$" + total);
			platinum = total * .15;
			total = total - member + platinum;
			System.out.println("Club Member Discount: -\t$" + member);
			System.out.println("Platinum Exclusive Package: +\t$" + platinum);
			System.out.print("Total Estimate for Rental: \t$" + total);
		}
		else if (car == 3 && member == 1 && platinum != 1) {
			member = (days/7) * 95;
			total = (days * 95);
			System.out.println("Base: " + days + " days for a Standard at $95 per day: \t$" + total);
			total = (days * 95) - member;
			System.out.println("Club Member Discount: -\t$" + member);
			System.out.println("Total Estimate for Rental: \t$" + total);
		}
		else if (car == 3 && member != 1){
			total = days * 95;
			System.out.println("Base: " + days + " days for a Standard at $95 per day: \t$" + total);
			System.out.print("Total Estimate for Rental: \t$" + total);
		}
		input.close();
	}	
}
