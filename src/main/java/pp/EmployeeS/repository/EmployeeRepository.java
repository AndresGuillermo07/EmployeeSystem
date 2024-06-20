package pp.EmployeeS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pp.EmployeeS.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
