package knight.day6;

public class DisplayPrimeNumbers {
	 //a whole number greater than 1 that cannot be exactly divided by any whole number 
	//other than itself and 1 (e.g. 2, 3, 5, 7, 11).
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i =0; 
		int num =0; 
		//Empty String
		 String primeNumbers = ""; 
		 for (i = 1; i <= 100; i++) 
		 { 
		 int counter=0; 
		for(num =i; num>=1; num--) 
		 { 
		 if(i%num==0) 
		 { 
		 counter = counter + 1; 
		 } 
		 } 
		 if (counter ==2) 
		 { 
		 //Appended the Prime number to the String
		primeNumbers = primeNumbers + i + " "; 
		 } 
		 } 
		 System.out.println("Prime numbers from 1 to 100 are :"); 
		 System.out.println(primeNumbers); 
	}

}
