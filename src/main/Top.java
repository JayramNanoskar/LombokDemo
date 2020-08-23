package main;

import model.Employee;

public class Top {

	public static void main(String[] args) {
		Employee e = new Employee();
		System.out.println("Lombok Demo");
		e.setName("John");
		System.out.println(e.getName());
		System.out.println(e);

	}

}
