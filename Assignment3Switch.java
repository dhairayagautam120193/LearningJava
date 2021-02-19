package assignments;

import java.util.Scanner;



public class Assignment3Switch {

	Scanner sc = new Scanner(System.in);

	public void switchControl() {

		System.out.println("Enter the Day");

		String choice= sc.nextLine();

		switch(choice) {


		case "Monday":

			System.out.println("Today's menu is Indian");

			break;

		case "Tuesday":

			System.out.println("Today's menu is Itaian");

			break;

		case "Wednesday":

			System.out.println("Today's menu is Continental");
			
			break;
			
		case "Thursday":

			System.out.println("Today's menu is South indian");

			break;
			
		case "Friday":

			System.out.println("Today's menu is Chinese");




		}

	}


	public static void main(String[] args) {


		Assignment3Switch object = new Assignment3Switch();

		object.switchControl();


	}


}
