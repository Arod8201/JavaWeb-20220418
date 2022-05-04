package entity;

import java.util.Arrays;

public class Employee {

	private String empName;
	private Integer empAge;
	private String empSex;
	private String empPos;
	private String empBirth;
	private String[] empLang;
	private String empMemo;

	public Employee() {
	}

	public Employee(String empName, Integer empAge, String empSex, String empPos, String empBirth, String[] empLang,
			String empMemo) {
		this.empName = empName;
		this.empAge = empAge;
		this.empSex = empSex;
		this.empPos = empPos;
		this.empBirth = empBirth;
		this.empLang = empLang;
		this.empMemo = empMemo;
	}

	@Override
	public String toString() {
		return "Employee [empName= " + empName + ", empAge= " + empAge + ", empSex= " + empSex + ", empPos= " + empPos
				+ ", empBirth= " + empBirth + ", empLang= " + Arrays.toString(empLang) + ", empMemo= " + empMemo + "]";
	}

}
