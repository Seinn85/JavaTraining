package Lesson9;

//かたち（図形）をあらわすインターフェース
//Cloneable（コピーできる）も使っている
interface Shape extends Cloneable{
    
    //自分と同じものをコピーして作るメソッド
    Shape clone();

    //図形をかくメソッド
    void draw();
}