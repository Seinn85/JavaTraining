package Lesson7;

//Managerクラス（Employee を継承）
class Manager extends Employee {
    //抽象メソッドをオーバーライド（中身を書く）
    @Override
    public void showTitle() {
        System.out.println("役職: マネージャー");
    }
}