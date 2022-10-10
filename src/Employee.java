import java.util.Objects;

public class Employee {
    private final String fullName; // Ф.И.О.
    private int department;// Отделы
    private int employeeSalary; // Зарплата сотрудника
    private int counter = 0; // Счетчик
    private final int id; // Идентификатор

    public Employee(String fullName, int department, int employeeSalary) {
        this.fullName = fullName;
        this.department = department;
        this.employeeSalary = employeeSalary;
        this.id = counter++;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public double getEmployeeSalary() {

        return employeeSalary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setEmployeeSalary(int employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    // Базовая сложность

    public static void sumSalary(Employee[] storage) { // Посчитать сумму затрат на зарплаты в месяц.
        int sum = 0;
        for (Employee employeeSalary : storage) {
            if (employeeSalary != null);
            sum += Objects.requireNonNull(employeeSalary).getEmployeeSalary();
        }
        System.out.println("Сумма затрат на зарплаты в месяц - " + sum + " рублей");
    }

    public static void мaximalSalary(Employee[] storage) { // Найти сотрудника с максимальной зарплатой.
        double maxSalary = storage[0].getEmployeeSalary();
        String fullNameEmployee = storage[0].getFullName();
        for (Employee employeeSalary : storage) {
            if (employeeSalary.getEmployeeSalary() > maxSalary && employeeSalary != null) {
                maxSalary = employeeSalary.getEmployeeSalary();
                fullNameEmployee = employeeSalary.getFullName();
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой - " + fullNameEmployee);
    }
    public static void minimalSalary(Employee[] storage) { // Найти сотрудника с минимальной зарплатой.
        double minSalary = storage[0].getEmployeeSalary();
        String fullNameEmployee = storage[0].getFullName();
        for (Employee employeeSalary : storage) {
            if (employeeSalary.getEmployeeSalary() < minSalary && employeeSalary != null) {
                minSalary = employeeSalary.getEmployeeSalary();
                fullNameEmployee = employeeSalary.getFullName();

            }
        }
        System.out.println("Сотрудник с минимальной зарплатой - " + fullNameEmployee);
    }

    public static void averageSum(Employee[] storage) { // Подсчитать среднее значение зарплат
        double averageAmount = 0;
        for (Employee employeeSalary : storage) {
            if (employeeSalary != null) {
                averageAmount += employeeSalary.getEmployeeSalary();
            }
        }
        System.out.println("Среднее значение зарплат - " + averageAmount/storage.length + " рублей");
    }

    public static void fullNameAll(Employee[] storage) { // Получить Ф. И. О. всех сотрудников
        for (Employee fullName : storage) {
            if (fullName != null); {
                System.out.println(Objects.requireNonNull(fullName).getFullName());
            }
        }
    }

    // Повышенная сложность

}
