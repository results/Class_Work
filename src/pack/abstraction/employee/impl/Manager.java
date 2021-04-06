package pack.abstraction.employee.impl;

import pack.abstraction.employee.Employee;

/**
 * Core Java - Exercise - OOP - Manager and Trainee
 * @author John Fink
 *
 */
public class Manager extends Employee {

	public Manager(long employeeId, String employeeName, String employeeAddress, String employeePhone, double salary) {
		super(employeeId, employeeName, employeeAddress, employeePhone);
		this.setBasicSalary(salary);
	}
	
	@Override
	public void calculateTransportAllowance() {
		double transportAllowance = 15*basicSalary/100;
		System.out.println(this.getClass().getSimpleName()+" Calculated Transport Allowance: "+transportAllowance);
	}


}
