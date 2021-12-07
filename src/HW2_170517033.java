import java.util.Scanner;

public class HW2_170517033 {

	public static void main(String[] args) {
		//---------------------------------------------------------------------------------------------------------------------
		//This program calculates personal income tax based on the given tax rates reported by The Turkish
		//Revenue Administration. The tax rates are given for 4 years. These rates represent as a Java code stated below.
		//The user enter two variables which are year and income money. As mentioned before, program takes these variables
		//and calculates the tax amount, income after tax and real tax rate then display them all.
		
		//Name: Yasin Alper BÝNGÜL
		//No: 170517033
		//---------------------------------------------------------------------------------------------------------------------
		
		
		//Get input from user
		Scanner input = new Scanner(System.in);
		int year = input.nextInt(); //Choosing the year
		double incomeVal = input.nextDouble(); //Get in the income money
		
		//Define the needed variables to store tax amount, income after tax, and tax rate
		double taxAmount = 0;
		double incomeAfterTax = 0;
		double taxRate = 0;
		
		//Detect the value of the year which is entered with switch-case statement.
		switch(year) {
		//If the value of the year is 2017
		case 2017:
			if(incomeVal == 0) {
				//If the income value is 0
				System.out.println("Income must be > 0!");
			}
			else {
				//If income value is not equal to 0, then calculate the tax amount, income after tax and real tax rate then display them
				if(incomeVal <13000) {
					//If the income value less than 13000
					taxRate = 0.15;
					taxAmount = incomeVal * taxRate;
					incomeAfterTax = incomeVal - taxAmount;
				}
				else if (incomeVal >= 13000 && incomeVal <30000) {
					//If the income value is between 13000 and 30000
					taxRate = 0.20;
					taxAmount = 1950 + (incomeVal - 13000) * taxRate;
					incomeAfterTax = incomeVal - taxAmount;
				}
				else if (incomeVal >= 30000 && incomeVal < 110000) {
					//If the income value is between 30000 and 110000
					taxRate = 0.27;
					taxAmount = 5350 + (incomeVal - 30000) * taxRate;
					incomeAfterTax = incomeVal - taxAmount;
				}
				else if (incomeVal >= 110000) {
					//If the income value is more than 110000
					taxRate = 0.35;
					taxAmount = 26950 + (incomeVal - 110000) * taxRate;
					incomeAfterTax = incomeVal - taxAmount;
				}
				
				//Display the results
				System.out.println("Income: " + (int)(100*incomeVal) / 100.0);
				System.out.println("Tax amount: " + (int)(100*taxAmount) / 100.0);
				System.out.println("Income after tax: " + (int)(100*incomeAfterTax) / 100.0);
				System.out.println("Real tax rate: " + (int)(10000*(taxAmount / incomeVal))/100.0 + "%");
			}
			
			break;
		//If the value of the year is 2018	
		case 2018:
			if(incomeVal == 0) {
				//If the income value is 0
				System.out.println("Income must be > 0!");
			}
			else {
				//If income value is not equal to 0, then calculate the tax amount, income after tax and real tax rate then display them
				if(incomeVal <14800) {
					//If the income value less than 14800
					taxRate = 0.15;
					taxAmount = incomeVal * taxRate;
					incomeAfterTax = incomeVal - taxAmount;
				}
				else if (incomeVal >= 14800 && incomeVal <34000) {
					//If the income value is between 14800 and 34000
					taxRate = 0.20;
					taxAmount = 2220 + (incomeVal - 14800) * taxRate;
					incomeAfterTax = incomeVal - taxAmount;
				}
				else if (incomeVal >= 34000 && incomeVal < 120000) {
					//If the income value is between 34000 and 120000
					taxRate = 0.27;
					taxAmount = 6060 + (incomeVal - 34000) * taxRate;
					incomeAfterTax = incomeVal - taxAmount;
				}
				else if (incomeVal >= 120000) {
					//If the income value is more than 120000
					taxRate = 0.35;
					taxAmount = 29280 + (incomeVal - 120000) * taxRate;
					incomeAfterTax = incomeVal - taxAmount;
				}
				
				//Display the results
				System.out.println("Income: " + (int)(100*incomeVal) / 100.0);
				System.out.println("Tax amount: " + (int)(100*taxAmount) / 100.0);
				System.out.println("Income after tax: " + (int)(100*incomeAfterTax) / 100.0);
				System.out.println("Real tax rate: " + (int)(10000*(taxAmount / incomeVal))/100.0 + "%");
			}
			
			break;
		//If the value of the year is 2019	
		case 2019:
			if(incomeVal == 0) {
				//If the income value is 0
				System.out.println("Income must be > 0!");
			}
			else {
				//If income value is not equal to 0, then calculate the tax amount, income after tax and real tax rate then display them
				if(incomeVal <18000) {
					//If the income value less than 18000
					taxRate = 0.15;
					taxAmount = incomeVal * taxRate;
					incomeAfterTax = incomeVal - taxAmount;
				}
				else if (incomeVal >= 18000 && incomeVal <40000) {
					//If the income value is between 18000 and 40000
					taxRate = 0.20;
					taxAmount = 2700 + (incomeVal - 18000) * taxRate;
					incomeAfterTax = incomeVal - taxAmount;
				}
				else if (incomeVal >= 40000 && incomeVal < 148000) {
					//If the income value is between 40000 and 148000
					taxRate = 0.27;
					taxAmount = 7100 + (incomeVal - 40000) * taxRate;
					incomeAfterTax = incomeVal - taxAmount;
				}
				else if (incomeVal >= 148000 && incomeVal < 500000) {
					//If the income value is between 148000 and 500000
					taxRate = 0.35;
					taxAmount = 36260 + (incomeVal - 148000) * taxRate;
					incomeAfterTax = incomeVal - taxAmount;
				}
				else if (incomeVal >= 500000) {
					//If the income value is more than 500000
					taxRate = 0.40;
					taxAmount = 163460 + (incomeVal - 500000) * taxRate;
					incomeAfterTax = incomeVal - taxAmount;
				}
				
				//Display the results
				System.out.println("Income: " + (int)(100*incomeVal) / 100.0);
				System.out.println("Tax amount: " + (int)(100*taxAmount) / 100.0);
				System.out.println("Income after tax: " + (int)(100*incomeAfterTax) / 100.0);
				System.out.println("Real tax rate: " + (int)(10000*(taxAmount / incomeVal))/100.0 + "%");
			}
			
			break;
		//If the value of the year is 2020	
		case 2020:
			if(incomeVal == 0) {
				//If the income value is 0
				System.out.println("Income must be > 0!");
			}
			else {
				//If income value is not equal to 0, then calculate the tax amount, income after tax and real tax rate then display them
				if(incomeVal <22000) {
					//If the income value less than 22000
					taxRate = 0.15;
					taxAmount = incomeVal * taxRate;
					incomeAfterTax = incomeVal - taxAmount;
				}
				else if (incomeVal >= 22000 && incomeVal < 49000) {
					//If the income value is between 22000 and 49000
					taxRate = 0.20;
					taxAmount = 3300 + (incomeVal - 22000) * taxRate;
					incomeAfterTax = incomeVal - taxAmount;
				}
				else if (incomeVal >= 49000 && incomeVal < 180000) {
					//If the income value is between 49000 and 180000
					taxRate = 0.27;
					taxAmount = 8700 + (incomeVal - 49000) * taxRate;
					incomeAfterTax = incomeVal - taxAmount;
				}
				else if (incomeVal >= 180000 && incomeVal < 600000) {
					//If the income value is between 180000 and 600000
					taxRate = 0.35;
					taxAmount = 44070 + (incomeVal - 180000) * taxRate;
					incomeAfterTax = incomeVal - taxAmount;
				}
				else if (incomeVal >= 600000) {
					//If the income value is more than 600000
					taxRate = 0.40;
					taxAmount = 191070 + (incomeVal - 600000) * taxRate;
					incomeAfterTax = incomeVal - taxAmount;
				}
				
				//Display the results
				System.out.println("Income: " + (int)(100*incomeVal) / 100.0);
				System.out.println("Tax amount: " + (int)(100*taxAmount) / 100.0);
				System.out.println("Income after tax: " + (int)(100*incomeAfterTax) / 100.0);
				System.out.println("Real tax rate: " + (int)(10000*(taxAmount / incomeVal))/100.0 + "%");
			}
			
			break;
		default: 
			//If the year that entered the system is undefined.
			System.out.println("Undefined year value!");
		}

	}

}