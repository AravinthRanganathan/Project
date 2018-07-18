package _06_Project;

public class FDAccount extends Account{
	double intrestRate;
	double amount;
	int noOfDays;
	int ageOfACHolder;
	@Override
	public double calculateInterest() {
		if(amount<=10000000) {
			if(ageOfACHolder<60) {
				if(noOfDays>=7 && noOfDays<=14) {
					intrestRate=(amount*4.5)/100;
				}
				else if(noOfDays>=15 && noOfDays<=29) {
					intrestRate=(amount*4.75)/100;
				}
				else if(noOfDays>=30 && noOfDays<=45) {
					intrestRate=(amount*5.5)/100;
				}
				else if(noOfDays>=46 && noOfDays<=60) {
					intrestRate=(amount*7)/100;
				}
				else if(noOfDays>=61 && noOfDays<=184) {
					intrestRate=(amount*7.5)/100;
				}
				else if(noOfDays>=185 && noOfDays<=366) {
					intrestRate=(amount*8)/100;
				}
			}
			else {
				if(noOfDays>=7 && noOfDays<=14) {
					intrestRate=(amount*5)/100;
				}
				else if(noOfDays>=15 && noOfDays<=29) {
					intrestRate=(amount*5.25)/100;
				}
				else if(noOfDays>=30 && noOfDays<=45) {
					intrestRate=(amount*6)/100;
				}
				else if(noOfDays>=46 && noOfDays<=60) {
					intrestRate=(amount*7.5)/100;
				}
				else if(noOfDays>=61 && noOfDays<=184) {
					intrestRate=(amount*8)/100;
				}
				else if(noOfDays>=185 && noOfDays<=366) {
					intrestRate=(amount*8.5)/100;
				}
			}
		}
		else {
			if(noOfDays>=7 && noOfDays<=14) {
				intrestRate=6.5;
			}
			else if(noOfDays>=15 && noOfDays<=29) {
				intrestRate=6.75;
			}
			else if(noOfDays>=30 && noOfDays<=45) {
				intrestRate=6.75;
			}
			else if(noOfDays>=46 && noOfDays<=60) {
				intrestRate=8;
			}
			else if(noOfDays>=61 && noOfDays<=184) {
				intrestRate=8.5;
			}
			else if(noOfDays>=185 && noOfDays<=366) {
				intrestRate=10;
			}
		}
		return intrestRate;
	}
	
}
