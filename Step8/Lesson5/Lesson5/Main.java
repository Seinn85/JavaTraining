package Lesson5;
import java.util.Scanner;

//メインクラス
public class Main{
    public static void main(String[] args){
        //ユーザーから入力をもらうためのスキャナー
        Scanner scanner = new Scanner(System.in);

        //Animalの種類をたずねる
        System.out.print("どの動物を生成しますか？（dog, cat, bird）：");
        String input = scanner.nextLine();

        //入力にもとづいてAnimalを作る
        Animal animal = AnimalFactory.createAnimal(input);

        //Animalが正しく作られたら、鳴き声を出す
        if (animal != null){
            animal.makeSound();
        }else{
            //入力が間違っていたときのメッセージ
            System.out.println("そのような動物は存在しません。");
        }

        //スキャナーを閉じる
        scanner.close();
    }
}