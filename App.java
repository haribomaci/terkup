/*
* File: App.java
* Author: Tóth Júlia
* Copyright: 2022, Tóth Júlia
* Group: Szoft 1/n
* Date: 2022-02-16
* Github: https://github.com/haribomaci/
* Licenc: GNU GPL
*/

import java.util.Scanner;
public class App {
	
	public static void main (String[] args) {
		System.out.println("Toth Julia, 2022-02-16, szoft 1/n");
		System.out.println("Feladat 0306");
		System.out.println("Haromszog teruletszamitas");
		System.out.println();
		
		Scanner scan= new Scanner(System.in);
		
		System.out.print("Alap: ");
		double alap = scan.nextDouble();
		System.out.print("Magassag: ");
		double magassag = scan.nextDouble();
		
		double terulet = alap * magassag;
		System.out.println("Terulet: "+ terulet);
		
		
	}
}

