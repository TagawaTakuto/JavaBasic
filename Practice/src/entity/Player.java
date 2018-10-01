package entity;

public class Player {
	/*
	 * ★ BestElevenCandidate.csvの情報を保持するためのクラス、entity.Playerクラスを作成してください
	 *
	 * フィールド
	 * 		position	：	String
	 * 		name		：	String
	 * 		country		：	String
	 * 		team		：	String
	 * メソッド
	 * 		各アクセサ
	 *
	 * 		toString()	：	Objectクラスのオーバーライド
	 * 		各フィールドの値を、カンマ区切りの文字列で取得する
	 */
	private static String position;
	private static String name;
	private static String country;
	private static String team;

	public String getPosition(){
		return this.position;
	}

	public String getName() {
		return this.name;
	}

	public String getCountry() {
		return this.country;
	}

	public String getTeam() {
		return this.team;
	}

	public String toString(){
		return this.position + "," + name + "," + country + "," + team;


	}
}
