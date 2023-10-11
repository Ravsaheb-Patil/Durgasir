package Logical;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		
		Employee emp1=new Employee(1,"Ravsaheb",27,60000.0);

		Employee emp2=new Employee(2,"Sujit",23,45000.0);

		
		Employee emp3=new Employee(3,"Nikhil",26,50000.0);

		
		Employee emp4=new Employee(4,"Sahil",25,90000.0);
		
		List<Employee> emp=List.of(emp1,emp2,emp3,emp4);
		Employee employee=emp.stream()
				.sorted(Comparator.comparingDouble(Employee::getEsallary).reversed())
                .skip(1)
                .findFirst()
                .get();
		System.out.println(employee);
				

		
	
	
	
	
	}
	
	
	
	
	}
