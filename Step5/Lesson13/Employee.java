package Lesson13;

public class Employee {
    private String name;
    private double salary;

    //コンストラクタ（名前と初期給与を設定）
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    //給与を取得するgetterメソッド（誰でも使える）
    public double getSalary() {
        return salary;
    }

    //給与を変更するsetterメソッド
    private void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("給与は0以上の値を設定してください");
        }
    }

    //Managerクラスが給与を変更できるようにこのメソッドを用意
    void changeSalary(double salary) {
        setSalary(salary);
    }
}