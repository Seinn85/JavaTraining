//プロキシパターン(Proxy Pattern)を使った「秘密(ひみつ)のドア」システム
package Lesson15;

public class Main {
    public static void main(String[] args) {
        // 正しいパスワードは "1234"
        DoorProxy doorProxy = new DoorProxy("1234");

        // 間違ったパスワードで開けようとする
        System.out.println("Attempting to open the door with wrong password...");
        doorProxy.open("0000");  // パスワードが間違っているので拒否

        // 正しいパスワードで開ける
        System.out.println("\nAttempting to open the door with correct password...");
        doorProxy.open("1234");  // 正しいパスワードなので開く
    }
}