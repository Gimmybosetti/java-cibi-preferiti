package org.generation.italy.array;

import java.util.Scanner;

public class CibiPreferiti {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int med;
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
		
		System.out.println("\nThe length of the scoreboard is: " + favFoods.length + ".");
		System.out.println("The food in first position is: " + favFoods[0] + ".");
		System.out.println("The food in last position is: " + favFoods[4] + ".");
		
		//nel caso di array con numero di elementi dispari la mediana è l'elemento centrale
		//nel caso di array con numero di elementi pari invece bisogna prendere quelli in posizione n/2 e (n/2 + 1)
		//nel mio caso sono 5 gli elementi ma faccio entrambe le casistiche
		
		med = favFoods.length / 2;
		
		if ((favFoods.length % 2) == 0) {
			System.out.println("\nThe middle food are: " + favFoods[med - 1] + " and " + favFoods[med]);
		}else {
			System.out.println("\nThe middle food is: " + favFoods[med]);
		}
		
		scanner.close();

	}

}
