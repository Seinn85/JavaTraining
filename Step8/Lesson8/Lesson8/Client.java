package Lesson8;

public class Client{
    public static void main(String[] args){
        //サイズと生地は必須、チーズだけ追加したピザ
        Pizza pizza1 = new Pizza.PizzaBuilder("Medium", "Thin Crust")
                            .addCheese()
                            .build();

        //全てのトッピングを追加したピザ
        Pizza pizza2 = new Pizza.PizzaBuilder("Large", "Thick Crust")
                            .addCheese()
                            .addPepperoni()
                            .addOlives()
                            .build();

        //オプションなし、サイズと生地だけのピザ
        Pizza pizza3 = new Pizza.PizzaBuilder("Small", "Thin Crust")
                            .build();

        //作ったピザの情報を表示する
        System.out.println(pizza1);
        System.out.println(pizza2);
        System.out.println(pizza3);
    }
}