public class PermanentEmployee extends Employee{
    String employeeType;

    public PermanentEmployee(String name, Integer age, Integer idEmployee, Double salary, String employeeType){
        super(name, age, idEmployee, salary);
        this.employeeType = employeeType;   
    }

    @Override
    public String getEmployeeType(){
        return employeeType;
    }
    public void setEmployeeType(String employeeType){
        this.employeeType = employeeType;
    }
}
