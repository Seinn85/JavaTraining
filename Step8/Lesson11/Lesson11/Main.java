//アダプターパターン(Adapter pattern)を使ったテキストエディタ
package Lesson11;

public class Main {
    public static void main(String[] args) {
        TextEditorClient editor = new TextEditorClient();

        editor.display("plaintext", "This is plain text.");
        editor.display("markdown", "**Bold** and *Italic* text.");
        editor.display("xml", "<tag>Unsupported format</tag>");
    }
}