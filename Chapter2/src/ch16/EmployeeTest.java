package ch16;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee employeeKim = new Employee();
		Employee employeeLee = new Employee();

		employeeKim.setEmployeeName("김유신");
		employeeLee.setEmployeeName("이순신");
		
		System.out.println(employeeKim.getEmployeeName() + "님의 사번은 " + employeeKim.getEmployeeId() + "번 입니다.");
		System.out.println(employeeLee.getEmployeeName() + "님의 사번은 " + employeeLee.getEmployeeId() + "번 입니다.");
	}
}
