package Lesson13;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("タロウ", 300000); // 名前と初期給与を設定
        Manager manager = new Manager(); // マネージャークラスのオブジェクトを作成

        // 現在の給与を表示
        System.out.println("現在の給与: " + employee.getSalary() + "円");

        // マネージャーが給与を変更
        manager.updateSalary(employee, 350000);

        // 変更後の給与を表示
        System.out.println("変更後の給与: " + employee.getSalary() + "円");
    }
}