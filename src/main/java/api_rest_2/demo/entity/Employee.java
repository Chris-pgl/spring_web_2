package api_rest_2.demo.entity;

import api_rest_2.demo.web.dto.EmployeeDTO;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    int id;

    @Column(nullable= false, length=65)
    String name;

    @Column(nullable= false, length=65)
    String surname;

    @Column(nullable= false)
    int salary;

    @Column(nullable= true)
    int bonus;
    
    public Employee() {
    }

    public Employee(String name, String surname, int salary, int bonus) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.bonus = bonus;
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", surname=" + surname + ", salary=" + salary + ", bonus="
                + bonus + "]";
    }

    
    public void update(EmployeeDTO dto){
        setName(dto.getName());
        setSurname(dto.getSurname());
        setSalary(dto.getSalary());
        setBonus(dto.getBonus());
    }

    

}
