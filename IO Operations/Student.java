/*
 * 7. Write a program to get the result for the following
 * In a school(1-10),each class is maintaining a file having data about all the students in a format (Roll###Name###Age###phone).
 * Principal want to generate a file containing data of all the students who is above 10 years old in a format(Name##Age##phone##class)
*/

import java.io.*;
 
public class Student {
 
    public static void main(String[] args) throws Exception
    {
        BufferedReader sourceFile = null;

        BufferedWriter targetFile = null;
        targetFile = new BufferedWriter(new FileWriter("newStudent.txt"));

        String str = "";
        try
        {
            for(int i=1;i<=2;i++)
            {
              
                sourceFile = new BufferedReader( new FileReader(i+"student.txt"));
                while( (str = sourceFile.readLine()) != null)
                {
                    int age = Integer.parseInt(str.split("###")[2]);

                    if( age > 10)
                    {
                        targetFile.write(str);
                        targetFile.newLine();
                    }
                }
            }
        }

        finally
        {
            if(sourceFile!=null)
            {
                sourceFile.close();
            }
            if(targetFile!=null)
            {
                targetFile.close();
            }

        }
     }
 }

