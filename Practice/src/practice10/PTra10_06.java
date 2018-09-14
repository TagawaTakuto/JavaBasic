package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */
		final int distance = 100;
		Car car1 = new Car();
		car1.serialNo = 1;
		car1.color = "blue";
		car1.gasoline = 10;
		Car car2 = new Car();
		car2.serialNo = 3;
		car2.color = "green";
		car2.gasoline = 30;
		Car car3 = new Car();
		car3.serialNo = 5;
		car3.color = "red";
		car3.gasoline = 100;

		int idou1 = 0;
		int j = car1.gasoline;
		for(int n = 0 ; n < j ; n++) {
			idou1 = idou1 + car1.run();
				if(car1.gasoline < 0) {
					System.out.println("目的地に到達できませんでした");
						break;
					}else if(distance < idou1) {
						System.out.println("目的地にまで"+ n +"時間かかりました。残りのガソリンは、"+ car1.gasoline +"リットルです。");
						break;
					}
		}

		int idou2 = 0;
		int k = car2.gasoline;
		for(int n = 0 ; n < j ; n++) {
			idou2 = idou2 + car2.run();
				if(car2.gasoline < 0) {
					System.out.println("目的地に到達できませんでした");
						break;
					}else if(distance < idou2) {
						System.out.println("目的地にまで"+ n +"時間かかりました。残りのガソリンは、"+ car2.gasoline +"リットルです。");
						break;
					}
		}

		int idou3 = 0;
		int l = car3.gasoline;
		for(int n = 0 ; n < j ; n++) {
			idou3 = idou3 + car3.run();
				if(car3.gasoline < 0) {
					System.out.println("目的地に到達できませんでした");
						break;
					}else if(distance < idou3) {
						System.out.println("目的地にまで"+ n +"時間かかりました。残りのガソリンは、"+ car3.gasoline +"リットルです。");
						break;
					}
		}
	}
}

