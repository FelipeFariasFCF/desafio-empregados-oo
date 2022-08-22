package application;

import java.util.Scanner;

import entities.Address;
import entities.Department;
import entities.Employee;

public class Program {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome do departamento: ");
		String nomeDepartamento = sc.nextLine();
		System.out.print("Dia do pagamento: ");
		int payDay = sc.nextInt();
		System.out.print("Email: ");
		sc.nextLine();
		String email = sc.nextLine();
		System.out.print("Telefone: ");
		String telefone = sc.nextLine();
		
		Address address = new Address(email, telefone);
		Department department = new Department(nomeDepartamento, payDay, address);
		
		System.out.print("Quantos funcionarios tem o departamento ? ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Dados do funcionario " + i);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Salario: ");
			double salario =sc.nextDouble();
			Employee emp = new Employee(nome, salario);
			department.addEmployee(emp);
		}
		
		System.out.println();
		showReport(department);
		
		sc.close();
	}
	
	private static void showReport(Department dep) {
		System.out.println("FOLHA DE PAGAMENTO:");
		System.out.println(dep);
	}
}