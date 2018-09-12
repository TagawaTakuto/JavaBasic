package practice06;
/*
 * PTra06_07.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra06_07 {
	public static void main(String[] args) {

		// ★ for文を使って、以下のような出力になるようにしてください
		/*
		 * 出力結果例
		 * -----------------------------------
		 * □□□□□
		 * ■□□□□
		 * ■■□□□
		 * ■■■□□
		 * ■■■■□
		 * ■■■■■
		 * ■■■■□
		 * ■■■□□
		 * ■■□□□
		 * ■□□□□
		 */
		for(int I = 0 ; I < 5 ; I++) {
			for(int B = 0 ; B < I ; B++) {
				System.out.print("■");
			}
					for(int W = 5 ; W > I ; W--){
							System.out.print("□");
					}
								System.out.println("");
		}

		for(int i = 0 ; i < 5 ; i++) {
			for(int b = 5; b > i ; b--){
				System.out.print("■");
			}
				for(int w =  0; w < i ; w++) {
					System.out.print("□");
				}
						System.out.println("");
		}
	}
}
