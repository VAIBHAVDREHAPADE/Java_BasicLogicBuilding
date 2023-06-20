package learn.basics.employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!\n");
            List<EmployeeBean> employee = new ArrayList<>();
        employee.add(new EmployeeBean(50000,"Jonothan",28));
        employee.add(new EmployeeBean(59000,"Marathon",23));
        employee.add(new EmployeeBean(30000,"Milka",28));
        employee.add(new EmployeeBean(6000,"Rasa",21));
        employee.add(new EmployeeBean(81000,"Ashne",27));
        employee.add(new EmployeeBean(50700,"mike",34));
        //salary grether that sort by desc
        System.out.printf("Natural Sorting 1 \n");
        List<EmployeeBean> test1 = employee.stream().filter(salary-> salary.getSalary() > 50000).sorted(Comparator.comparingLong(EmployeeBean::getAge)).collect(Collectors.toList());
    System.out.println(test1);
        System.out.printf("Natural Sorting 2 \n");
        List<EmployeeBean> test2 = employee.stream().filter(salary-> salary.getSalary() > 50000).sorted((o1, o2)->(int)o1.getAge() -o2.getAge()).collect(Collectors.toList());
        System.out.println(test2);
        System.out.printf("Reversed Sorting 1 \n");
        List<EmployeeBean> test3 = employee.stream().filter(salary-> salary.getSalary() > 50000).sorted(Comparator.comparingLong(EmployeeBean::getAge).reversed()).collect(Collectors.toList());
        System.out.println(test3);
        System.out.printf("reversed Sorting 2 \n");
        List<EmployeeBean> test4 = employee.stream().filter(salary-> salary.getSalary() > 50000).sorted((o1, o2)->(int)o2.getAge() -o1.getAge()).collect(Collectors.toList());
        System.out.println(test4);
        //double salary whose name is mike
        Map<Integer, List<EmployeeBean>> test5 = employee.stream().collect(Collectors.groupingBy(EmployeeBean::getSalary));
        System.out.println(test5);

    }
}