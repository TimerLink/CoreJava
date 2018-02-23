package com.huawei.file;

import java.io.*;

/**
 * Created by Newsoul on 2018/2/23.
 */
public class TextFile
{
    private void writeFile(String[] employees, PrintWriter out)
    {
        out.println(employees.length);

        for (String employee : employees)
        {
            out.println(employee);
        }
    }

    private void readTxt() throws IOException
    {
        File file = new File("D:/CoreJava.txt");
        FileInputStream fileInputStream = new FileInputStream("D:/CoreJava.txt");
        for (int i = 0; i < file.length(); i++)
        {
            System.out.println((char) fileInputStream.read());
        }
        fileInputStream.close();
    }
}
