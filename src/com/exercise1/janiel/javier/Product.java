package com.exercise1.janiel.javier;

public class Product {

	/* Using linear sum as reference
	 // Returns the sum of the first n integers of the given array. 
  public static int linearSum(int[] data, int n) {
    if (n == 0)
      return 0;
    else
      return linearSum(data, n-1) + data[n-1];
  }
	 */

	public static int product(int m, int n) {
	    if (n > m) {
	        //Swap m and n to ensure that we always add the larger number to itself.
	        int temp = m;
	        m = n;
	        n = temp;
	    }
		if (n == 0 || m == 0)
			return 0; //base case: if m or n is 0, return 0
		else 
			//add m to the result of the function of m and n-1, effectively counting down from n until it reaches 0.
			return m + product(m, n-1); 
	}

	  //main method
	  //Student Number: 301379377
	  //Student Name: Janiel Mark Javier
	public static void main(String[] args) {
		int m = 3;
		int n = 15;
		System.out.println("Let m = "+ m + " and n = " + n);	
		System.out.println("The product of " + m + " and " + n + " is: " + product(m, n));

	}

}
