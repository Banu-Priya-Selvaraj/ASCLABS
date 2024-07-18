package LAB5;

public interface Storage {
    void addEmployee(Employee e) throws EmployeeAlreadyExistsException;
        Employee getEmployee(int empno) throws EmployeeNotFoundException;

}

