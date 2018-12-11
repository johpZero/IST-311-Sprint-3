/**
	File name: ClassTemplate.java
	Short description:
	IST 242 Assignment:
	@author YOUR NAME
	@version 1.01 FILL IN THE DATE
*/

import java.io.*;
import java.util.Scanner;

public class BookCitation extends Citation
{
	// Instance Variables -- define your private data
                    private String city;
                    private String state;
                    private String volume;
                    private String edition;
                    private String series;
                    private String totalVolumes;

	// Constructors
	public BookCitation()
	{
		// initialize default values
                        authorFName = " ";
                        authorLName = " ";
                        title = " ";
                        publisher = " ";
                        publishYear = " ";
                        dateAccessed = " ";
                        city = " ";
                        state = " ";
                        volume = " ";
                        edition = " ";
                        series = " ";
                        totalVolumes = " ";
	}
	public BookCitation(String in1, String in2, String in3, String in4, String in5, String in6, String in7, String in8, String in9, String in10, String in11, String in12) // pass in data to initialize variables
	{
                        authorFName = in1;
                        authorLName = in2;
                        title = in3;
                        publisher = in4;
                        publishYear = in5;
                        dateAccessed = in6;
                        city = in7;
                        state = in8;
                        volume = in9;
                        edition = in10;
                        series = in11;
                        totalVolumes = in12;
	}

	//will be overwritten by the subclasses
                    @Override
	public String getMLACitation()
                   {
                       return authorLName + ", " + authorFName + ". " + title + ". " + edition + " ed., vol. " + volume + " " + totalVolumes +
                               ", ser" + series + ", " + publisher + ", " + publishYear;
                   }

                   //Methods
                   //will be overwritten by the subclasses
                   @Override
                   public String getAPACitation()
                   {
                       return authorLName + ", " + authorFName + ". (" + publishYear + "). " + title + " (" + edition + " ed., Vol. "
                               + volume + ", " + series + "). " + city + ", " + state + ": " + publisher;
                   }

	//saves source given output stream
    public void saveSource(FileWriter out) throws IOException
    {
		out.write("&&1&&");//number denotes source type for when reading
		out.write(authorFName+"&&");
		out.write(authorLName+"&&");
		out.write(title+"&&");
		out.write(publisher+"&&");
		out.write(publishYear+"&&");
		out.write(dateAccessed+"&&");
		out.write(city+"&&");
		out.write(state+"&&");
		out.write(volume+"&&");
		out.write(edition+"&&");
		out.write(series+"&&");
		out.write(totalVolumes);
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
		city = in.next();
		state = in.next();
		volume = in.next();
		edition = in.next();
		series = in.next();
		totalVolumes = in.next();
	}
}