import java.util.Scanner;

class Payroll {

	String EmployeeName;
	int IDNumber;
	double HourlyPayRate;
	double NumOfHoursWorked;

	public Payroll(String enm, int id) {
		EmployeeName = enm;
		IDNumber = id;
	}

	public void setEmployeeName(String enm) {
		EmployeeName = enm;
	}

	public void setIDNumber(int id) {
		IDNumber = id;
	}

	public void setHourlyPayRate(double hrRate) {
		HourlyPayRate = hrRate;
	}

	public void setNumOfHoursWorked(double hrNum) {
		NumOfHoursWorked = hrNum;
	}

	public double GrossPay() {
		return HourlyPayRate * NumOfHoursWorked;
	}

	public void getPayroll() {
		System.out.println("Name: " + EmployeeName);
		System.out.println("ID Number: " + IDNumber);
		System.out.printf("Hourly pay rate: %.1f \n", HourlyPayRate);
		System.out.printf("Hours worked: %.1f \n", NumOfHoursWorked);
		System.out.printf("Gross pay: $%.1f \n",GrossPay());

	}
}

public class Assignment6_Q4 {

	public static void main(String[] args) {

		Payroll e1 = new Payroll("",0);
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the employee's name: ");
		e1.setEmployeeName(input.next());
		System.out.print("Enter the employee's ID number: ");
		e1.setIDNumber(input.nextInt());
		System.out.print("Enter the employee's hourly pay rate: ");
		e1.setHourlyPayRate(input.nextDouble());
		System.out.print("Enter the number of hours worked by the employee: ");
		e1.setNumOfHoursWorked(input.nextDouble());
		
		System.out.println("Employee Payroll Data");
		
		e1.getPayroll();
		
		input.close();
			
	}

}
