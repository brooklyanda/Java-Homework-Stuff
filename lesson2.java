package brooklyn;

import java.util.Scanner;

public class lesson2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name, heshe ="";
		int age;
		double gpa;
		boolean isFemale;
		
		System.out.print("Enter students name:");
		name = input.nextLine();
		System.out.print("Enter students age: ");
		age = input.nextInt();
		System.out.print("Enter students gpa: ");
		gpa = input.nextDouble();
		System.out.print("Are you female?(true/false): ");
		isFemale = input.nextBoolean();
		heshe = isFemale ? "she" : "he";
		
		System.out.printf("%s is %d years old, %s has a %4.3f gpa.\n",
				name, age, heshe, gpa);
	}
	
}
