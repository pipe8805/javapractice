package stream.employee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupEmployee {

    public static void main(String args[]){
        List<Employee> list= Arrays.asList(new Employee("Stephan",21),
                new Employee("Gary",19), new Employee("Mary",31),
                new Employee("Stephan",18), new Employee("Gary",26));


       Map<String,List<Employee>> names= list.stream()
                .collect(Collectors.groupingBy(Employee::getName));
        names.forEach((name,employeeListTemp)->System.out.println("Name: "+name+" ==>"+employeeListTemp));
    }
}
