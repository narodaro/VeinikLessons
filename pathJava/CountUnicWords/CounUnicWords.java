package com.veinik.pathJava.CountUnicWords;
// 4. Подсчитать количество уникальных слов во всех java файлах в папке.

import com.veinik.pathJava.FileFilter.MyFileFilter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.util.*;

public class CounUnicWords {

	public  static Set<String> set = new HashSet<String>();

	public static void main(String[] args) {
		File path = new File("D:\\Lessons");
		if (!path.exists()) {
			System.out.println("Path not found");
		}

		FilenameFilter filter = new MyFileFilter(".java");
		File[] files = path.listFiles(filter);
		for (File f : files)
			try {
				System.out.println("File: " + f.getPath());
				ReadFile(f);
			} catch (Exception e) {
				e.printStackTrace();
			}
		System.out.println("Unique words: " + set.size());
	}

	public static void ReadFile(File file) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line;
		while ((line = br.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(line, " .?!()[]{}|?/&\\,;:-_\'\"\t\n\r");
			while (st.hasMoreTokens()) {
				String tokens = st.nextToken();
				set.add(tokens);
			}
		}
	}
}