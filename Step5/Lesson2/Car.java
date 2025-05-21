public class Car {

    //属性を作成、速度の初期値は0にする
    private int speed = 0;

    //現在の速度を表示するメソッド
    public void showSpeed(){
        System.out.println("現在の速度: " + speed + " km/h");
    }

    //加速メソッド
    public void accelerate(){
        speed += 10;
    }

    //減速メソッド
    public void brake(){
        if (speed >= 10) {
            speed -= 10;
        } else {
            speed = 0;
        }
    }
}