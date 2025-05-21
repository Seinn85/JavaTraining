public class Person {
    //
    private int age;

    public Person(int age){
        if (age < 0){
            System.out.println("年齢は0以上を指定してください");
            this.age = 0;
        }else{
            this.age = age;
        }
    }
    
    public void showAge() {
        System.out.println("この人の年齢は" + age + "歳です。");
    }
}