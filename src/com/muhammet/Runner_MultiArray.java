package com.muhammet;

public class Runner_MultiArray {

	public static void main(String[] args) {
		
		int[] sayi_dizisi = new int[5]; //{0,0,0,0,0}
		int[][] matris = new int[5][5]; // {{0,0,0,0,0}  ,{34,0,0,0,0} , {0,0,0,0,0} ,{0,0,19,0,0} ,{0,0,0,0,0} } 

		matris[3][2] = 19;
		matris[1][0] = 34;
		
		//System.out.println(matris[3][2]);
		//System.out.println(matris[3][0]);
		/**
		 *{  {1,	OKL01,	Ceren,	KUÞ} , 	{2,	OKL02,	Bahar,	TEMÝZ} 	,		{3,	OKL03,	Ahmet,	Kerim} }

		 */
		String[][] sinifListesi = new String[3][4];
		//  1	OKL01	Ceren	KUÞ
		sinifListesi[0][0] = "1";
		sinifListesi[0][1] = "OKL01";
		sinifListesi[0][2] = "Ceren";
		sinifListesi[0][3] = "KUÞ";
		// 2	OKL02	Bahar	TEMÝZ
		sinifListesi[1][0] = "2";
		sinifListesi[1][1] = "OKL02";
		sinifListesi[1][2] = "Bahar";
		sinifListesi[1][3] = "TEMÝZ";
		// 	3	OKL03	Ahmet	Kerim
		sinifListesi[2][0] = "3";
		sinifListesi[2][1] = "OKL03";
		sinifListesi[2][2] = "Ahmet";
		sinifListesi[2][3] = "KERÝM";
		
		for(int i=0;i<sinifListesi.length;i++) // i=3
			for(int j=0;j<sinifListesi[i].length;j++) // i=2, j=4
				System.out.println(sinifListesi[i][j]); // i=0-> sinifListesi[0][0] // i=1-> sinifListesi[1][0]
		
	}

}
