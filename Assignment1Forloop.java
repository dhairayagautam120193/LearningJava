package assignments;

import java.util.Scanner;

public class Assignment1Forloop {

	
	public static void main(String[] args) {
		
		//WAP TO PRINT TABLE OF Any NUMBER....
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number");
		
		int number = sc.nextInt();
		
		for(int i=1;i<=10;i++) {
			
			
			System.out.println(number+" * "+i+" = "+number*i);
		}
		
		
		
		
	}
	
}
