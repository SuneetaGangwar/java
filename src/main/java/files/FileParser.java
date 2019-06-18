package files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

public class FileParser {

	public static void main(String[] args) throws IOException {
		fileReader();

	}

	public static void fileReader() throws IOException {

		// todo get file location
		// todo open file stream
		// todo start iterating over file content
		// todo processing over data
		// todo close file stream
		String text = "Suneeta";

		String inputFile = "E:\\Testing\\test1.txt";
		String outputFile = "E:\\Testing\\test2.txt";
		BufferedReader reader = new BufferedReader(new FileReader(inputFile));
		BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
		String lines;
		while ((lines = reader.readLine()) != null) {
			String[] sentence = lines.split("\\.");

			for (int a = 0; a <= sentence.length - 1; a++) {
				String tempText = sentence[a];

				if (tempText.contains(text)) {
					writer.append(tempText + ". ");
					// writer.newLine();
				}

			}

		}
		writer.flush();
		writer.close();
		reader.close();

	}

}
