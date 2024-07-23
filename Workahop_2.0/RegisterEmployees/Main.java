public class Main {
    public static void main(String[] args) {
        
        ManagementEmployees employeesList = new ManagementEmployees();

        var empleado1 = new TemporaryEmployee("Saul", 97, 0, 5000.0, "Empleado temporal");
        var empleado2 = new PermanentEmployee("Esau", 28, 1, 4500.0, "Empleado permanente");

        employeesList.addEmployee(empleado1);
        employeesList.addEmployee(empleado2);

        var listEmployees = employeesList.obtainEmployees();
        for (var employee : listEmployees) {
            System.out.println("ID: " + employee.getIdEmployee() + ", Nombre: " + employee.getName() + ", Edad: $" + employee.getAge() + ", Salario: " + employee.getSalary() + ", Tipo de empleado: " + employee.getEmployeeType());
        }

        employeesList.removeEmployee(empleado2);

        listEmployees = employeesList.obtainEmployees();
        for (var employee : listEmployees) {
            System.out.println("ID: " + employee.getIdEmployee() + ", Nombre: " + employee.getName() + ", Edad: $" + employee.getAge() + ", Salario: " + employee.getSalary() + ", Tipo de empleado: " + employee.getEmployeeType());
        }
    }
}
