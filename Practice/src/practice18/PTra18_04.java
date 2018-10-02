/*
 * PTra18_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import entity.Player;

public class PTra18_04 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */
		ArrayList<Player> array = new ArrayList<Player>();
		try(Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {
            while (scanner.hasNext()) {
            	Player player = new Player();
            	 String playerStr = scanner.nextLine();
                 String[] p = (playerStr.split(","));
                 player.setPosition(p[0]);
                 player.setName(p[1]);
                 player.setCountry(p[2]);
                 player.setTeam(p[3]);
                 array.add(player);
            }
		} catch (FileNotFoundException e) {
			System.out.println("ファイルが見つかりません");
		}


		// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください
		for(int g = 0 ; g < array.size() ; g++) {
			Collections.shuffle(array);
			if(array.get(g).getPosition().equals("GK")) {
				System.out.println(array.get(g));
				break;
			}
		}
		int D = 0;
		for(int d = 0 ; d < array.size() ; d++) {
			Collections.shuffle(array);
			if(array.get(d).getPosition().equals("DF")){
				System.out.println(array.get(d));
				D++;
					if(D > 3) {
						break;
					}
			}
		}
		int M = 0;
		for(int m = 0 ; m < array.size() ; m++) {
			Collections.shuffle(array);
			if(array.get(m).getPosition().equals("MF")) {
				System.out.println(array.get(m));
				M++;
					if(M > 3) {
						break;
					}
			}
		}
		int F = 0;
		for(int f = 0 ; f < array.size() ; f++) {
			Collections.shuffle(array);
			if(array.get(f).getPosition().equals("FW")) {
				System.out.println(array.get(f));
				F++;
					if(F > 1) {
						break;
					}
			}
		}
	}
}
