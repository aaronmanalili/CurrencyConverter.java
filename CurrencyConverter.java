package currencyconverter;

import java.util.Scanner;

public class CurrencyConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner currencyInput = new Scanner(System.in);
		System.out.println("Enter the amount of money you want to convert in USD $: ");
		double amount = currencyInput.nextDouble(); // Stores the amount of money in USD the user wants to convert
		
		System.out.println("Here is a list of available currency to convert from USD: ");
		System.out.println("1. Euro \n");
		System.out.println("2. Japanese Yen \n");
		System.out.println("3. Mexican Peso \n");
		System.out.println("4. Philippine Peso \n");
		System.out.println("5. Indian Rupree \n");
		System.out.println("6. South Korean won \n");
		System.out.println("7. South African Rand \n");
		
		Scanner selectionNumber = new Scanner(System.in);
		System.out.println("Please select a currency to convert from USD from 1 to 7: ");
		int select = selectionNumber.nextInt(); // User inputs a number from 1 to 7 to select the currency to exchange from USD.
		
		switch(select) 
		{
			case 1: 
				double Euro = amount / 0.91; // This represents the USD to Euro exchange rate
				double euroNewAmount = Math.round(Euro * 100.0) / 100.0; // Rounds the Euro variable to 2 decimal points.
				System.out.println("The amount in USD: " + amount + " to Euro is: " + euroNewAmount + " Euros.");
				break;
				
			case 2:
				double Yen = amount / 148.35; // This represents the USD to Yen exchange rate.
				double yenNewAmount = Math.round(Yen * 100.0) / 100.0; // Rounds the Yen variable to 2 decimal points.
				System.out.println("The amount in USD: " + amount + " to Japanese Yen is: " + yenNewAmount + " Yen.");
				break;
				
			case 3:
				double mexicanPeso = amount / 17.11; // Currency exchange rate from USD to Mexican Peso
				double mexicanPesoNewAmount = Math.round(mexicanPeso * 100.0) / 100.0; // Stores the amount of mexicanPeso variable to two decimal points
				System.out.println("The amount in USD: " + amount + " to Mexican Peso is: " + mexicanPesoNewAmount + " Mexican Pesos.");
				break;
				
			case 4:
				double philippinePeso = amount / 55.18; // Currency exchange rate from USD to Philippine Peso
				double philippinePesoNewAmount = Math.round(philippinePeso * 100.0) / 100.0; // Stores the amount of philippinePeso variable to two decimal points
				System.out.println("The amount in USD: " + amount + " to Philippine Peso is: " + philippinePesoNewAmount + " Philippine Pesos."); 
				break;
				
			case 5:
				double rupree = amount / 83.32; // Currency exchange rate from USD to Indian Rupree
				double rupreeNewAmount = Math.round(rupree * 100.0) / 100.0;  // Stores the amount of rupree variable to two decimal points
				System.out.println("The amount in USD: " + amount + " to Indian Rupree is: " + rupreeNewAmount + " Indian Ruprees.");
				break;
				
			case 6:
				double won = amount / 1287.43;  // Currency exchange rate from USD to South Korean won.
				double wonNewAmount = Math.round(won * 100.0) / 100.0; // Stores the amount of won variable to two decimal points
				System.out.println("The amount in USD: " + amount + " to South Korean won is: " + wonNewAmount + " South Korean wons.");
				break;
				
			case 7:
				double rand = amount / 18.34; // Currency exchange rate from USD to South Africa rand.
				double randNewAmount = Math.round(rand * 100.0) / 100.0; // Stores the amount of rand variable to two decimal points
				System.out.println("The amount in USD: " + amount + " to South Africa Rand is: " + randNewAmount + " South Africa rands.");
				break;
				
			default:
				System.out.println("You entered a number that is 0 or greater than 7. Run the program again to exchange USD to the current available currencies to exchange.");
				break;
		}
		
		currencyInput.close();
		selectionNumber.close();
	}
	

}
