package epam.task.cleancode;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Calculation calculate = new Calculation();
		
		ConstructionBudget budget = new ConstructionBudget();
		
		System.out.println("Enter 1 to calculate Simple Interest  or 2 to calculate Compound Interest");
		int option = input.nextInt();
		System.out.println("Enter principal , rate , time values");
		double principal = input.nextDouble();
		double rate = input.nextDouble();
		double time = input.nextDouble();
		switch(option){
		case 1:
			System.out.println(calculate.computesSimpleInterest(principal, rate, time));
			break;
		case 2:
			System.out.println(calculate.computesCompoundInterest(principal, rate, time));
			break;
		default:
			System.out.println("Invalid option entered");
		}
		
		System.out.println("Enter Standard of the house to be consturcted");
		System.out.println("Enter 1 for normal 2 for medium 3 for high");
		int standard = input.nextInt();
		int fullyAutomated;
		if( standard == 3){
			System.out.println("Enter 1 for fully automated house else enter 0");
			fullyAutomated = input.nextInt();
		}else{
			fullyAutomated = 0;
			
		}
		System.out.println("Enter the area ");
		double area = input.nextDouble();
		System.out.println(budget.calculatesConstructionCost(area, standard, fullyAutomated));
		
		
		

	}

}
