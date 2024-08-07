import java.util.*;

public class employee_class
{
	public static void main(String[] args) 
	{
		int id, salary;
		String name, desig;	

		Scanner s=new Scanner(System.in);
		employee_details ed = new employee_details();

		System.out.println("enter your name : ");
		name = s.next();

		System.out.println("enter your Id : ");
		id = s.nextInt();


		System.out.println("enter your salary : ");
		salary = s.nextInt();

		System.out.println("enter your designation : ");
		desig = s.next();

		ed.set_employee(id, name, desig, salary);
		ed.show_employee();
	}
}
	class employee_details
	{
		int id, salary;
		String name, desig;

		public void set_employee(int id, String name, String desig, int salary)
		{
			this.id=id;
			this.name=name;
			this.desig=desig;
			this.salary=salary;
		}

		public void show_employee()
		{
			System.out.println("id = "+id);
			System.out.println("name = "+name);
			System.out.println("designation = "+desig);
			System.out.println("salary = "+salary);
		}
	}
