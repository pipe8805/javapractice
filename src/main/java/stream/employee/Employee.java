package stream.employee;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    public Employee(String name, Integer age) {
        this.name = name;
        this.age = age;
    }


    public Employee(String name, Integer age, List<String> phones) {
        this.name = name;
        this.age = age;
        this.phones = phones;
    }

    private String name;
    private Integer age;


    private List<String> phones;

    public List<String> getPhones() {
        if(phones==null){
            phones=new ArrayList<>();
        }
        return phones;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
