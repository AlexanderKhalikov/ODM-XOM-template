package com;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;

public class Client {
    private String name = "";
    private Integer age = 25;
    private Integer salary = 0;
    private Boolean maried = false;
    private Integer number_of_cars = 0;

    public Client() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Client(String name, Integer age, Integer salary, Boolean maried) {
        super();
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.maried = maried;
    }

    public Client(String name, Integer age, Integer salary, Boolean maried, Integer number_of_cars) {
        super();
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.maried = maried;
        this.number_of_cars = number_of_cars;
    }

    @XmlElement(name = "name", defaultValue = "")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement(name = "age", defaultValue = "0")
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @XmlElement(name = "salary", defaultValue = "0")
    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @XmlElement(name = "maried", defaultValue = "false")
    public Boolean getMaried() {
        return maried;
    }

    public void setMaried(Boolean maried) {
        this.maried = maried;
    }

    @XmlTransient
    public Integer getNumber_of_cars() {
        return number_of_cars;
    }

    public void setNumber_of_cars(Integer number_of_cars) {
        this.number_of_cars = number_of_cars;
    }
}
