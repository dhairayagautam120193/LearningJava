package assignments;

import java.util.Scanner;

public class Assignment2Whileloop {


	public static void main(String[] args) {

		
		//	WAP TO PRINT REVERSE OF A STRING....

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any String..");

		String str= sc.nextLine();
				
		int i=0;
		
		String temp="";
		
		
		while(i<=str.length()) {
		
			temp=temp+str.charAt(str.length()-1);
			
			i++;
			
			
		}
		System.out.println(temp);


	}
}
