package Lesson9;

class Rectangle implements Shape{
    private String name;
    private String color;

    public Rectangle(String name, String color){
        this.name = name;
        this.color = color;
    }

    @Override
    public Shape clone(){
        return new Rectangle(this.name, this.color);
    }

    @Override
    public void draw(){
        System.out.println("Drawing Rectangle [name=" + name + ", color=" + color + "]");
    }
}