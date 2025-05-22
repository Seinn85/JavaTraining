package Lesson7;

//Engineerクラス（Employee を継承）
class Engineer extends Employee {
    //抽象メソッドをオーバーライド（中身を書く）
    @Override
    public void showTitle() {
        System.out.println("役職: エンジニア");
    }
}