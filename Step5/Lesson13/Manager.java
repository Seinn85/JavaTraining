package Lesson13;

public class Manager {

    //ManagerクラスだけがEmployeeの給与を更新できる
    public void updateSalary(Employee employee, double newSalary) {
        //EmployeeのchangeSalaryメソッドを呼ぶ
        employee.changeSalary(newSalary);
    }
}