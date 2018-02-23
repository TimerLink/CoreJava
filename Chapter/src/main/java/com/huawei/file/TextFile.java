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

    private void writeTxt() throws IOException, FileNotFoundException
    {
        File file = new File("D:/file.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write('C');
        fileOutputStream.close();
    }
}
