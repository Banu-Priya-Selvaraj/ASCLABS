package LAB5;

public class Mainf {
    public static void main(String[] args) {
        Storage storage = new EmployeeStorage();

        try {
            Employee emp1 = new Employee(1, "John Doe");
            Employee emp2 = new Employee(2, "Jane Doe");

            storage.addEmployee(emp1);
            storage.addEmployee(emp2);

            System.out.println("Employee added: " + storage.getEmployee(1).getName());
            System.out.println("Employee added: " + storage.getEmployee(2).getName());

            // Trying to add an employee with an existing ID
            Employee emp3 = new Employee(1, "Jim Doe");
            storage.addEmployee(emp3);
        } catch (EmployeeAlreadyExistsException | EmployeeNotFoundException e) {
            System.err.println("Error: " + e.getMessage());
        }

        try {
            // Trying to get an employee that does not exist
            System.out.println(storage.getEmployee(1).getName());
        } catch (EmployeeNotFoundException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}

