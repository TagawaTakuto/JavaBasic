package practice14.common;
/*
 * ★ common.Courseを実装した、DBCourseクラスを作成してください
 *
 * コース名称
 * 		「【Eラーニング】DB基礎」
 * 単元
 * 		DB基礎
 * 		SQL基礎
 * 		正規化
 * 		SQL応用
 */

public class DBCourse implements Course{
	private String coursename = "【Eラーニング】DB基礎";
	private String[] courseunit = {"DB基礎","SQL基礎","正規化","SQL応用"
									};

	public String getCourseName() {
		return this.coursename ;

	}

	public String[] getCourseUnit() {
		return this.courseunit;

	}
}

