public class Main {

    private static final Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        // Надо ли заполнять произвольные данные всех 10-ти сотрудников. Заполнил.
        Employee employees1 = new Employee("Ivanov Ivan Ivanovich", 1, 102_000);
        Employee employees2 = new Employee("Petrov Peter Petrovich", 1, 111_000);
        Employee employees3 = new Employee("Sidorov Vasiliy Sidorovich", 2, 120_000);
        Employee employees4 = new Employee("Mukhametshin Ruslan Ildarovich", 2, 136_000);
        Employee employees5 = new Employee("Vasiliyev Vasiliy Vasiliyevich", 3, 150_000);
        Employee employees6 = new Employee("Bezos Jeffrey Amazonovich", 3, 156_000);
        Employee employees7 = new Employee("Pupkin Fedor Anreevich", 4, 166_000);
        Employee employees8 = new Employee("Guido van Rossum", 4, 177_000);
        Employee employees9 = new Employee("Gates Bill Microsoftovich", 5, 196_000);
        Employee employees10 = new Employee("Musk Ilon Batkovich", 5, 199_000);

        System.out.println(employees1);

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