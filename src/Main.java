public class Main {

    private static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        // Заполняем произвольные данные всех 10-ти сотрудников.
        employees[0] = new Employee("Ivanov Ivan Ivanovich", 1, 102_000);
        employees[1] = new Employee("Petrov Peter Petrovich", 1, 111_000);
        employees[2] = new Employee("Sidorov Vasiliy Sidorovich", 2, 120_000);
//        employees[3] = new Employee("Mukhametshin Ruslan Ildarovich", 2, 136_000);
        employees[4] = new Employee("Vasiliyev Vasiliy Vasiliyevich", 3, 150_000);
        employees[5] = new Employee("Bezos Jeffrey Amazonovich", 3, 156_000);
        employees[6] = new Employee("Pupkin Fedor Andreevich", 4, 166_000);
        employees[7] = new Employee("Guido van Rossum", 4, 177_000);
        employees[8] = new Employee("Gates Bill Microsoftovich", 5, 196_000);
        employees[9] = new Employee("Musk Ilon Batkovich", 5, 199_000);

        // находим сотрудника с мин ЗП
        Employee minSalaryEmployee = findMinSalary();
        System.out.println(minSalaryEmployee);

        // находим сотрудника с макс ЗП
        Employee maxSalaryEmployee = findMaxSalary();
        System.out.println(maxSalaryEmployee);

        System.out.println();

        // находим среднее значение ЗП
        double averageSalaryAmount = findAverageSalary();
        System.out.println("Среднее значение зарплат: " + averageSalaryAmount);

        // находим сумму затрат на ЗП в месяц
        double monthSalarySum = findSalarySum();
        System.out.println("Сумма затрат на ЗП за месяц: " + monthSalarySum);

        System.out.println();

        // печатаем список имен всех сотрудников
        printListOfEmployees();

        System.out.println();

        // печатаем полную инфо (текущую) о сотрудниках
        printFullInfo();

        System.out.println();

        // добавляем нового сотрудника в массив
        addNewEmployee(new Employee("Mukhametshin Ruslan Ildarovich", 2, 136_000));

        // печатаем обновленную инфо о сотрудниках
        printFullInfo();
    }

    private static Employee findMinSalary() {
        double minSalary = employees[0].getSalary();
        Employee employee = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() < minSalary) {
                minSalary = employees[i].getSalary();
                employee = employees[i];
            }
        }
        return employee;
    }

    private static Employee findMaxSalary() {
        double maxSalary = employees[0].getSalary();
        Employee employee = null;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() > maxSalary) {
                maxSalary = employees[i].getSalary();
                employee = employees[i];
            }
        }
        return employee;
    }

    private static double findAverageSalary() {
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                sum += employees[i].getSalary();
            }
        }
        return sum / employees.length;
    }

    private static double findSalarySum() {
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                sum += employees[i].getSalary();
            }
        }
        return sum;
    }

    private static void printListOfEmployees() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i].getFullName());
            }
        }
    }

    private static void printFullInfo() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }

    private static void addNewEmployee(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                break;
            }
        }
    }
}