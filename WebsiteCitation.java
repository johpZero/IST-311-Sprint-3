/**
	File name: ClassTemplate.java
	Short description:
	IST 242 Assignment:
	@author YOUR NAME
	@version 1.01 FILL IN THE DATE
*/

import java.io.*;
import java.util.Scanner;

public class WebsiteCitation extends Citation
{
	// Instance Variables -- define your private data
                    private String url;
                    private String publishDay;
                    private String publishMonth;
                    private String websiteTitle;


	// Constructors
	public WebsiteCitation()
	{
		// initialize default values
                        authorFName = " ";
                        authorLName = " ";
                        title = " ";
                        publisher = " ";
                        publishYear = " ";
                        dateAccessed = " ";
                        url = " ";
                        publishDay = " ";
                        publishMonth = " ";
                        websiteTitle = " ";
	}
	public WebsiteCitation(String in1, String in2, String in3, String in4, String in5, String in6, String in7, String in8, String in9, String in10) // pass in data to initialize variables
	{
                        authorFName = in1;
                        authorLName = in2;
                        title = in3;
                        publisher = in4;
                        publishYear = in5;
                        dateAccessed = in6;
                        url = in7;
                        publishDay = in8;
                        publishMonth = in9;
                        websiteTitle = in10;
	}

                    //Methods
	//will be overwritten by the subclasses
                    @Override
	public String getMLACitation()
                   {
                       return authorLName + ", " + authorFName + ". " + title + " " + websiteTitle + ", " + publisher + ", " +
                               publishDay + ", " + publishMonth + " " + publishYear + ", " + url + ".";
                   }

                   //will be overwritten by the subclasses
                   @Override
                   public String getAPACitation()
                   {
                       return authorLName + ", " + authorFName + ". (" + publishYear + ", " + publishMonth + " " + publishDay + "). "
                               + title + " Retrieved " + dateAccessed + ", from " + url;
                   }

     //saves source given output stream
	     public void saveSource(FileWriter out) throws IOException
	     {
	 		out.write("&&2&&");//number denotes source type for when reading
	 		out.write(authorFName+"&&");
	 		out.write(authorLName+"&&");
	 		out.write(title+"&&");
	 		out.write(publisher+"&&");
	 		out.write(publishYear+"&&");
	 		out.write(dateAccessed+"&&");
	 		out.write(url+"&&");
	 		out.write(publishDay+"&&");
	 		out.write(publishMonth+"&&");
	 		out.write(websiteTitle+"&&");
		}

		//loads source given input stream
			public void loadSource(Scanner in) throws IOException
			{
				authorFName = in.next();
				authorLName = in.next();
				title = in.next();
				publisher = in.next();
				publishYear = in.next();
				dateAccessed = in.next();
				url = in.next();
				publishDay = in.next();
				publishMonth = in.next();
				websiteTitle = in.next();
			}
}