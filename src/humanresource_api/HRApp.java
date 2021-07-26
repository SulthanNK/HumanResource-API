package humanresource_api;

public class HRApp {
    public static void main(String[] args) {
        System.out.println("API starts running...");

        Employee EmployeeOne = new Employee(574839,"John Henry", 523378.36);
        Employee EmployeeTwo = new Employee(574632,"Andrew Mark", 534378.36);
        System.out.println(EmployeeOne);
        System.out.println(EmployeeTwo);
    }
}
