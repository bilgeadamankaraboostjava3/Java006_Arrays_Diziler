package com.muhammet;

public class Runner {

	public static void main(String[] args) {
	
		//*** jagged arrays -> çoklu dizilerde farklý boyutlar alabilen diziler var 
		
		// tam sayý dizisi => {1,34,-90,344,42} 
		// metin dizisi => {ahmet, ayþe, turan,kemal, bahdýr}

		// tam sayýlarý ifade eden deðiþken -> byte,short,int,long
		// dizi deðiþkeni tanýmlamak. []
		long[] longdizisi;
		long [] longDizisi2;
		long longDizisi3[];
		// Dizileri baþlatmadan(initialize) kullanamazsýnýz. istisnaFýrlatýr
		int diziBoyutu = 200;
		longdizisi = new long[diziBoyutu]; // {0,0,0,0,0,0,0........0}
		// bir dizinin elemanýna deðer atamak.
		int sayi;
		sayi = 5;
		longdizisi[2] = 5; // index no  // {0,0,5,0,0,0,0}
		// dizinin bir elemenýnýn deðerini okumamk
		int sayi2 = 6;
		//System.out.println(sayi2);
		System.out.println(longdizisi[0]);
		System.out.println(longdizisi[1]);
		System.out.println(longdizisi[2]);
		System.out.println(longdizisi[3]);
		System.out.println(longdizisi[4]);
		System.out.println(longdizisi[5]);		
		System.out.println(longdizisi[6]);
		//System.out.println(longdizisi[7]);
		//System.out.println(longdizisi[8]);
		System.out.print("Dizi..: { ");
		for(int i=0;i<diziBoyutu;i++) {
			System.out.print(longdizisi[i]+ ((i==(diziBoyutu-1)) ? "" : ", "));
		}
		System.out.println(" } ");
		// alternatif
		System.out.print("Dizi..: { ");
		for(int i=0;i<longdizisi.length;i++) {
			System.out.print(longdizisi[i]+ ", ");
		}
		System.out.println(" } ");
		
		// Nelerden dizi yapabiliriz.
		long[] longdizi;
		int[] intdizi;
		String[] srtingdizi;
		boolean[] booleandizi[]; // hobileriniz nelerdir? -> gmail de mail listesi silme yapacaksýn.
		Runner[] runnerdizisi; // olur
		
		
		
	}

}
