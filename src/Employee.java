import java.util.Objects;

public class Employee {
    private final String fullName; // Ф.И.О.
    public int department;// Отделы
    int employeeSalary; // Зарплата сотрудника
    private static int counter = 0; // Счетчик
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

    @Override
    public String toString() {
        return "Данные: " +
                "Ф.И.О. - " + fullName +
                ", Отдел - " + department +
                ", Зарплата - " + employeeSalary +
                ", Идентификатор - " + id;
    }

    public static void sumSalary(Employee[] storage) {
        int sum = 0;
        for (Employee employeeSalary : storage) {
            sum += employeeSalary.getEmployeeSalary();
        }
        System.out.println("Сумма затрат на зарплаты в месяц - " + sum + " рублей");
    }

    public static void мaximalSalary(Employee[] storage) {
        double maxSalary = storage[0].getEmployeeSalary();
        String fullNameEmployee = storage[0].getFullName();
        for (Employee employeeSalary : storage) {
            if (employeeSalary.getEmployeeSalary() > maxSalary) {
                maxSalary = employeeSalary.getEmployeeSalary();
                fullNameEmployee = employeeSalary.getFullName();
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой - " + fullNameEmployee);
    }
    public static void minimalSalary(Employee[] storage) {
        double minSalary = storage[0].getEmployeeSalary();
        String fullNameEmployee = storage[0].getFullName();
        for (Employee employeeSalary : storage) {
            if (employeeSalary.getEmployeeSalary() < minSalary) {
                minSalary = employeeSalary.getEmployeeSalary();
                fullNameEmployee = employeeSalary.getFullName();
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой - " + fullNameEmployee);
    }

    public static void averageSum(Employee[] storage) {
        double averageAmount = 0;
        for (Employee employeeSalary : storage) {
            averageAmount += employeeSalary.getEmployeeSalary();
        }
        System.out.println("Среднее значение зарплат - " + averageAmount/storage.length + " рублей");
    }

    public static void fullNameAll(Employee[] storage) {
        for (Employee fullName : storage) {
            if (fullName != null); {
                System.out.println(Objects.requireNonNull(fullName).getFullName());
            }
        }
    }

}















