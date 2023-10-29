package collectionsFramework;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

class Employee implements Comparable<Employee>{
	String id;
	String name;
	String dept;
	int salary;
	
	public Employee(String id, String name, String dept, int salary) {
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
	
	public String getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDept() {
		return dept;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public String toString() {
		return id+" "+name+" "+dept+" "+salary;
	}
	
	public int compareTo(Employee other) {
		return this.name.compareTo(other.name);
	}
	
	
}

public class Details {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Employee> emp = new TreeSet<>();
		
		emp.add(new Employee("ab01", "riya", "HR", 50000));
        emp.add(new Employee("hd78", "avik", "IT", 60000));
        emp.add(new Employee("js77", "neha", "Sales", 55000));
        emp.add(new Employee("dy56", "aniket", "Finance", 65000));
        emp.add(new Employee("bh34", "nayan", "Marketing", 52000));
        emp.add(new Employee("ni55", "rita", "IT", 62000));
        emp.add(new Employee("pj90", "sunita", "Finance", 70000));
        emp.add(new Employee("tr22", "harsh", "Sales", 56000));
        emp.add(new Employee("vb16", "jaya", "HR", 51000));
        emp.add(new Employee("qe10", "priya", "Marketing", 53000));

        Scanner sc = new Scanner(System.in);
        System.out.println("a)	ID\n"
        		+ "b)	Name\n"
        		+ "c)	Department\n"
        		+ "d)	Salary\n"
        		+ "");
        String choice = sc.nextLine();
        switch(choice) {
        case "a":
        	System.out.println("sorted by ID");
        	TreeSet<Employee> empId = new TreeSet<>(Comparator.comparing(Employee::getId));
        	empId.addAll(emp);
        	for(Employee e:empId) {
        		System.out.println(e);
        	}
        	break;
        case "b":
        	System.out.println("sorted by name");
        	for(Employee e: emp) {
        		System.out.println(e);
        	}
        	break;
        case "c":
        	System.out.println("sorted by department");
        	TreeSet<Employee> empDept = new TreeSet<>(Comparator.comparing(Employee::getDept));
        	empDept.addAll(emp);
        	for(Employee e:empDept) {
        		System.out.println(e);
        	}
        	
        	break;
        case "d":
        	TreeSet<Employee> empSal = new TreeSet<>(Comparator.comparing(Employee::getSalary));
        	empSal.addAll(emp);
        	for(Employee e: empSal) {
        		System.out.println(e);
        	}
        	break;
        default:
        	System.out.println("wrong choice");
	}
	}
}
