package stream.employee;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapEmployee {

    public static void main(String args[]){

        List<Employee> list= Arrays.asList(new Employee("John",21, Arrays.asList("234234","54235435")),
                new Employee("Martin",19), new Employee("Mary",31,Arrays.asList("2334564234","35468679")),
                new Employee("Stephan",18), new Employee("Gary",26,Arrays.asList("33333","354555568679")));

         String phones=  list.stream()
                    .map(Employee::getPhones)
                    .flatMap(e->e.stream())
                    .collect(Collectors.joining(", "));

         System.out.println(phones);

    }
}
