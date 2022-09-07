public class Main {

    private static final Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        // Надо ли заполнять произвольные данные всех 10-ти сотрудников.
        Employee employees1 = new Employee("Ivanov Ivan Ivanovich", 1, 102_000);
        Employee employees2 = new Employee("Petrov Peter Petrovich", 4, 111_000);
        Employee employees3 = new Employee("Sidorov Vasiliy Sidorovich", 2, 120_000);
        Employee employees4 = new Employee("Musk Ilon Batkovich", 3, 156_000);

        System.out.println(employees1);

        Employee employees5 = addEmployeeToEmployees("Name Surname Patronymic", 5, 160_000, 1);

        System.out.println(employees5);

        findMinSalary();

    }

    private static Employee addEmployeeToEmployees(String fullName, int department, double salary, int id) {
        Employee employees5 = new Employee("Name Surname Patronymic", 5, 160_000);
        employees[id++] = employees5;
        return employees5;
    }

    private static void findMinSalary() {
        double minSalary = 200_000;
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
            }
        }
    }


}