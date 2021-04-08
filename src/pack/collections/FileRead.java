package pack.collections;

import java.io.FileReader;
import java.io.IOException;

public class FileRead {
	
	public static void main (String args[]) {
		try {
			FileReader fReader = new FileReader(".\\test.txt");
			int i = -1;
			while((i = fReader.read()) != -1) {
				char val = (char)i;
					System.out.print(val);
			}			
			fReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
