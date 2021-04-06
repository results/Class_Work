package pack.abstraction.employee;

/**
 * Core Java - Exercise - OOP - Manager and Trainee
 * @author John Fink
 *
 */
public abstract class Employee {
	
	public Employee(long employeeId, String employeeName, String employeeAddress, String employeePhone) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
		this.employeePhone = employeePhone;
	}
	
	protected long employeeId;
	protected String employeeName;
	protected String employeeAddress;
	protected String employeePhone;
	protected double basicSalary;
	protected double specialAllowance = 250.80;
	protected double Hra = 1000.50;
	
	
	protected void calculateSalary() {
		double salary = basicSalary + (basicSalary*specialAllowance/100) + (basicSalary * Hra/100);
		System.out.println(this.getClass().getSimpleName()+" Calculated Salary: "+salary);
		//getting name isnt needed, just easier to read for testing
	}
	
	protected void calculateTransportAllowance() {
		double transportAllowance = 10*basicSalary/100;//math incorrect on document
		System.out.println(this.getClass().getSimpleName()+" Calculated Transport Allowance: "+transportAllowance);
	}


	public long getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}


	public String getEmployeeName() {
		return employeeName;
	}


	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}


	public String getEmployeeAddress() {
		return employeeAddress;
	}


	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}


	public String getEmployeePhone() {
		return employeePhone;
	}


	public void setEmployeePhone(String employeePhone) {
		this.employeePhone = employeePhone;
	}


	public double getBasicSalary() {
		return basicSalary;
	}


	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}


	public double getSpecialAllowance() {
		return specialAllowance;
	}


	public void setSpecialAllowance(double specialAllowance) {
		this.specialAllowance = specialAllowance;
	}


	public double getHra() {
		return Hra;
	}


	public void setHra(double hra) {
		Hra = hra;
	}
	
	
	
	

}
