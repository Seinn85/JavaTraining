package Lesson10;

public class Student {
    //privateで変数を宣言（クラス外から直接アクセスできない）
    private String name;
    private int grade;

    //名前を設定するメソッド
    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            System.out.println("名前を入力してください");
        } else {
            this.name = name;
        }
    }

    //名前を取得するメソッド
    public String getName() {
        return name;
    }

    //成績を設定するメソッド
    public void setGrade(int grade) {
        if (grade < 0 || grade > 100) {
            System.out.println("成績は0から100の間で入力してください");
        } else {
            this.grade = grade;
        }
    }

    //成績を取得するメソッド
    public int getGrade() {
        return grade;
    }
}