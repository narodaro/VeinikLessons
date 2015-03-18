package com.veinik.AlphabeticallySortLinesOfTextInFile;
// 2. Вывести все строки текствого файла в алфавитном порядке.
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.TreeSet;

public class AlphabeticallySortLinesOfTextInFile2 {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new FileReader("d:\\MyFile.txt"));
		String s;
		TreeSet<String> strings = new TreeSet<String>();
		while ((s = in.readLine()) != null) {
			strings.add(s);
		}
		in.close();

		for (String str : strings) {
			System.out.println(str);
		}
	}
}
