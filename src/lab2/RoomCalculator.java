package lab2;

import java.util.Scanner;

public class RoomCalculator {

	public static void main(String[] args) {
		
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.print("What's the room length? ");
		double roomLength = scnr.nextDouble();
		
		System.out.print("What's the room width? ");
		double roomWidth = scnr.nextDouble();
		
		System.out.print("What's the room height? ");
		double roomHeight = scnr.nextDouble();
		
		double roomArea = roomLength * roomWidth;
		double roomPerimeter = (roomLength * 2) + (roomWidth *2);
		double roomVolume = roomLength * roomWidth * roomHeight;

		System.out.println("Room Area: " + roomArea);
		System.out.println("Room Perimeter: " + roomPerimeter);
		System.out.println("Room Volume: " + roomVolume);
		
		
		System.out.println("Continue? (y/n)");
		
		char toContinue = scnr.next().charAt(0);
		
		if (toContinue == ('y')) {
			main(null);
		} else {
			System.out.println("Ending");
		}
		scnr.close();
	}

}
