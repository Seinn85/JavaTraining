public class Dog {

    //名前と年齢 属性は private にする
    private String name;
    private int age;

    //コンストラクタ：名前と年齢を設定
    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    //名前と年齢を表示するメソッド
    public void showInfo(){
        System.out.println("名前: " + name);
        System.out.println("年齢: " + age);
    }
    
    //必要ならゲッターやセッターを追加する
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }
}