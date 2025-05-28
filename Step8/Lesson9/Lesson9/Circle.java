package Lesson9;

class Circle implements Shape{
    private String name;
    private String color;

    public Circle(String name, String color){
        this.name = name;
        this.color = color;
    }

    @Override
    public Shape clone(){
        return new Circle(this.name, this.color);
    }

    @Override
    public void draw(){
        System.out.println("Drawing Circle [name=" + name + ", color=" + color + "]");
    }
}