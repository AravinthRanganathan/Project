package _06_Project;

public class SBAccount extends Account{
	double intrestRate;
	double amount;
	String accType;
	@Override
	public double calculateInterest() {
		if(accType.equals("NORMAL")) {
			intrestRate=(amount*4)/100;
		}
		if(accType.equals("NIR")) {
			intrestRate=(amount*6)/100;
		}
		return intrestRate;
	}
}
