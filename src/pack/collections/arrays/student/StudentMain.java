package pack.collections.arrays.student;

import java.io.FileNotFoundException;

/**
 * 
 * @author John Fink
 *
 */
public class StudentMain {

	public static void main(String[] args) {
		StudentInfo sInfo = new StudentInfo();
		try {
			sInfo.readFile();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		sInfo.display();
	}

}
