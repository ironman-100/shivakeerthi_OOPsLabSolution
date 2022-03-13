package GenerateCredentials;
import java.util.Random;
import EmployeeUtility.Employee;

public class CredentialService {
	
	Employee emp;
	int department;
	public Employee getEmp() {
		return emp;
	}
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	public int getDepartment() {
		return department;
	}
	public void setDepartment(int department) {
		this.department = department;
	}
	
	
	public String generateEmailAddress(Employee emp, int department) {
		
		final String companyName = "GL";
		final String domain = ".com";
		final String[] departmentName = {"tech","adm","hr","legal"};
		
		String email = emp.getFirstName()+emp.getLastName()+"@"+departmentName[(department-1)]+companyName+domain;
		return email;
	}
	
	
	public String generatePassword() {
		
		Random random = new Random();

	    final String setOfCharacters = "abcdefghxyz";
	    final String capSetOfChars = "ABCGSTAEWIKDP";
	    final String numbers = "1234567890";
	    final String specChars = "-/#$%@";
	    String password = "";
	    for(int i=0;i<2;i++) {
	    	int smallCharLength = random.nextInt(setOfCharacters.length());
	    	System.out.println(smallCharLength);
		    int capCharLength = random.nextInt(capSetOfChars.length());
		    int numCharLength = random.nextInt(numbers.length());
		    int speCharLength = random.nextInt(specChars.length());
		    char randomsmallChar = setOfCharacters.charAt(smallCharLength);
		    System.out.println(randomsmallChar);
		    char randomCapChar = capSetOfChars.charAt(capCharLength);
		    char randomNum = numbers.charAt(numCharLength);
		    char randomSpec = specChars.charAt(speCharLength);
		    password +=  Character.toString(randomsmallChar)+Character.toString(randomCapChar)+Character.toString(randomNum)+Character.toString(randomSpec);
	    }
	    
	    return password;
	}
	
	
	public void showCredentials(String firstName, String emailAddress, String password) {
		System.out.println("Dear "+firstName+" your generated credentials are as follows");
		System.out.println("Email    ---> "+emailAddress);
		System.out.println("Password ---> "+password);
		
	}
	
	
}
