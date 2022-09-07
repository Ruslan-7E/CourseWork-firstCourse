public class Main {

    private static final Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        // Надо ли заполнять произвольные данные о 10-ти разных сотрудниках. Вроде разобрался.
        Employee employees1 = new Employee("Ivanov Ivan Ivanovich", 1, 102_000);
        Employee employees2 = new Employee("Petrov Peter Petrovich", 4, 111_000);
        Employee employees3 = new Employee("Sidorov Vasiliy Sidorovich", 2, 120_000);
        Employee employees4 = new Employee("Musk Ilon Batkovich", 3, 156_000);

        printAllEmployees(employees);
    }

    public static void addEmployeeToEmployees(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {

        }
    }

    public static void printAllEmployees(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            System.out.println(employee.getFullName() + ": department # is " + employee.getDepartment() + " salary is " + employee.getSalary());
        }
    }
}