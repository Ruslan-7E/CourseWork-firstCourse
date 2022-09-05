public class Main {

    public Employee[] employees = new Employee[10];
    public static void main(String[] args) {
        // Надо ли заполнять произвольные данные о 10-ти разных сотрудниках. Вроде разобрался.
        Employee employees1 = new Employee("Ivanov Ivan Ivanovich", 1, 102_000);
        Employee employees2 = new Employee("Petrov Peter Petrovich", 1, 111_000);
        Employee employees3 = new Employee("Sidorov Vasiliy Sidorovich", 2, 120_000);
        Employee employees4 = new Employee("Mukhametshin Ruslan Ildarovich", 2, 135_000);
        Employee employees5 = new Employee("Musk Ilon Batkovich", 3, 156_000);
        Employee employees6 = new Employee("Gates Bill Fatherovich", 3, 166_000);
        Employee employees7 = new Employee("Zuckerberg Mark Otzovich", 4, 177_000);
        Employee employees8 = new Employee("Vasilyev Stephen Muratovich", 4, 188_000);
        Employee employees9 = new Employee("Rodnov Vladimir Anatoliyevich", 5, 190_000);
        Employee employees10 = new Employee("Samoylov Sergey Andreevich", 5, 199_000);
    }

    public void addEmployeeToEmployees(Employee employee) {

    }

    // Непонятно, что вообще за переменная-счётчик id, что она из себя представляет???
}