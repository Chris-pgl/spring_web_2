package api_rest_2.demo.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Role {
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    int id;

    
    String name;

    @OneToMany(mappedBy= "role")
    @JsonIgnore
    List<Employee> employees;

    public Role(){

    }

    

    public Role(String name) {
        this.name = name;
        
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Employee> addEmployee(Employee e){
        employees.add(e);
        return employees;
    }



    public Role(int id, String name, List<Employee> employees) {
        this.id = id;
        this.name = name;
        this.employees = employees;
    }

    
}
