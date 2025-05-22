package Lesson10;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();

        //名前と成績を設定
        student.setName("タロウ");
        student.setGrade(90);

        //名前と成績を表示
        System.out.println("名前: " + student.getName());
        System.out.println("成績: " + student.getGrade());
    }
}