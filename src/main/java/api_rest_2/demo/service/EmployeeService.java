package api_rest_2.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import api_rest_2.demo.entity.Employee;
import api_rest_2.demo.repo.EmployeeRepo;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepo repo;

    public List<Employee> getAllEmployees(){
        return repo.findAll();
    }

    public Optional<Employee> getEmployeeById(int id){
        return repo.findById(id);
    }

    public void save(Employee e){
        repo.save(e);
    }

    public void delete(Employee e){
        repo.delete(e);
    }

    
    
}
