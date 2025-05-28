package Lesson5;

public class AnimalFactory{
    public static Animal createAnimal(String type){
        type = type.toLowerCase();

        switch (type){
            case "dog":
                return new Dog();
            case "cat":
                return new Cat();
            case "bird":
                return new Bird();
            default:
                return null;
        }
    }
}