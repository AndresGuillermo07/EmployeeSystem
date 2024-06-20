package pp.EmployeeS.controller;

import jakarta.servlet.http.HttpServletRequest;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import pp.EmployeeS.model.Employee;
import pp.EmployeeS.service.EmployeeService;

import java.util.List;


@Controller
public class IndexController {

    private static final Logger logger = LoggerFactory.getLogger(IndexController.class);

    @Autowired
    EmployeeService employeeService;
    @GetMapping("/")
    public String start(ModelMap model){
        List<Employee> employees = employeeService.getAllEmplopyees();
        employees.forEach((employee) -> logger.info(employee.toString()));

        model.put("employees",employees);
        return "index";
    }
    @GetMapping("/addEmployee")
    public String showAdd(ModelMap model){
        return "addEmployee";
    }

    @PostMapping("/save")
    public String addEmployee(@ModelAttribute("employeeForm") Employee employee){
        employeeService.saveEmployee(employee);
        return "redirect:/";
    }

    @GetMapping("/edit")
    public String showEdit(@RequestParam int idEmployee, ModelMap model){
        Employee employee = employeeService.getEmployeeById(idEmployee);
        model.put("employee",employee);
        return "editEmployee";
    }

    @GetMapping("/delete")
    public String deleteEmployee(@RequestParam int idEmployee){
        Employee employee = new Employee();
        employee.setIdEmployee(idEmployee);
        employeeService.deleteEmployee(employee);
        return "redirect:/";
    }

}
