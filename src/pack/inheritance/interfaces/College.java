package pack.inheritance.interfaces;

public interface College {
	/**
	 * Fields and public static and final by default. Methods are public and abstract
	 */
	
	String college = "Per scholas";//public static final inferred by compiler
	
	void setCourseName();//public abstract by default
	void setInstructorName();
	void setIAName();
	void setCourseDuration();
	void setProgramOffer();

}
