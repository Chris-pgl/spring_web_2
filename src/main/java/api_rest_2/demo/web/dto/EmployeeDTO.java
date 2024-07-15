package api_rest_2.demo.web.dto;

public class EmployeeDTO {

    String name;
    String surname;
    int salary;
    int bonus;

    

    public EmployeeDTO() {
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
        return "EmployeeDTO [name=" + name + ", surname=" + surname + ", salary=" + salary + ", bonus=" + bonus + "]";
    }

    
    
}
