package pack.files;

import java.io.File;
import java.util.Arrays;

public class FileListDemo {

	public static void main(String[] args) {
		String path = ".\\";
		File file = new File(path);
		System.out.println(Arrays.toString(file.list()));//as list
		for(File find : file.listFiles()) {//or list indiv
				if(find.getName() == null || !find.isFile()) {
					if(find.getName().contains(".")) {
						System.out.println(find.getName().lastIndexOf("."));
					}

				}
		}
	}

}
