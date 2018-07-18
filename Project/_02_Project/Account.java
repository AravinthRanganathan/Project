package _06_Project;

import java.util.Scanner;

class AmountLowException extends Exception{
	AmountLowException(String amount) {
		super(amount);
	}
}
class InvalidAccountTypeException extends Exception{
	InvalidAccountTypeException(String ac) {
		super(ac);
	}
}


public abstract class Account {
	double intrestRate;
	static double amount;
	static String accType;
	static int noOfDays;
	static int noOfMonths;
	static int ageOfACHolder;
	static double MonthlyAmount;
	abstract double calculateInterest();
	
	public static void main(String[] args) throws InvalidAccountTypeException , AmountLowException{
		int n=1;
		do {
			System.out.println("MAIN MENU:");
			System.out.println("----------");
			System.out.println("1.Interest Calculator-SB");
			System.out.println("2.Interest Calculator-FD");
			System.out.println("3.Interest Calculator-RD");
			System.out.println("4.Exit");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your Option :");
			int option=sc.nextInt();
			switch(option) {
			case 1:
				try {
					SBAccount sb=new SBAccount();
					System.out.println("Enter the Average Amount in your Account :");
					amount=sc.nextDouble();
					if(amount<0) {
						throw new AmountLowException("Invaild Amount");
					}
					System.out.println("Enter the account Type:");
					accType=sc.next().toUpperCase();
					if((!accType.equals("NIR"))){
						if((!accType.equals("NORMAL")))
						throw new InvalidAccountTypeException("Invaid Account");
					}
					sb.accType=accType;
					sb.amount=amount;
					System.out.println("Interest Gained is: "+sb.calculateInterest());
				}
				catch(AmountLowException e){
					System.out.println(e);
				}
				catch(InvalidAccountTypeException e) {
					System.out.println(e);
				}
				break;
			case 2:
				try {
					FDAccount fd=new FDAccount();
					System.out.println("Enter the FD Amount:");
					amount=sc.nextDouble();
					
					System.out.println("Enter the number of days:");
					noOfDays=sc.nextInt();
						
					System.out.println("Enter Your age:");
					ageOfACHolder=sc.nextInt();
					if(amount<0 || noOfDays<0 || ageOfACHolder<0)
					throw new AmountLowException("pls enter non-negative value");
					fd.ageOfACHolder=ageOfACHolder;
					fd.amount=amount;
					fd.noOfDays=noOfDays;
					System.out.println("Interest Gained is: "+fd.calculateInterest());
				}
				catch(Exception e) {
					System.out.println(e);
				}
				break;
			case 3:
				try {
					RDAccount rd=new RDAccount();
					System.out.println("Enter the Monthly Amount:");
					MonthlyAmount=sc.nextDouble();
					
					System.out.println("Enter the Months:");
					noOfMonths=sc.nextInt();
						
					System.out.println("Enter Your age:");
					ageOfACHolder=sc.nextInt();
					
					if(amount<0 || noOfMonths<0 || ageOfACHolder<0)
					throw new AmountLowException("pls enter non-negative value");
					rd.ageOfAcHolder=ageOfACHolder;
					rd.monthlyAmount=MonthlyAmount;
					rd.noOfMonths=noOfMonths;
					System.out.println("Interest Gained is: "+rd.calculateInterest());
				}
				catch(Exception e) {
					System.out.println(e);
				}
				break;
			case 4:
				n=0;
				System.out.println("Program Terminated");
				}
			}while(n!=0);
	}
}
