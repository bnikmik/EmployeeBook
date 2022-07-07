public class Employee {
    private final String fullname;
    private String department;
    private int salary;
    public static int id = 0;

    public Employee(String fullname, String department, int salary) {
        this.fullname = fullname;
        this.department = department;
        this.salary = salary;
        id++;
    }

    public static int getId() {
        return id;
    }

    public String getFullname() {
        return fullname;
    }

    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "ФИО: " + fullname + ". Отдел:" + department + ". Заработная плата:" +  salary;
    }
}
