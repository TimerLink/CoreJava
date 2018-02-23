package com.huawei.file;

import java.io.PrintWriter;

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
}
