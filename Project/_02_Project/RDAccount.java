package _06_Project;

public class RDAccount extends Account {
	double intrestRate;
	double amount;
	int noOfMonths;
	int ageOfAcHolder;
	double monthlyAmount;
	@Override
	public double calculateInterest() {
		if(noOfMonths<=6) {
			if(ageOfAcHolder>=60) {
				amount=((monthlyAmount*noOfMonths)+((noOfMonths+1)*8)/200);
				intrestRate=amount-(noOfMonths*monthlyAmount);
			}
			else {
				amount=((monthlyAmount*noOfMonths)+((noOfMonths+1)*7.50)/200);
				intrestRate=amount-(noOfMonths*monthlyAmount);
			}
		}
		if(noOfMonths>6 && noOfMonths<=9) {
			if(ageOfAcHolder>=60) {
				amount=((monthlyAmount*noOfMonths)+((noOfMonths+1)*8.25)/200);
				intrestRate=amount-(noOfMonths*monthlyAmount);
			}
			else {
				amount=((monthlyAmount*noOfMonths)+((noOfMonths+1)*7.75)/200);
				intrestRate=amount-(noOfMonths*monthlyAmount);
			}
		}
		if(noOfMonths>9 && noOfMonths<=12) {
			if(ageOfAcHolder>=60) {
				amount=((monthlyAmount*noOfMonths)+((noOfMonths+1)*8.5)/200);
				intrestRate=amount-(noOfMonths*monthlyAmount);
			}
			else {
				amount=((monthlyAmount*noOfMonths)+((noOfMonths+1)*8)/200);
				intrestRate=amount-(noOfMonths*monthlyAmount);
			}
		}
		if(noOfMonths>12 && noOfMonths<=15) {
			if(ageOfAcHolder>=60) {
				amount=((monthlyAmount*noOfMonths)+((noOfMonths+1)*8.75)/200);
				intrestRate=amount-(noOfMonths*monthlyAmount);
			}
			else {
				amount=((monthlyAmount*noOfMonths)+((noOfMonths+1)*8.25)/200);
				intrestRate=amount-(noOfMonths*monthlyAmount);
			}
		}
		if(noOfMonths>15 && noOfMonths<=18) {
			if(ageOfAcHolder>=60) {
				amount=((monthlyAmount*noOfMonths)+((noOfMonths+1)*9)/200);
				intrestRate=amount-(noOfMonths*monthlyAmount);
			}
			else {
				amount=((monthlyAmount*noOfMonths)+((noOfMonths+1)*8.5)/200);
				intrestRate=amount-(noOfMonths*monthlyAmount);
			}
		}
		if(noOfMonths>18) {
			if(ageOfAcHolder>=60) {
				amount=((monthlyAmount*noOfMonths)+((noOfMonths+1)*9.25)/200);
				intrestRate=amount-(noOfMonths*monthlyAmount);
			}
			else {
				amount=((monthlyAmount*noOfMonths)+((noOfMonths+1)*8.75)/200);
				intrestRate=amount-(noOfMonths*monthlyAmount);
			}
		}
		return intrestRate;
	}
}
