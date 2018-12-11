/**
	File name: ClassTemplate.java
	Short description:
	IST 242 Assignment:
	@author YOUR NAME
	@version 1.01 FILL IN THE DATE
*/

import java.io.*;
import java.util.Scanner;

public class Citation
{
	// Instance Variables -- define your private data
                  String authorFName;
                  String authorLName;
                  String title;
                  String publisher;
                  String publishYear;
                  String dateAccessed;

	// Constructors
	public Citation()
	{
		// initialize default values
                        authorFName = " ";
                        authorLName = " ";
                        title = " ";
                        publisher = " ";
                        publishYear = " ";
                        dateAccessed = " ";
	}
	public Citation(String in1, String in2, String in3, String in4, String in5, String in6) // pass in data to initialize variables
	{
                        authorFName = in1;
                        authorLName = in2;
                        title = in3;
                        publisher = in4;
                        publishYear = in5;
                        dateAccessed = in6;
	}

                //method(s) for abbreviating things

	//will be overwritten by the subclasses
	public String getMLACitation()
                   {
                       return "";
                   }

                   //will be overwritten by the subclasses
                   public String getAPACitation()
                   {
                       return "";
                   }

    //will be overwritten by the subclasses
    public void saveSource(FileWriter out) throws IOException
		     {
			}

		//loads source given input stream
			public void loadSource(Scanner in) throws IOException
			{
			}

}