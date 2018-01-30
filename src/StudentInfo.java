
/*
 * Brad Malarkey
 * 
 * Lab 7 -- write a program that will recognize valid inputs when user requests info about students in a class
 * 
 * This currently does not work, I really struggled with this lab.
 */

import java.util.Scanner;

public class StudentInfo {

	public static void main(String[] args) {// create scanner and necessary parralel arrays
		Scanner scan = new Scanner(System.in);
		int[] stuNum = { 1, 2, 3, 4 };
		String[] name = { "John Smith", "Terry Bryant", "Dan Doe", "Mary Jane" };
		String[] major = { "Math", "Psych", "Chem", "Bio" };
		String[] home = { "Novi, MI", "Detroit, MI", "Ann Arbor, MI", "Chicago, IL" };
		String userPick = "";
		int i = 0;
		String cont = "y";

		while (cont.equalsIgnoreCase("y")) { // while loop for continuing the program

			try { //try catch statement to make sure the user enters a number between the intended range
				System.out.println(
						"Welcome to our Java Class. Which student would you like to learn more about? (enter a number 1-4): ");
				stuNum[i] = scan.nextInt();
				scan.next();
			} catch (IndexOutOfBoundsException e) {
				System.out.println("Please enter a number between 1-4");
				stuNum[i] = scan.nextInt();
				scan.next();
				continue;
			}
			try { //makes sure user enters the correct input for the question (major or hometown)
				System.out.println("Student " + stuNum[i] + " is " + name[i]
						+ ". What would you like to know about this student? (enter major or hometown): ");
				userPick = scan.nextLine();
				scan.next();
			} catch (IllegalArgumentException e) {
				System.out.println("This data does not exist. Please try again! (enter major or hometown): ");
				userPick = scan.nextLine();
				scan.next();
				continue;
			}
			if (userPick == "major") {
				System.out.println(name[i] + "is a " + major[i] + " major.");
			}
			if (userPick == "hometown") {
				System.out.println(name[i] + "is from " + home[i] + ".");
			}
			System.out.println("Would you like to learn about another student? y/n: ");
			cont = scan.nextLine();
		}
		System.out.println("Goodbye.");
	}

}
