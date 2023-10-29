package Generics;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Employee {
    private int id;
    private String name;
    private double salary;
    private String department;

    public Employee(int id, String name, double salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
    }


 }

class HashSetGenerics<T extends Employee> {
    
	Set<T> elements = new HashSet<>();

    public void add(T element) {
         elements.add(element);
    }

    public void show() {
        for (T element : elements) {
            ((Employee)element).displayDetails();
        }
    }
}


public class HashSetProblem {
    public static void main(String[] args) {
    	
        HashSetGenerics<Employee> emp = new HashSetGenerics<>();

         
        emp.add(new Employee(901, "pranati", 40000.0, "Marketing"));
        emp.add(new Employee(23, "rita", 60000.0, "HR"));
        emp.add(new Employee(56, "ritam", 41000.0, "Finance"));
        emp.add(new Employee(84, "riya", 28000.0, "IT"));
        

        emp.show();
        
       
    }
}
