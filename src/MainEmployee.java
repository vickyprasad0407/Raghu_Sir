import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import org.omg.CORBA.Object;

public class MainEmployee {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList employee=new ArrayList();
        while (true) {
			System.out.println("Enter the id ,name, and salary");
			int id=sc.nextInt();
			String name=sc.next();
			double sal=sc.nextDouble();
			Employee emp=new Employee(id, name, sal);
			employee.add(emp);
			System.out.println("do you want more employee ");
			String res=sc.next();
			if (res.equalsIgnoreCase("no"))
				break;
		}
        System.out.println("Employees list : ");
        Iterator itr=employee.iterator();
        while (itr.hasNext())
        {
        	System.out.println(itr.next());
        }
        Employee emp=getHighestSalary(employee);
        System.out.println("Highest salary of the employees is : "+emp.esal);
        List is=get5000AboveSalary(employee);
        System.out.println("list of employes whose salary is greater than 5000");
        for (int i=0;i<is.size();i++) {
			System.out.println(is.get(i));
		}
	}

	private static List get5000AboveSalary(ArrayList employee)
	{
		List es=new ArrayList();
		for (int i=0;i<employee.size();i++) {
			Employee emp=(Employee)employee.get(i);
			if (emp.esal>5000) {
				es.add(emp);
				
			}
			
		}
		return es;
	}

	private static Employee getHighestSalary(ArrayList employee)
	{
	    	Employee he=(Employee) employee.get(0);
	    	for (int i = 1; i< employee.size(); i++) {
				Employee em=(Employee) employee.get(i);
				if (em.esal>he.esal) {
					he=em;
				}
			}
		return he;
	}

	

}
