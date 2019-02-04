package code;

import java.util.Scanner;

public class trojuholnik {

	public void init() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vzorec: (Obvod): a + b + c");
		System.out.println("Vzorec: (Obsah): (a * va) / 2");
		System.out.println("1. V�po�et obvodu (obvod)");
		System.out.println("2. V�po�et obsahu (obsah)");
		switch (sc.next()) 
		{
		case "obvod":
			obvod();
			break;
		case "obsah":
			obsah();
			break;
		}
	}

	private void obvod() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nap� stranu troj�holn�ka a");
		double a = sc.nextDouble();
		System.out.println("Nap� stranu troj�holn�ka b");
		double b = sc.nextDouble();
		System.out.println("Nap� stranu troj�holn�ka c");
		double c = sc.nextDouble();
		double res = a + b + c;
		System.out.println("Obvod je: " + String.format("%.02f", res));
	}

	private void obsah() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nap� stranu troj�holn�ka a");
		double a = sc.nextDouble();
		System.out.println("Nap� v��ku troj�holn�ka na stranu a");
		double va = sc.nextDouble();
		double res = (a * va) / 2;
		System.out.println("Obsah je: " + String.format("%.02f", res));
	}
	
}
