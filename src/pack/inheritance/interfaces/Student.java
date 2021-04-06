package pack.inheritance.interfaces;

public class Student implements College {

	@Override
	public void setCourseName() {
		// TODO Auto-generated method stub
		System.out.println("Java Dev");

	}

	@Override
	public void setInstructorName() {
		// TODO Auto-generated method stub
		System.out.println("haseeb");
	}

	@Override
	public void setIAName() {
		// TODO Auto-generated method stub
		System.out.println("jenny");
	}

	@Override
	public void setCourseDuration() {
		// TODO Auto-generated method stub
		System.out.println("14 week");
	}

	@Override
	public void setProgramOffer() {
		// TODO Auto-generated method stub
		System.out.println("by teksystems");
	}

}
