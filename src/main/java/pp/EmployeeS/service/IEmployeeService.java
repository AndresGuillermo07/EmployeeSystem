package pp.EmployeeS.service;

import pp.EmployeeS.model.Employee;

import java.util.*;

public interface IEmployeeService {

    public List<Employee> getAllEmplopyees();

    public Employee getEmployeeById(Integer idEmployee);

    public void saveEmployee(Employee employee);

    public void deleteEmployee(Employee employee);

}
