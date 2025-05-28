package Lesson6;

//ファイルシステム内の共通コンポーネントを表すインターフェース
public interface FileSystemComponent{
    
    //ファイルまたはフォルダの内容を表示するためのメソッド
    void display(String indent);
}