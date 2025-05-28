package Lesson6;


//ファイルをあらわすクラス
public class File implements FileSystemComponent{
    
    //ファイルの名前
    private String name;

    //コンストラクタ（ファイルの名前をもらう）
    public File(String name){
        this.name = name;
    }

    //ファイルの名前を表示する
    @Override
    public void display(String indent){
        System.out.println(indent + "- File: " + name);
    }
}
