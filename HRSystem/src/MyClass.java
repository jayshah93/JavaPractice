import java.util.Scanner;
import com.jay.oop.hrsystem.Employee;
import com.jay.oop.hrsystem.Phone;
import com.jay.oop.hrsystem.hrservices.HrServices;

public class MyClass {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		HrServices hrServices = new HrServices();
		Employee employee = new Employee();
		Phone phone = new Phone();

		System.out.println("Enter Employee ID: ");
		employee.setEmpId(input.nextInt());

		System.out.println("Enter Employee First Name");
		employee.setEmpFirstName(input.next());

		System.out.println("Enter Employee Last Name");
		employee.setEmpLastName(input.next());

		boolean ph = true;
		System.out.println("Do you want to add phone number? (Y/N)");
		String entry = input.next();
		if(entry.equalsIgnoreCase("y")) 
		  {
			  ph = true; 
		  	}
		  else if (entry.equalsIgnoreCase("n"))
		  { 
			  ph = false; 
		  	} 
		 
		while (ph==true) {
			System.out.println("Enter Phone ID: ");
			phone.setPhoneId(input.nextInt());
			System.out.println("Enter area code: ");
			phone.setAreaCode(input.next());

			System.out.println("Enter phone number:");
			phone.setNumber(input.next());

			System.out.println("Enter country code"); 
			phone.setCountryCode(input.next());
			 
			employee.setPhone(phone);			  
			
			}
				hrServices.addEmployee(employee);
				System.out.println("Enter employee first name to find");
				String fname = input.next();
				System.out.println("Enter employee last name to find");
				String lname = input.next();
				hrServices.searchEmployee(fname, lname);
				System.out.println("Enter employee id to fine ");
				int eid = input.nextInt();
				hrServices.searchEmployee(eid);
				System.out.println("Enter emp id to remove");
				int id = input.nextInt();
				hrServices.removeEmployee(id);

	}
}

