package com.muhammet;

import java.util.Scanner;

public class Runner_Ornekler {

	public static void main(String[] args) {
		
		int sinifMevcudu;
		Scanner scanner = new Scanner(System.in);	
		System.out.println("********************************");
		System.out.println("*****  OKUL OTOMASYONU    ******");
		System.out.println("********************************");
		System.out.println();
		System.out.println("1- Sýnýf Tanýmlama");
		System.out.println("2- Öðrenci Tanýmlama");
		System.out.println("3- Sýnýf Listeleme");
		System.out.println("4- Not Vermek");
		System.out.println("5- Not Listeleme");
		System.out.println("0- ÇIKIÞ");
		System.out.println();
		int sayi;
		sayi = 5;
		int sayi2 = 5;
		System.out.println("Sýnýf Mevcudunu giriniz...: ");
		sinifMevcudu = scanner.nextInt();
		
		String[] sinifListesi = new String[sinifMevcudu];//  {"","","",""}
		scanner = new Scanner(System.in);
		for(int i=0;i<sinifListesi.length;i++) {
			System.out.print((i+1)+". Öðrencinin adýný gir....: ");
		
			sinifListesi[i] = scanner.nextLine();
		}
		
		
		System.out.println("Öðrenci Listesi");
		for(int i=0;i<sinifListesi.length;i++)
			System.out.println(sinifListesi[i]);

	}

}
