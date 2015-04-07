class Employee {

	String name ;
	int idNumber ;
	String department ;
	String position ;
	
	public Employee (String n, int id, String dept, String pos)
	{
		name = n;
		idNumber = id;
		department = dept;
		position = pos;
	}

	public Employee (String n, int id)
	{
		name = n;
		idNumber = id;
		department = "";
		position = "";
	}
	
	public Employee ()
	{
		name = "";
		idNumber = 0;
		department = "";
		position = "";
	}
	
	public void showEmployee()
	{
		System.out.println("Name: " + name);
		System.out.println("ID Number: " + idNumber);
		System.out.println("Department: " + department);
		System.out.println("Position: " + position);
	}
}


public class Assignment6_Q1 {

	public static void main(String[] args) {

		int i = 3;

		Employee[] e = new Employee[i + 1];

		e[1] = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");
		e[2] = new Employee("Mark Jones", 39119, "IT", "Programmer");
		e[3] = new Employee("Joy Rogers", 81774, "Manufacturing", "Engineer");

		for (i = 1; i < e.length; i++) {
			System.out.println("Employee #" + i);
			e[i].showEmployee();
			System.out.println();
		}

	}

}
