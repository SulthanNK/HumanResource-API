package humanresource_api;

public class HRApp {
    public static void main(String[] args) {
        System.out.println("API starts running...");

        Employee EmployeeOne = new Employee(574839, "John Henry", 523378.36);
        Employee EmployeeTwo = new Employee(574632, "Andrew Mark", 534378.36);

        Department eduDept = new Department("Education");

        eduDept.addEmployee(EmployeeOne);
        eduDept.addEmployee(EmployeeTwo);
        eduDept.addEmployee(new Employee(574923, "Elizabeth Fillips", 497856.67));

        Employee[] employeeArray = eduDept.getEmployees();

        for (Employee employee : employeeArray) {
            System.out.println(employee);
        }
        System.out.println("\nTotal Salary: " + eduDept.getTotalSalary());
        System.out.println("Average Salary: " + eduDept.getAverageSalary());
        System.out.println("Random Employee: \n" + eduDept.getEmployeeID(574632));
    }
}
