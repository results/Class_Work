package pack.collections;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWrite {
	
	
	
	private static void transfer() throws IOException {
		FileReader fReader = null;
		FileWriter fWriter = null;
		try {
			fReader = new FileReader(".\\test.txt");
			fWriter = new FileWriter(".\\fwtest.txt");
			int i;
			while((i = fReader.read()) != -1) {
				char val = (char)i;
				fWriter.append(val);
				if(Character.isAlphabetic(val))//ignore whitespace for printing
					System.out.println("Moved "+val+" to new file.");	
			}	
			System.out.println("Finished transfer.");	
		} finally {
			fReader.close();
			fWriter.close();
		}
	}
	

	public static void main(String[] args) {
		try {
			transfer();
			/*FileWriter fWriter = new FileWriter(".\\fwtest.txt");
			Scanner scanner = new Scanner(System.in);
			while(scanner.hasNext()) {
				String st = scanner.nextLine();
				if(st.equalsIgnoreCase("exit"))
					break;
				fWriter.append(st+"\n");
				System.out.println("Done");
			}
			fWriter.close();
			scanner.close();	*/	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
