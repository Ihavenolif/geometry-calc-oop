package code;

import java.util.Scanner;

public class kruh {
	
	public void init() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Vzorec: (Obvod): 2 * PI * r");
		System.out.println("Vzorec: (Obsah): PI * r * r");
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

	private void obsah() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Napíš polomer kruhu");
		double r = sc.nextDouble();
		double res = Math.PI * r * r;
		System.out.println("Obsah je: " + String.format("%.02f", res));
	}

	private void obvod() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Napíš polomer kruhu");
		double r = sc.nextDouble();
		double res = Math.PI * 2 * r;
		System.out.println("Obvod je: " + String.format("%.02f", res));
	}
	
}
