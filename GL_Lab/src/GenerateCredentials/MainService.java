package GenerateCredentials;
import EmployeeUtility.Employee;
import java.util.Scanner;

public class MainService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String firstName, lastName;
		int department;
		System.out.println("Please enter your First name");
		firstName=sc.next();
		System.out.println("Please enter your Last name");
		lastName=sc.next();
		
		boolean invalidOption = false;
		do {
		System.out.println("Please select a department");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		
		department=sc.nextInt();
		if(department == 1 || department == 2 || department == 3 || department == 4) {
			 Employee emp = new Employee(firstName, lastName);
			 
			 CredentialService cred = new CredentialService();
			 String emailadd = cred.generateEmailAddress(emp, department);
			 String pass = cred.generatePassword();
			 cred.showCredentials(emp.getFirstName(), emailadd, pass);
			 break;
		}else {
			invalidOption = true;
			System.out.println("Invalid input");
			System.out.println("Please select valid option");
			}
		}while(!invalidOption);
		 sc.close();
		 
	}
}
