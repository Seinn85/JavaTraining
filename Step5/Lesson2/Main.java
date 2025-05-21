public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.showSpeed(); // 初期速度を表示
        myCar.accelerate(); // 加速
        myCar.showSpeed(); // 加速後の速度を表示
        myCar.brake(); // 減速
        myCar.showSpeed(); // 減速後の速度を表示
    }
}