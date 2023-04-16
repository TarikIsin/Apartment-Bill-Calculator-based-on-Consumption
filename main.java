import java.util.Scanner;

public class Pro1_150120526 {
  
  public static void main(String args[]) {
  
	  Scanner input = new Scanner(System.in);
	  
	  int n = input.nextInt();	// Taking number of flats

	  double[] flats = new double[n + 1];
	  for (int i = 0; i < flats.length; i++)
		  flats[i] = input.nextDouble(); 	//	Making a array with flats consumption and total bill
	  	
	 
	 double totalBill = flats[n];	// Find a total bill
	 double[] bills = calculateTheInvoice (flats,totalBill);
	 
	 printBills (bills);
   
  }
  
   public static double[] calculateTheInvoice (double[] flats, double totalBill) {
	   
	   	double sum = 0;	
	   	double[] bills = new double[flats.length];  	// Finding total consumption
		for (int i = 0; i < flats.length - 1 ; i++) 	
			sum += flats[i];
		
		for (int i = 0; i < flats.length - 1; i++) 		// Finding bills for each flats
			 bills[i] = (((totalBill / 100) * 30) / (flats.length - 1)) + ((((totalBill / 100) * 70) / sum) * flats[i]);
			  
		return bills;
   }
   
   public static void printBills (double[] bills) {			
 
	   for (int i = 0; i < bills.length - 1; i++)		// Printing bills for each flats
	   System.out.println("Flat #" + (i + 1) + ": " + (int)(bills[i] * 100) / 100.0);
  
   }
}
