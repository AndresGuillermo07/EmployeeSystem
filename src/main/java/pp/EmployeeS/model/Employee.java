package pp.EmployeeS.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEmployee;
    private String name;
    private String departament;
    private Double salary;

    @Override
    public String toString() {
        return
                "\nidEmployee -> " + idEmployee +
                "\nname -> " + name +
                "\ndepartament -> " + departament +
                "\nsalary -> " + salary;
    }
}
