import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Employee storage[] = new Employee[10];
        storage[0] = new Employee("Иванов В.И.",1,45_000);
        storage[1] = new Employee("Рязанов Г.В.", 1, 49_000);
        storage[2] = new Employee("Смирнов В.В.", 2, 55_000);
        storage[3] = new Employee("Кирьянова С.И.", 2, 45_000);
        storage[4] = new Employee("Романов А.Ф.", 3, 55_000);
        storage[5] = new Employee("Ложкин И.В.", 3, 60_000);
        storage[6] = new Employee("Максимов А.А.", 4, 50_000);
        storage[7] = new Employee("Алексеев И.А.", 4, 60_000);
        storage[8] = new Employee("Васильева Т.И.", 5, 63_000);
        storage[9] = new Employee("Никитин Ф.А.", 5, 44_000);

        System.out.println(storage[0]);
        System.out.println(storage[1]);
        System.out.println(storage[2]);
        System.out.println(storage[3]);
        System.out.println(storage[4]);
        System.out.println(storage[5]);
        System.out.println(storage[6]);
        System.out.println(storage[7]);
        System.out.println(storage[8]);
        System.out.println(storage[9]);

        System.out.println();
        Employee.sumSalary(storage);

        System.out.println();
        Employee.мaximalSalary(storage);

        System.out.println();
        Employee.minimalSalary(storage);

        System.out.println();
        Employee.averageSum(storage);

        System.out.println();
        Employee.fullNameAll(storage);

        System.out.println();
        Employee.salaryIndexation(storage);
    }

}