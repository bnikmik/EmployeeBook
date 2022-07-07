public class Main {
    private static final Employee[] emps = new Employee[10];
    public static void printAllEmployees() {
        System.out.println("Список всех сотрудников:");
        for (Employee emp : emps) {
            System.out.println(emp);
        }
    }
    public static void sumSalaries() {
        double sumSalaries = 0;
        for (Employee emp : emps) {
            sumSalaries = emp.getSalary() + sumSalaries;
        }
        double aveSalary = sumSalaries / emps.length;
        System.out.println("Сумма всех зарплат: " + sumSalaries);
        System.out.println("Средняя зарплата:" + aveSalary);
    }
    public static void checkMinSalary () {
        Employee min = null;
        for (Employee emp : emps) {
            if (min == null || emp.getSalary() < min.getSalary() ) {
                min = emp;
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой:" + min);
    }
    public static void checkMaxSalary () {
        Employee max = null;
        for (Employee emp : emps) {
            if (max == null || emp.getSalary() > max.getSalary() ) {
                max = emp;
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой:" + max);
    }
    public static void main(String[] args) {
        emps[0] = new Employee("Егоров Дмитрий Кириллович","1",150_000);
        emps[1] = new Employee("Осипова Александра Львовна","2",60_000);
        emps[2] = new Employee("Прокофьева Амира Макаровна","3",70_000);
        emps[3] = new Employee("Трофимов Лев Дмитриевич","4",80_000);
        emps[4] = new Employee("Данилов Иван Маркович","5",90_000);
        emps[5] = new Employee("Никитин Максим Кириллович","1",55_000);
        emps[6] = new Employee("Марков Владимир Захарович","2",65_000);
        emps[7] = new Employee("Кузин Кирилл Алексеевич","3",275_000);
        emps[8] = new Employee("Медведева Елизавета Романовна","4",45_000);
        emps[9] = new Employee("Ефремов Константин Фёдорович","5",195_000);
        printAllEmployees();
        sumSalaries();
        checkMinSalary();
        checkMaxSalary();
    }
}