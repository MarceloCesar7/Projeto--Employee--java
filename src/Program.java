import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Employee emp = new Employee();
		System.out.print("Name");
		emp.name = sc.nextLine();
		System.out.print("GrossSalary:");
		emp.GrossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		emp.tax = sc.nextDouble();
		System.out.println();
		System.out.println(emp);
		System.out.println();
		System.out.print("Which percentage to increase salary?");
		double percentage = sc.nextDouble();
		emp.increaseSalary(percentage);
		System.out.println();
		System.out.println("updated data: "+emp);
	}

}
