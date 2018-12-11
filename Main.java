
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

/**
	File name: ClassTemplate.java
	Short description:
	IST 242 Assignment:
	@author YOUR NAME
	@version 1.01 FILL IN THE DATE
*/

public class Main
{
            public static void main(String[] args) throws IOException
            {
                //initializing values
                int selection = 0;
                Scanner in = new Scanner(System.in);
                ArrayList<Citation> sources = new ArrayList<Citation>();
               // String fileName = "";

                //menu loop
                while(selection != 5)
                {
					System.out.println();
                    System.out.println("1 Load Project File");
                    System.out.println("2 Save Project File");
                    System.out.println("3 View Current Citations");
                    System.out.println("4 Add Citation");
                    System.out.println("5 Exit");
                    System.out.println("Select an option:");
                    selection = in.nextInt();

                    //if else to determine what to do
                    if (selection == 1)
                    {
                       // System.out.println("Not implemented yet");
                        //will prompt user to load an existing file and read the information in the file, making citation objects
                        //from it

                        String fileName = "";

						       while(fileName.equals(""))
						       {
									System.out.println("Enter name of file to load: ");
									fileName = in.nextLine();
									if (fileName.equals(""))
										System.out.println("Invalid file name.");
						}

                        sources = new ArrayList<Citation>();
                        loadProject(sources, fileName);
                        System.out.println("Loaded project under name: \""+fileName+".txt\"\n");

                    }
                    else if(selection ==2)
                    {
                        //System.out.println("Not implemented yet");
                        //Will save current existing citations to a new or existing file
                        String fileName = "";

                        while(fileName.equals(""))
                      	{
							System.out.println("Enter file name to save under: ");
							fileName = in.nextLine();
							if (fileName.equals(""))
								System.out.println("Invalid file name.");
						}
						saveProject(sources, fileName);

						System.out.println("Project saved under name: \""+fileName+".txt\"\n");
                    }
                    else if(selection ==3)
                    {
                        //System.out.println("Not implemented yet");
                        //will display the citations currently saved, after prompting to ask for citation format


                        //first check that there's actually sources in the arrayList and prompt if not
                        if(sources.size() > 0)
                        {
                            //prompt for citation format
                            System.out.println("For MLA format, press 1. For APA format, press 2.");
                            int format = in.nextInt();

                            //if else for the citation format
                            if(format == 1)
                            {
                                for(int i = 0; i < sources.size(); i++)
                                {
                                    System.out.println(" - "+sources.get(i).getMLACitation()+"\n");
                                }
                            }
                            else if(format ==2)
                            {
                                for(int i = 0; i < sources.size(); i++)
                                {
                                    System.out.println(" - "+sources.get(i).getAPACitation()+"\n");
                                }
                            }
                            else
                            {
                                System.out.println("Error invalid entry");
                            }
                        }
                        else
                        {
                            System.out.println("Error no sources found");
                        }
                    }
                    else if(selection ==4) //adding citations
                    {
                        //prompt to find out if citation is for book or website
                        System.out.println("If source is a book, press 1. If source is a website, press 2.");
                        int sourceSelect = in.nextInt();

                        //if else for book or website
                        if(sourceSelect == 1)
                        {
                            //for books
                            //temp variables for saving user input
                            String lName;
                            String fName;
                            String title;
                            String publisher;
                            String city;
                            String state;
                            String year;
                            String dateAccessed;
                            String vol;
                            String edition;
                            String series;
                            String totalVol;

                            //prompt user to add value to the variables
                            System.out.print("Enter Author's Last Name:");
                            lName = in.nextLine();
                            //fixing the error where it does not wait for input before moving to next line
                            in.nextLine();
                            System.out.print("Enter Author's First Name:");
                            fName = in.nextLine();
                            System.out.print("Enter Book Title:");
                            title = in.nextLine();
                            System.out.print("Enter Publisher Name:");
                            publisher = in.nextLine();
                            System.out.print("Enter Publisher City:");
                            city = in.nextLine();
                            System.out.print("Enter Publisher State by the two letter abbreviation:");
                            state = in.nextLine();
                            System.out.print("Enter Publish Year:");
                            year = in.nextLine();
                            System.out.print("Enter Date Accessed:");
                            dateAccessed = in.nextLine();
                            System.out.print("Enter Volume Number:");
                            vol = in.nextLine();
                            System.out.print("Enter Edition Number:");
                            edition = in.nextLine();
                            System.out.print("Enter Series:");
                            series = in.nextLine();
                            System.out.print("Enter Total Number of Volumes in the series:");
                            totalVol = in.nextLine();

                            //put variables in the constructor and save to the arrayList
                            sources.add(new BookCitation(lName, fName, title, publisher, city, state, year, dateAccessed, vol, edition, series, totalVol));
                        }
                        if(sourceSelect ==2)
                        {
                            //for websites
                            //temp variables for saving user input
                            String title;
                            String fName;
                            String lName;
                            String url;
                            String publishDay;
                            String publishMonth;
                            String year;
                            String dateAccessed;
                            String websiteTitle;
                            String publisher;

                            //prompt user to add value to the variables
                            System.out.println("Enter Article's Title:");
                            title = in.nextLine();
                            //fixing the error where it does not wait for input before moving to next line
                            in.nextLine();
                            System.out.print("Enter Author's Last Name:");
                            fName = in.nextLine();
                            System.out.print("Enter Author's First Name:");
                            lName = in.nextLine();
                            System.out.print("Enter URL:");
                            url = in.nextLine();
                            System.out.print("Enter Published Day:");
                            publishDay = in.nextLine();
                            System.out.print("Enter Published Month:");
                            publishMonth = in.nextLine();
                            System.out.print("Enter Published Year:");
                            year = in.nextLine();
                            System.out.print("Enter Date Accessed:");
                            dateAccessed = in.nextLine();
                            System.out.print("Enter Website Title:");
                            websiteTitle = in.nextLine();
                            System.out.print("Enter Publisher/Sponsor name:");
                            publisher = in.nextLine();

                            //put variables in the constructor and save to the arrayList
                            sources.add(new WebsiteCitation(fName, lName, title, publisher, year, dateAccessed, url, publishDay, publishMonth, websiteTitle));
                        }
                        else
                        {
                            System.out.println("Error invalid input");
                        }
                        //temp variables that will be used to create the citation
                    }
                    else if(selection ==5)
                    {
                        System.out.println("Thank you for using this program. Good bye.");
                    }
                    else
                    {
                        System.out.println("Error invalid input");
                    }
                }

                System.out.println("words");
            }

			//Saves sources to project file
            public static void saveProject(ArrayList<Citation> sources, String fileName) throws IOException{
					FileWriter out = null;
					try{
						out = new FileWriter(fileName+".txt");
						if (sources.size() != 0){
							for (int i=0; i<sources.size(); i++){
								sources.get(i).saveSource(out);
							}
						}
					}
					finally{
						out.close();
					}
			}

			//Loads sources from project file
			public static void loadProject(ArrayList<Citation> sources, String fileName) throws IOException
				{
					FileReader in = null;
					Scanner s = null;
					int sourceType = 0;
					try{
						in = new FileReader(fileName+".txt");
						s = new Scanner(in);
						s.useDelimiter("&&");

						while(s.hasNext()){
							String stringSource = s.next();
							sourceType = Integer.parseInt(stringSource);
							if (sourceType == 1)
								sources.add(new BookCitation());
							else if (sourceType == 2)
								sources.add(new WebsiteCitation());
							sources.get(sources.size()-1).loadSource(s);
						}
					}
					finally{
						in.close();
						s.close();
					}
			}
}