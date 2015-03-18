package com.veinik.fileCopy;
/*
1. Скопировать большой файл, например, фильм, в другой файл. После копирования размер файла должны совпадать.
2. Вывести все строки текствого файла в алфавитном порядке.
3. Вывести имена и первые 3 строки всех файлов *.java из папки.
4. Подсчитать количество уникальных слов во всех java файлах в папке.
*/

import java.io.*;

public class WorkInFile {
    public static void main(String args[]) {
        FileWorker fileWorker = new FileWorker();
        try {
            File in = new File("d:\\JAVA file copy.mp4");
            File out1 = new File("d:\\newfile1.mp4");
            File out2 = new File("d:\\newfile2.mp4");
            fileWorker.fileCopy1(in, out1);
            fileWorker.fileCopy2(in, out2);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e);
        } catch (IOException e1) {
            e1.getStackTrace();
        }
    }
}
