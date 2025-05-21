import java.util.Scanner;

public class Lesson7{
   public static void main(String[] args){
      
      //ユーザーから曜日を入力させる
      Scanner scanner = new Scanner(System.in);
      System.out.print("曜日を入力してください（例: 月, 火, 水）");
      String day = scanner.nextLine().trim();
      System.out.println("day is " + day);
      
      switch (day) {
         case "月":
            System.out.println("Monday");
            break;
         case "火":
            System.out.println("Tuesday");
            break;
         case "水":
            System.out.println("Wednesday");
            break;
         case "木":
            System.out.println("Thursday");
            break;
         case "金":
            System.out.println("Friday");
            break;
         case "土":
            System.out.println("Saturday");
            break;
         case "日":
            System.out.println("Sunday");
            break;
         default:
            System.out.println("入力が正しくありません");
            break;
      }
      scanner.close();
   }
}
