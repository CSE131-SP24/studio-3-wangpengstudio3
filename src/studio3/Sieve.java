package studio3;

import java.util.Scanner;

public class Sieve {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("What number would you like to check up to?");
		int n = in.nextInt();
		
		// initial number array
		int[] numbers;
		numbers = new int[n];
		
		for(int i = 2; i < n+2; i++) {
			numbers[i-2] = i;
		}
		
		// boolean array
		Boolean[] test;
		test = new Boolean [n];
		for(int i = 0; i < n; i++) {
			test[i] = true;
		}
		// tests if divisible
		for (int i=2; i<n; i++) {
			int var = i;
			
			
			for (int j = i*i; j<n; j+=i) {
				test[j]=false;
			}
			
		}
		
		//final print
		for (int x=1 ; x<n; x++) {

			if (test[x] == true) {
				System.out.print (x+ " ");
			}
	
		}
		
	}
}
