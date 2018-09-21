package practice13.common;

/*
 * ★ common.Itemクラスを作成してください
 *
 * フィールド
 * 		name	:	String
 * 		additionalDamage	:	int
 * メソッド
 * 		各フィールドのアクセサ
 * コンストラクタ
 * 		name, additionalDamageに初期値を設定するコンストラクタ
 * 		上記2つを設定するための引数を持つ
 */
	public class Item {
		private String name;
		private static int additionalDamage;


	public String setName(String name) {
		return this.name = name;
	}

	public String getName() {
		return name;
	}

	public int setAdditionalDamage(int additionalDamage) {
		return this.additionalDamage = additionalDamage;
	}
	public static int getAdditionalDamage() {
		return additionalDamage;
	}
Item(){
	this.name = "null";
	this.additionalDamage = 0;

	}
}