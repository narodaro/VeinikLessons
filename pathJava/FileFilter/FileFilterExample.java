package com.veinik.pathJava.FileFilter;
// 3. Вывести имена и первые 3 строки всех файлов *.java из папки.
import java.io.*;

public class FileFilterExample {

	public static void main(String[] args) {

		File path = new File("d:\\Lessons");
		if (!path.exists()) {
			System.out.println("Path not found");
		}

		FilenameFilter filter = new MyFileFilter(".java");

		File[] files = path.listFiles(filter);
		for (File f : files)
			try {
				System.out.println("File: " + f.getPath() + "\n" + ReadLinesOfTheFile(f) + "\n");
			} catch (Exception e) {
				e.printStackTrace();
			}
	}

	public static String ReadLinesOfTheFile(File file) throws Exception {

		int i = 0;
		String linesfile = "";
		String line;

		BufferedReader br = new BufferedReader(new FileReader(file));
		while ((line = br.readLine()) != null && i < 3) {
			linesfile += line + "\n";
			i++;
		}
		br.close();
		return linesfile;


	}
}
