package learn.basics.employee;

public class EmployeeBean {
    int salary;
    String Name;
    int age;

    public EmployeeBean(int salary, String name, int age) {
        this.salary = salary;
        Name = name;
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "learn.basics.employee.EmployeeBean{" +
                "salary=" + salary +
                ", Name='" + Name + '\'' +
                ", age=" + age +
                '}';
    }
}
