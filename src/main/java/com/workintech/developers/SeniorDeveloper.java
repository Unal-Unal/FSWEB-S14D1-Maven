package com.workintech.developers;

public class SeniorDeveloper extends Employee {
    public SeniorDeveloper(long id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("Senior Developer " + getName() + " is designing architecture...");
        setSalary(getSalary() + 2000); // Maaş artışı
    }
}