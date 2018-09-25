/*
 * PTra13_09.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice13.ptra13;

import practice13.common.Employee;

public class PTra13_09 {

	/*
	 * ★ PTra13_08で作成したEmployeeクラスを使用します
	 */

	/** 名前データ（定数） */
	public static final String[] NAMEDATA = {"山田", "佐藤", "小林"};

	/** メールデータ（定数） */
	public static final String[] MAILDATA = {"yamada@hoge.com","satou@hoge.com","kobayashi@hoge.com"};

	/** パスワードデータ（定数） */
	public static final String[] PASSDATA = {"rezo0001","rezo0002","rezo0003"};

	/** 部署データ（定数） */
	public static final String[][] QUATERDATA = {
														{"総務部","業務部","システム部"},
														{"5","10","35"},
													};

	/**
	 * エントリーポイント
	 * @param args
	 */
	public static void main(String[] args) {

		// ★ 定数で定義されている各データを使用して、Employeeインスタンスを３つ作成してください
		Employee em1 = new Employee();
		em1.userNm = NAMEDATA[0];
		em1.mail = MAILDATA[0];
		em1.password = PASSDATA[0];
		em1.setDepartmentNm(QUATERDATA[0][0]);
		em1.setDepartmentCnt(Integer.parseInt(QUATERDATA[1][0]));


		Employee em2 = new Employee();
		em2.userNm = NAMEDATA[1];
		em2.mail = MAILDATA[1];
		em2.password = PASSDATA[1];
		em2.setDepartmentNm(QUATERDATA[0][1]);
		em2.setDepartmentCnt(Integer.parseInt(QUATERDATA[1][1]));

		Employee em3 = new Employee();
		em3.userNm = NAMEDATA[2];
		em3.mail = MAILDATA[2];
		em3.password = MAILDATA[2];
		em3.setDepartmentNm(QUATERDATA[0][2]);
		em3.setDepartmentCnt(Integer.parseInt(QUATERDATA[1][2]));

	}
}
