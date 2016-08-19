package thread;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileTester {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		File intxtfile = new File(
				"C:/Users/Azharul Islam Nipu/Desktop/rutin.txt");
		File outfile = new File(
				"C:/Users/Azharul Islam Nipu/Desktop/ClsRutin.txt");

		try {
			FileReader fileReader = new FileReader(intxtfile);

			try {
				FileWriter fileWriter = new FileWriter(outfile);

				Scanner scanner = new Scanner(System.in);
				while (scanner.hasNext()) {

					String tempString = scanner.nextLine();

					// System.out.println(tempString);
					fileWriter.write(tempString + "\n");

				}
				fileReader.close();
				fileWriter.close();

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			System.out.println("File Not Founsd");
		}
	}

}
