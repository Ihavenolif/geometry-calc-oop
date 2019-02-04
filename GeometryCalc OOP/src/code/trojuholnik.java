package code;

import java.util.Scanner;

public class trojuholnik {

	public void init() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vzorec: (Obvod): a + b + c");
		System.out.println("Vzorec: (Obsah): (a * va) / 2");
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

	private void obvod() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Napíš stranu trojúholníka a");
		double a = sc.nextDouble();
		System.out.println("Napíš stranu trojúholníka b");
		double b = sc.nextDouble();
		System.out.println("Napíš stranu trojúholníka c");
		double c = sc.nextDouble();
		double res = a + b + c;
		System.out.println("Obvod je: " + String.format("%.02f", res));
	}

	private void obsah() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Napíš stranu trojúholníka a");
		double a = sc.nextDouble();
		System.out.println("Napíš výšku trojúholníka na stranu a");
		double va = sc.nextDouble();
		double res = (a * va) / 2;
		System.out.println("Obsah je: " + String.format("%.02f", res));
	}
	
}
