import java.util.Scanner;

public class Lesson15 {
    public static void main(String[] args) {
        //長さが5の文字列型の配列を宣言する
        String[] names;
        names = new String[5];

        //ユーザーから名前を5回入力してもらう
        Scanner scanner = new Scanner(System.in);
        System.out.println("5人の名前を入力してください");
        for(int i=0; i<5; i++){         
            System.out.println((i + 1) + "人の名前を入力してください");
            names[i] = scanner.nextLine();
        }

        //配列に格納された5人の名前を順番に表示する
        for(int i=0; i<5; i++){
            System.out.println("名前" + (i+1) + ": " + names[i]);
        }
        scanner.close();
    }
}