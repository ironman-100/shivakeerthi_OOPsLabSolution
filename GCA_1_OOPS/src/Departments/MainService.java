package Departments;

public class MainService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperDepartment adminDept = new AdminDepartment();
		HrDepartment hrDept = new HrDepartment();
		TechDepartment techDept = new TechDepartment();
		
		System.out.println("Welcome to "+adminDept.departmentName());
		System.out.println(adminDept.getTodaysWork());
		System.out.println(adminDept.getWorkDeadline());
		System.out.println(adminDept.isTodayAHoliday());
		
		System.out.println("");
		
		System.out.println("Welcome to "+hrDept.departmentName());
		System.out.println(hrDept.getTodaysWork());
		System.out.println(hrDept.getWorkDeadline());
		System.out.println(hrDept.doActivity());
		System.out.println(hrDept.isTodayAHoliday());
		
		System.out.println("");
		
		System.out.println("Welcome to "+techDept.departmentName());
		System.out.println(techDept.getTodaysWork());
		System.out.println(techDept.getWorkDeadline());
		System.out.println(techDept.getTechStackInformation());
		System.out.println(techDept.isTodayAHoliday());
		
		
		
	}

}
