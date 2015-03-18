package com.veinik.pathJava.FileFilter;

import java.io.File;
import java.io.FilenameFilter;

public class MyFileFilter implements FilenameFilter {

	private String ext;

	public MyFileFilter(String ext) {
		this.ext = ext;
	}

	public boolean accept(File directory, String fileName) {
		if (fileName.endsWith(ext)) {
			return true;
		}
		return false;
	}
}