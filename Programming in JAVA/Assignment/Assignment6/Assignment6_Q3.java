class Personal {
	
	String index;
	String name;
	String address;
	int age;
	String phoneNumber;

	public void setPersonal(String idx, String nm, String ads, int ag, String phoneNo) 
	{		
		index = idx;
		name = nm;
		address = ads;
		age = ag;
		phoneNumber = phoneNo;
	}

	public void getPersonal() 
	{
		System.out.println(index + " information:");
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Address: " + address);
		System.out.println("Phone: " + phoneNumber);
		System.out.println();
	}
}

public class Assignment6_Q3 {

	public static void main(String[] args) {

		Personal p1 = new Personal();
		Personal p2 = new Personal();
		Personal p3 = new Personal();
		
		p1.setPersonal("My", "Joe Mahoney", "724 22nd Street", 27,"(555)555-1234");
		p2.setPersonal("Friend #1's", "Geri Rose","149 East Bay Street", 24, "(555)555-5678");
		p3.setPersonal("Friend #2's", "John Carbonni","22 King Street", 28, "(555)555-0123");

		p1.getPersonal();
		p2.getPersonal();
		p3.getPersonal();

	}

}
