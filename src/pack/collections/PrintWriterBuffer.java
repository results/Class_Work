package pack.collections;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterBuffer {

	public static void main(String[] args) {
		try {
			FileReader reader = new FileReader(".\\test.txt");
			BufferedReader buffReader = new BufferedReader(reader);
			PrintWriter printWriter = new PrintWriter(".\\pwtest.txt");
			String input = "";
			while((input = buffReader.readLine()) != null) {
				printWriter.print(input);
				System.out.println(input);
			}	
			buffReader.close();
			printWriter.close();
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
