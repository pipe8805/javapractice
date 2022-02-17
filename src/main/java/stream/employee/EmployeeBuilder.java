package stream.employee;

public class EmployeeBuilder {

    private String name;
    private Integer age;

    public EmployeeBuilder withName(String name) {

        this.name = name;
        return this;
    }

    public EmployeeBuilder withAge(String name) {

        this.age = age;
        return this;
    }

    public EmployeeBuilder withAge(Integer age) {

        this.age = age;
        return this;
    }

    public Employee build(){
        Employee employee=new Employee(this.name,this.age);
        return employee;
    }
}
