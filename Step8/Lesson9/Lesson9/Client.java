package Lesson9;

public class Client{
    public static void main(String[] args){
        //オリジナルの図形を作成する
        Shape originalCircle = new Circle("Circle1", "Red");
        Shape originalRectangle = new Rectangle("Rectangle1", "Blue");

        //オリジナルの図形を描く
        originalCircle.draw();
        originalRectangle.draw();

        //複製された図形を作成する
        Shape clonedCircle = originalCircle.clone();
        Shape clonedRectangle = originalRectangle.clone();

        //複製された図形を描く
        clonedCircle.draw();
        clonedRectangle.draw();

        //クローンを変更し、元の形状に影響がないことを確認します
        System.out.println("\nChanging cloned shapes...");
        ((Circle) clonedCircle).draw();
        ((Rectangle) clonedRectangle).draw();
    }
}