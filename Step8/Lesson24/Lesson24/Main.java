package Lesson24;

public class Main {
    public static void main(String[] args) {
        Player player = new Player(10, 100);
        Caretaker caretaker = new Caretaker();

        player.showStatus();  // 初期状態
        caretaker.save(player, "Before Boss Fight");

        player.fight();  // レベルアップ、HP減少
        player.showStatus();
        caretaker.save(player, "Mid Battle");

        player.fight();  // さらに戦う
        player.showStatus();

        // セーブ一覧を確認
        caretaker.showSavedLabels();

        // ラベル指定で復元
        caretaker.loadByLabel(player, "Before Boss Fight");
        player.showStatus();

        // Undo（直前のセーブに戻る）
        caretaker.undo(player);
        player.showStatus();
    }
}