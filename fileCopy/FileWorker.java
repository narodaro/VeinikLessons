package com.veinik.fileCopy;
/*
1. Скопировать большой файл, например, фильм, в другой файл. После копирования размер файла должны совпадать.
2. Вывести все строки текствого файла в алфавитном порядке.
3. Вывести имена и первые 3 строки всех файлов *.java из папки.
4. Подсчитать количество уникальных слов во всех java файлах в папке.
*/

import java.io.File;
import java.io.*;

public class FileWorker {
    public static void fileCopy1(File in, File out) throws IOException {

        long startTime = System.currentTimeMillis();
        FileInputStream is = new FileInputStream(in);
        FileOutputStream os = new FileOutputStream(out);
        processFileCopy(is, os);
        long endTime = System.currentTimeMillis();
        System.out.println("Time = " + (endTime - startTime) + " milliseconds");
    }

    public static void fileCopy2(File in, File out) throws IOException {

        long startTime = System.currentTimeMillis();
        InputStream is = new BufferedInputStream(new FileInputStream(in));
        OutputStream os = new BufferedOutputStream(new FileOutputStream(out));
        processFileCopy(is, os);
        long endTime = System.currentTimeMillis();
        System.out.println("Time = " + (endTime - startTime) + " milliseconds");
    }

    public static void processFileCopy(InputStream is, OutputStream os) throws IOException {
        try {
            byte[] buffer = new byte[4096];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } finally {
            os.close();
            is.close();
            System.out.println("File1 copied");
        }
    }
}



