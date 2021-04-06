package pack.abstraction.employee.impl;

import pack.abstraction.employee.Employee;

/**
 * Core Java - Exercise - OOP - Manager and Trainee
 * @author John Fink
 *
 */
public class Trainee extends Employee {

	public Trainee(long employeeId, String employeeName, String employeeAddress, String employeePhone, double salary) {
		super(employeeId, employeeName, employeeAddress, employeePhone);
		this.setBasicSalary(salary);
	}

}
