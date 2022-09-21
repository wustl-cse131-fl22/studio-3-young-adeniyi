package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//user input
		Scanner in= new Scanner(System.in);
		int n= 0;
		System.out.println("Enter Maximum Bound");
		n= in.nextInt();
	
		//setting all numbers in array to true initially
		boolean [] truePrime= new boolean[n];
		for (int i =1; i<n; i++) {
			truePrime[i]= true;
		}
		//eliminating all non-prime numbers
		for (int z=2; z<=n; z++) {
			
			if (truePrime[z-1]) {
				System.out.println(z);
				
				for (int p = (z*z); p <= n; p += z) {
					
					truePrime[p-1] = false;
					
					
				}
			}
			
		}
	}

}
