package pack.abstraction.employee;

import pack.abstraction.employee.impl.Manager;
import pack.abstraction.employee.impl.Trainee;

/**
 * Core Java - Exercise - OOP - Manager and Trainee
 * @author John Fink
 *
 */
public class InheritanceActivity {

	public static void main(String[] args) {
		Manager manager = new Manager(126534, "Peter", "Chennai India", "237844", 65000);
		manager.calculateSalary();
		manager.calculateTransportAllowance();
		Trainee trainee = new Trainee(29846, "Jack", "Mumbai India", "442085", 45000);
		trainee.calculateSalary();
		trainee.calculateTransportAllowance();
	}

}
