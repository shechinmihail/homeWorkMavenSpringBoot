package com.skypro.homework.model;

public class Employee {
    private final String firtname;
    private final String lostname;
    private final int departament;
    private final int salary;
    private static int counter = 1;
    private final int id;

    public Employee(String firtname, String lostname, int departament, int salary) {
        this.firtname = firtname;
        this.lostname = lostname;
        this.departament = departament;
        this.salary = salary;
        this.id = counter++;
    }

    public String getFirtname() {
        return firtname;
    }

    public String getLostname() {
        return lostname;
    }

    public int getDepartament() {
        return departament;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firtname='" + firtname + '\'' +
                ", lostname='" + lostname + '\'' +
                ", departament=" + departament +
                ", salary=" + salary +
                ", id=" + id +
                '}';
    }
}
