package code;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		int reset = 0;
		do 
		{
			System.out.println("1. Kruh (kruh)");
			System.out.println("2. Štvorec (stvorec)");
			System.out.println("3. Obdåžnik (obdlznik)");
			System.out.println("4. Trojúholník (trojuholnik)");
			System.out.println("Napíš text v zátvorke pre spustenie funkcie");
			
			String detect = sc.next();
			
			switch (detect) 
			{
			case "kruh":
				kruh kruh = new kruh();
				kruh.init();
				break;
			case "stvorec":
				stvorec stvorec = new stvorec();
				stvorec.init();
				break;
			case "obdlznik":
				obdlznik obdlznik = new obdlznik();
				obdlznik.init();
				break;
			case "trojuholnik":
				trojuholnik trojuholnik = new trojuholnik();
				trojuholnik.init();
				break;
			}
		
			System.out.println("Napíš 1 pre resetovanie programu");
			
			try {
			reset = sc.nextInt();
			} catch (java.util.InputMismatchException e) {

			} catch (Exception f) {
				System.out.println(f);
			}
			
		} while(reset == 1);
		
		System.out.println("VYPNUTÉ");
	}

}
