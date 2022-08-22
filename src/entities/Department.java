package entities;

import java.util.ArrayList;
import java.util.List;

public class Department {

	private String name;
	private Integer payDay;
	
	private Address address;
	private List<Employee> employees = new ArrayList<>();
	
	public Department(String name, Integer payDay, Address address) {
		this.name = name;
		this.payDay = payDay;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPayDay() {
		return payDay;
	}

	public void setPayDay(Integer payDay) {
		this.payDay = payDay;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Employee> getEmployees() {
		return employees;
	}
	
	public void addEmployee(Employee emp) {
		employees.add(emp);
	}
	
	public void removeEmployee(Employee emp) {
		employees.remove(emp);
	}
	
	public double payroll() {
		double sum=0;
		for(Employee e: employees) {
			sum += e.getSalary();
		}
		return sum;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Departamento " + name + " = R$ ");
		sb.append(String.format("%.2f", payroll()) + "\n");
		sb.append("Pagamento realizado no dia " + payDay + "\n");
		sb.append("Funcionarios: \n");
		for(Employee e: employees) {
			sb.append(e.getName() + "\n");
		}
		sb.append("Para duvidas favor entrar em contato: " + address.getEmail());
		return sb.toString();
	}
}