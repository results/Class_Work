package pack.files;

import java.io.File;

public class FileDemo {

	public static void main(String[] args) {
		String path = ".\\test.txt";
		File file = new File(path);
		System.out.println("File name: "+file.getName());
		System.out.println("Path: "+file.getAbsolutePath());
	}

}
