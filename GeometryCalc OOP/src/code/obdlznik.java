package code;

import java.util.Scanner;

public class obdlznik{

	public void init() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Vzorec: (Obvod): 2 * (a + b)");
		System.out.println("Vzorec: (Obsah): a * b");
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
		System.out.println("Napíš stranu obdåžnika a");
		double a = sc.nextDouble();
		System.out.println("Napíš stranu obdåžnika b");
		double b = sc.nextDouble();
		double res = 2 * (a + b);
		System.out.println("Obvod je: " + String.format("%.02f", res));
	}

	private void obsah() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Napíš stranu obdåžnika a");
		double a = sc.nextDouble();
		System.out.println("Napíš stranu obdåžnika b");
		double b = sc.nextDouble();
		double res = a * b;
		System.out.println("Obsah je: " + String.format("%.02f", res));
	}
}
