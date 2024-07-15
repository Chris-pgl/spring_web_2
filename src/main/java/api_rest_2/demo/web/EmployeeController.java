package api_rest_2.demo.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api_rest_2.demo.entity.Employee;
import api_rest_2.demo.entity.Role;
import api_rest_2.demo.service.EmployeeService;
import api_rest_2.demo.service.RoleService;
import api_rest_2.demo.web.dto.EmployeeDTO;

@RestController
@RequestMapping("/Employee/")
public class EmployeeController {

    @Autowired
    EmployeeService service;

    @Autowired
    RoleService rService;

    //create and add
    @GetMapping("add")
    public ResponseEntity<Void> addEmployee(){

        Role r1 = new Role("Manager");
        Role r2 = new Role("Junior");
        Role r3 = new Role("Senior");

        rService.saveRole(r1);
        rService.saveRole(r2);
        rService.saveRole(r3);

        Employee e1 = new Employee("Gino","Merend",1200,0,r1);
        Employee e2 = new Employee("Luca","Nerv",1300,0,r2);
        Employee e3 = new Employee("Paolo","Bita",1400,0,r3);


        service.save(e1);
        service.save(e2);
        service.save(e3);

        return ResponseEntity.ok().build();
    }


    //Create
    @PostMapping("create")
    public ResponseEntity<Employee> createEmployee(@RequestBody EmployeeDTO dto){
        Employee e = new Employee(dto.getName(),dto.getSurname(),dto.getSalary(),dto.getBonus(),dto.getRole());
        service.save(e);
        return ResponseEntity.ok(e);
    }

    //Read
    @GetMapping("all")
    public ResponseEntity<List<Employee>> getAllEmployee(){
        List<Employee> list = service.getAllEmployees();
        return ResponseEntity.ok().body(list);
    }

    //Update
    @PatchMapping("update/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable int id, @RequestBody EmployeeDTO dto){
        Optional<Employee> optEmp = service.getEmployeeById(id);
        if(optEmp.isEmpty())
            return ResponseEntity.notFound().build();

        Employee emp = optEmp.get();
        emp.update(dto);
        
        service.save(emp);

        return ResponseEntity.ok(emp);
    }


    //Delete
    @GetMapping("delete/{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable int id){
        Optional<Employee> optEmp = service.getEmployeeById(id);
        if(optEmp.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        Employee e = optEmp.get();
        service.delete(e);
        return ResponseEntity.ok("Employee deleted");
    }
}
