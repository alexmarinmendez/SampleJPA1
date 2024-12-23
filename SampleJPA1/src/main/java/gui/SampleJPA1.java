package gui;

import model.Employees;
import persistence.EmployeesController;

public class SampleJPA1 {

	public static void main(String[] args) {
		EmployeesController operaciones = new EmployeesController();
		
		//getAll
		for (Employees e: operaciones.getAll()) {
			System.out.println(e);
		}
		
		//getById
		System.out.println(operaciones.getById(10008));
		
		//create
		Employees emp = new Employees(1, "1977-05-21", "Alex", "Marin Mendez", 'M', "2024-05-22");
		operaciones.create(emp);
		System.out.println(operaciones.getById(1));
		
		//update
		Employees e = new Employees(1, "1977-05-21", "Alex", "Marin Mendez", 'M', "2025-01-06");
		operaciones.update(e);
		System.out.println(operaciones.getById(1));
		
		//delete
		operaciones.delete(1);
		System.out.println(operaciones.getById(1));

	}

}
