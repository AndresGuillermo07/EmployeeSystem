package pp.EmployeeS.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pp.EmployeeS.model.Employee;
import pp.EmployeeS.repository.EmployeeRepository;

import java.util.List;
@Service
public class EmployeeService implements IEmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmplopyees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(Integer idEmployee) {
        return employeeRepository.findById(idEmployee).orElse(null);
    }

    @Override
    public void saveEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployee(Employee employee) {
        employeeRepository.delete(employee);;
    }
}
