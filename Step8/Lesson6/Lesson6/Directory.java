package Lesson6;

import java.util.ArrayList;
import java.util.List;

//フォルダをあらわすクラス
public class Directory implements FileSystemComponent{

    //フォルダの名前
    private String name;

    //フォルダの中にあるファイルやフォルダのリスト
    private List<FileSystemComponent> children;

    //コンストラクタ（フォルダの名前をもらう）
    public Directory(String name){
        this.name = name;
        this.children = new ArrayList<>();
    }

    //フォルダの中にファイルやフォルダを追加する
    public void add(FileSystemComponent component){
        children.add(component);
    }

    //フォルダの中からファイルやフォルダを削除する
    public void remove(FileSystemComponent component){
        children.remove(component);
    }

    //フォルダの名前と中身を表示するメソッド
    @Override
    public void display(String indent){
        System.out.println(indent + "+ Directory: " + name);
        //中にあるすべてのファイルやフォルダも表示する
        for (FileSystemComponent child : children) {
            child.display(indent + "  ");
        }
    }
}