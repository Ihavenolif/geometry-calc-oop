package code;

import java.util.Scanner;

public class ptrojuholnik 
{

	public void init() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Vo vzorcoch poèítame s tım, e strana c je prepona");
		System.out.println("Pytagorova veta: c*c = a*a + b*b");
		System.out.println("Vzorec (obvod)= a + b + c");
		System.out.println("Vzorec (obsah)= (a * b) / 2");
		System.out.println("1. Aplikácia pythagorovej vety (pveta)");
		
		switch(sc.next()) 
		{
		case "pveta":
			pveta();
			break;
		}
	}

	private void pveta() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Èo chcete vypoèíta?");
		System.out.println("1. Preponu");
		System.out.println("2. Odvesnu");
		System.out.println("Pre vo¾bu zadajte èíslo");
		
		switch(sc.nextInt()) 
		{
		case 1:
			prepona();
			break;
		case 2:
			odvesna();
			break;
		}
	}

	private void prepona() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Napíšte odvesnu trojúholníka a");
		double a = sc.nextDouble();
		System.out.println("Napíšte odvesnu trojúholníka b");
		double b = sc.nextDouble();
		double res = Math.sqrt(Math.pow(a, 2.0) + Math.pow(b, 2.0));
		System.out.println("Prepona je: " + String.format("%.02f", res));
	}

	private void odvesna() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Napíšte preponu trojúholníka c");
		double c = sc.nextDouble();
		System.out.println("Napíšte známu odvesnu trojúholníka");
		double a = sc.nextDouble();
		double res = Math.sqrt(Math.pow(c, 2.0) - Math.pow(a, 2.0));
		System.out.println("Odvesna je: " + String.format("%.02f", res));
	}
}
