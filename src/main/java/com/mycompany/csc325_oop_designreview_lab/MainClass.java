/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.csc325_oop_designreview_lab;
import java.util.Scanner;

/**
 * @author Sohail Nawaz
 * @author MoaathAlrajab
 */
public class MainClass {

 public static void main(String[] args) {
		// ToDo 5: Fix the error

		// ToDo 6: Fix the constructor of the Student class

                // Todo 7: Create two classes for Freshman and Senior 

                // ToDo 8: The senior class should have a minimum of 85 credits  

		// ToDo 9: Add a toString method for the Student class
		// ToDo 10: Add a toString method for the Freshman class

	 Scanner scanner = new Scanner(System.in);

	 Student std1= new Student("James", (short)20, 3.0);

	 Freshman fre1 = new Freshman("James", (short)20, 3,16); // Fixed the class
	 Senior sen1 = new Senior("John", (short)30, 3.5, 90); // Fixed the class

	 System.out.print("Enter GPA for freshman: ");
	 fre1.setGpa(scanner.nextDouble()); // ToDo 12: Set the gpa of the student using the scanner

	 System.out.print("Enter GPA for senior: ");
	 sen1.setGpa(scanner.nextDouble());


                // ToDo 11: Add a toString method for the Senior class



		// ToDo 12: Set the gpa of the student using the scanner and user
		// 			input and then print the output.
		System.out.println(std1);
		System.out.println(fre1);
		System.out.println(sen1);

		// ToDo 13: add comments and explain your code

	}

}

