//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Employee employee = new Employee("1234567890" , "Ahmad" , 5000);
        System.out.println("Employee name: "+employee.getName());
        System.out.println("Employee current salary: "+employee.getSalary());
        employee.setSalary(6000);
        System.out.println(employee.toString());
        System.out.println("Employee Annual salary: "+employee.getAnnualSalary());
        System.out.println("New salary after raised : "+ employee.raisedSalary(10));

    }
}