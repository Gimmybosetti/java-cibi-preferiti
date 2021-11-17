package org.generation.italy.array;

import java.util.Scanner;

public class CibiPreferiti {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String[] favFoods = new String[5];
		
		System.out.print("Type in your top 5 favourite foods: \n1)");
		favFoods[0] = scanner.nextLine();
		System.out.print("2)");
		favFoods[1] = scanner.nextLine();
		System.out.print("3)");
		favFoods[2] = scanner.nextLine();
		System.out.print("4)");
		favFoods[3] = scanner.nextLine();
		System.out.print("5)");
		favFoods[4] = scanner.nextLine();
		
		System.out.println("\nThe length of the array is: " + favFoods.length + ".");
		System.out.println("The food in first position is: " + favFoods[0] + ".");
		System.out.println("The food in last position is: " + favFoods[4] + ".");
		
		scanner.close();

	}

}
