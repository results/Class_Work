package pack.files.delim;

public class Course {
	
	public Course(String code, String name, String instruct) {
		super();
		this.code = code;
		this.name = name;
		this.instruct = instruct;
	}
	
	String code;
	String name;
	String instruct;
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getInstruct() {
		return instruct;
	}
	public void setInstruct(String instruct) {
		this.instruct = instruct;
	}
	
	@Override
	public String toString() {
		return this.getCode()+" | "+this.getName()+" | "+this.getInstruct();
	}
	
}