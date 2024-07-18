package LAB5;

import java.util.ArrayList;
import java.util.List;

public class EmployeeStorage implements Storage {
    private List<Employee> employees = new ArrayList<>();

    @Override
    public void addEmployee(Employee e) throws EmployeeAlreadyExistsException {
        for (Employee emp : employees) {
            if (emp.getEmpNo() == e.getEmpNo()) {
                throw new EmployeeAlreadyExistsException("Employee with ID " + e.getEmpNo() + " already exists.");
            }
        }
        employees.add(e);
    }

    @Override
    public Employee getEmployee(int empNo) throws EmployeeNotFoundException {
        for (Employee emp : employees) {
            if (emp.getEmpNo() == empNo) {
                return emp;
            }
        }
        throw new EmployeeNotFoundException("Employee with ID " + empNo + " not found.");
    }
}

