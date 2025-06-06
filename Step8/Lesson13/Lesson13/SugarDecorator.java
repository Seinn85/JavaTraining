package Lesson13;

public class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " + Sugar";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 0.20; // 砂糖の追加価格
    }
}