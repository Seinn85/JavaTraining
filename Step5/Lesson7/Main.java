package Lesson7;

public class Main {
    public static void main(String[] args) {
        Employee manager = new Manager();     // Manager のインスタンスを作成
        manager.showTitle();                  // 役職: マネージャー

        Employee engineer = new Engineer();   // Engineer のインスタンスを作成
        engineer.showTitle();                 // 役職: エンジニア
    }
}