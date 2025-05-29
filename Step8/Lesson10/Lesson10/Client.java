//ファサードパターン(Facade Pattern)を使ったスマートホームシステム
package Lesson10;

public class Client{
    public static void main(String[] args){
        SmartHomeFacade smartHome = new SmartHomeFacade();

        //お出かけモード
        smartHome.awayMode();

        //帰宅モード
        smartHome.homeMode();
    }
}