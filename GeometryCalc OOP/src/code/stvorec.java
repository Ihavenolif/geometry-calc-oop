package code;

import java.util.Scanner;

public class stvorec {

	public void init() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Vzorec: (Obvod): 4 * a");
		System.out.println("Vzorec: (Obsah): a * a");
		System.out.println("1. Výpoèet obvodu (obvod)");
		System.out.println("2. Výpoèet obsahu (obsah)");
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

	private void obvod() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Napíš stranu štvorca");
		double a = sc.nextDouble();
		double res = 4 * a;
		System.out.println("Obvod je: " + String.format("%.02f", res));
	}

	private void obsah() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Napíš stranu štvorca");
		double a = sc.nextDouble();
		double res = a * a;
		System.out.println("Obsah je: " + String.format("%.02f", res));
	}
}
