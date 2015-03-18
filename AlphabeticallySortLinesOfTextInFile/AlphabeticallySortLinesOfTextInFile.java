package com.veinik.AlphabeticallySortLinesOfTextInFile;
// 2. Вывести все строки текствого файла в алфавитном порядке.
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AlphabeticallySortLinesOfTextInFile {
	public static void main(String[] args) throws Exception {

		String inputFile = "d://MyFile.txt/";
		String outputFile = "d://MyFile1.txt/";

		FileReader fileReader = new FileReader(inputFile);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String inputLine;
		List<String> lineList = new ArrayList<String>();
		while ((inputLine = bufferedReader.readLine()) != null) {
			lineList.add(inputLine);
		}
		fileReader.close();

		Collections.sort(lineList);
		FileWriter fileWriter = new FileWriter(outputFile);
		PrintWriter out = new PrintWriter(fileWriter);
		for (String outputLine : lineList) {
			out.println(outputLine);
		}
		out.flush();
		out.close();
		fileWriter.close();

		String fileName = "d:\\MyFile1.txt";

		InputStream inFile = null;
		try {
			inFile = new FileInputStream(fileName);
			readFullByByte(inFile);
		} catch (IOException e) {
			throw new Exception("Exception when open and read file " + fileName, e);
		} finally {
			closeStream(inFile);
		}
	}

	public static void readFullByByte(InputStream in) throws Exception {
		int oneByte;
		while((oneByte = in.read()) != -1 ){
			System.out.print((char)oneByte);
		}
	}

	private static void closeStream(InputStream inFile) throws Exception {
		if (inFile != null) {
			try {
				inFile.close();
			} catch (IOException ignore){
			}
		}
	}
}
