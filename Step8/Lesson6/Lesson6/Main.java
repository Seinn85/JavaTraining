package Lesson6;

public class Main{
    public static void main(String[] args){
        Directory root = new Directory("root");

        //ファイルの追加
        root.add(new File("file1.txt"));
        root.add(new File("file2.txt"));

        //サブディレクトリ1
        Directory subDir1 = new Directory("subDir1");
        subDir1.add(new File("file3.txt"));
        subDir1.add(new File("file4.txt"));
        root.add(subDir1);

        //サブディレクトリ2
        Directory subDir2 = new Directory("subDir2");
        subDir2.add(new File("file5.txt"));
        root.add(subDir2);

        //表示する
        root.display("");
    }
}