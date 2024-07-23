public class Employee extends Person {
    Integer idEmployee;
    Double salary;
    
    public Employee(String name, Integer age, Integer idEmployee, Double salary){
        super(name, age);
        this.idEmployee = idEmployee;
        this.salary = salary;
    }

    public Integer getIdEmployee(){
        return idEmployee;
    }
    public void setIdEmployee(Integer idEmployee){
        this.idEmployee = idEmployee;
    }

    public Double getSalary(){
        return salary;
    }
    public void setSalary(Double salary){
        this.salary = salary;
    }

    public String getEmployeeType(){
        return null;
    }
}