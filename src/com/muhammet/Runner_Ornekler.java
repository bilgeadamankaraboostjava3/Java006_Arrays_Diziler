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
		System.out.println("1- S�n�f Tan�mlama");
		System.out.println("2- ��renci Tan�mlama");
		System.out.println("3- S�n�f Listeleme");
		System.out.println("4- Not Vermek");
		System.out.println("5- Not Listeleme");
		System.out.println("0- �IKI�");
		System.out.println();
		int sayi;
		sayi = 5;
		int sayi2 = 5;
		System.out.println("S�n�f Mevcudunu giriniz...: ");
		sinifMevcudu = scanner.nextInt();
		
		String[] sinifListesi = new String[sinifMevcudu];//  {"","","",""}
		scanner = new Scanner(System.in);
		for(int i=0;i<sinifListesi.length;i++) {
			System.out.print((i+1)+". ��rencinin ad�n� gir....: ");
		
			sinifListesi[i] = scanner.nextLine();
		}
		
		
		System.out.println("��renci Listesi");
		for(int i=0;i<sinifListesi.length;i++)
			System.out.println(sinifListesi[i]);

	}

}
