package Lesson7;

class HotDrinkFactory implements DrinkFactory{
    public Coffee createCoffee(){
        return new HotCoffee();
    }

    public Tea createTea(){
        return new HotTea();
    }
}