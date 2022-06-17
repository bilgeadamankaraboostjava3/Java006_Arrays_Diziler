package com.muhammet;

public class Runner_Ornek2 {

	public static void main(String[] args) {
		
		int[] sayilar = {68907,-1,23,8,0,4,4,-21,45,33,-1233,32,7,0,78};
		
		/**
		 * 1- En büyük sayýyý bulan program yazabilir misiniz?
		 * 2- En Küçük sayýyý bulan program
		 * 3- bu sayýlarýn ortalamasý nedir?
		 */
		
		// Ortalama -> sayýlarýn toplamý / sayý adedi
		int toplam=0;
		/*
		toplam = toplam + sayilar[0];
		toplam = toplam + sayilar[1];
		toplam = toplam + sayilar[2];
		toplam = toplam + sayilar[3];
		toplam = toplam + sayilar[4];
		toplam = toplam + sayilar[5];
		toplam = toplam + sayilar[6];
		toplam = toplam + sayilar[7];
		*/
		
		for(int i=0;i<sayilar.length;i++)  // lenght=15
			toplam += sayilar[i]; // toplam = toplam + sayilar[i]
		
		int ortalama = toplam / sayilar.length;
		System.out.println("Ortalama...: " + ortalama);
		
		
		// {68907,-1,23,8,0,4,54,-21,45,33,-1233,32,7,0,78};
		int enkucukSayi= sayilar[0]; // -1
		for(int i=1;i<sayilar.length;i++) {
			if(enkucukSayi>sayilar[i])
				enkucukSayi = sayilar[i];
		}
		System.out.println("En küçük sayý....: "+ enkucukSayi);
		
	}

}
