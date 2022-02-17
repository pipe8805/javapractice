package stream.employee;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEmployee {

    public static void main(String args[]){
        List<Employee> list= Arrays.asList(new Employee("John",21),
                new Employee("Martin",19), new Employee("Mary",31),
                new Employee("Stephan",18), new Employee("Gary",26));

        List<String> employeeFilt=
                list.stream()
                .filter(employee -> employee.getAge()>20)
                .map(Employee::getName)
                .collect(Collectors.toList());

        long count=
                list.stream()
                .filter(employee -> employee.getAge()>25)
                .count();
        System.out.println(count);
        employeeFilt.forEach(name->System.out.println(name));
    }
}

