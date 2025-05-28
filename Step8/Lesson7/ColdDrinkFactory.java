//冷たい飲みものを作る工場のクラス
class ColdDrinkFactory implements DrinkFactory{

    //アイスコーヒーを作る
    public Coffee createCoffee() {
        return new IcedCoffee();
    }

    //アイスティーを作る
    public Tea createTea() {
        return new IcedTea();
    }
}
