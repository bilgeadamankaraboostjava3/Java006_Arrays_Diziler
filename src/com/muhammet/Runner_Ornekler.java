package com.muhammet;

import java.util.Scanner;

public class Runner_Ornekler {

	public static void main(String[] args) {
		
		/**
		 * Her bir de�ikenin bir kapsama alan� vard�r. s�n�f i�i de�i�kenler i�in (local de�i�kenler)
		 * kapsama alan� {} lerin i�idir.
		 */
		/**
		 * t�m�n� tapat true/false
		 * 1.  true -> false
		 * 2.  true -> false
		 * 3.  false-> false
		 */
		
		//1-
		int sinifMevcudu=0,secim;
		String[] sinifListesi=null;
		int[] matematikNotlari = null;
		//2-
		do {
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
		//3- 
		System.out.println("L�tfen Se�im yap�n�z....: ");
		secim = scanner.nextInt();
		//4- 
		switch(secim) {
			case 1: 
				System.out.println("*********************************");
				System.out.println("****  SINIF TANIMLAMA  **********");
				System.out.println("*********************************");
				
				System.out.println("S�n�f Mevcudunu giriniz...: ");
				sinifMevcudu = scanner.nextInt();
				break;
			case 2: 
				sinifListesi = new String[sinifMevcudu];//  {"","","",""}
				scanner = new Scanner(System.in);
				for(int i=0;i<sinifListesi.length;i++) {
					System.out.print((i+1)+". ��rencinin ad�n� gir....: ");
				
					sinifListesi[i] = scanner.nextLine();
				}
				break;
			case 3:  
				System.out.println("*****************************");
				System.out.println("** S�n�f ��renci Listesi ****");
				System.out.println("*****************************");
				System.out.println();
				for(int i=0;i<sinifListesi.length;i++)
					System.out.println(sinifListesi[i]);
				/***
				 * ENTER e bas�ncaya kadar bekle komutunu buraya ekleyelim.
				 */
				break;
			case 4: 
				System.out.println("*****************************");
				System.out.println("**** Not Giri� Ekran� *******");
				System.out.println("*****************************");
				System.out.println();
				matematikNotlari = new int[sinifMevcudu];
				/// sinifListesi -> {"","","",""}
				for(int i=0;i<sinifMevcudu;i++) { // i=0
					
					System.out.print(sinifListesi[i]);
					System.out.println(" adl� ��rencinin 1. Notu gir...: ");
					int not1 = scanner.nextInt();
					
					/* Kaan
					if(!(not1>=0 && not1<=100)) {
						i--; // i=-1
						continue;
					}
					*/	
					System.out.print(sinifListesi[i]);
					System.out.println(" adl� ��rencinin 2. Notu gir...: ");
					int not2 = scanner.nextInt();
					int ort = (not1+not2)/2;
					matematikNotlari[i] = ort;
				}
				
				
				break;
			case 5: 
				
				break;
				
			case 0:
				System.out.println("�IKI� YAPILDI");
				break;
				
			default:
				System.err.println("L�tfen Ge�erli bir se�im yap�n�z.");
				break;
			
		}// Switch Sonu
		
	}while(secim!=0);
		
		
		
		
		

	}// Main Method Sonu

}//Class Sonu
