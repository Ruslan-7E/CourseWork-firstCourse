public class Employee {
    private String name;
    private String surname;
    private String patronymic;
    private int department;
    private double salary;
    private int id; // не понятно, что с этим делать, нужен ли геттер для этого поля

    public Employee(String name, String surname, String patronymic, int department, double salary) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

