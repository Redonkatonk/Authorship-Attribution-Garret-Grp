import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.*;

public class Chap_Lab 
{
	public static void main(String[] args) 
	{
		{
			int letterNum = 0;
			int wordNum = 0;
			int orNum = 0;
			int theNum = 0;
			int andNum = 0;
			int aNum = 0;
			int isNum = 0;
			double avgLength;
			double orComp, theComp, isComp, aComp, andComp;
			
			final String FILE_PATH = "C:\\GettysburgAddress.txt";
			File inputFile = new File(FILE_PATH);
			String gettyText = new String();
			
			Scanner scan;
			
			String wrdOr = "or";
			String wrdThe = "the";
			String wrdAnd = "and";
			String wrdA = "a";
			String wrdIs = "is";
			
			try 
			{
				//Creates a scanner that ignores non alpha-numeric chars
				scan = new Scanner (inputFile).useDelimiter("[^\\w]+");
				
				//A loop that counts the number of words as well as the number of letter in each word.
				//It counts each instance of the word "a" "and" "or", "is", "the". Also, prints each word.
				while(scan.hasNext())
				{
					
					gettyText = scan.next();
					letterNum += gettyText.length();
					wordNum++;
					
					if (gettyText.equalsIgnoreCase(wrdOr))
					{
						orNum++;
					}
					else if (gettyText.equalsIgnoreCase(wrdThe))
					{
						theNum++; 
					}
					else if (gettyText.equalsIgnoreCase(wrdAnd))
					{
						andNum++;
					}
					else if (gettyText.equalsIgnoreCase(wrdA))
					{
						aNum++;
					}
					else if (gettyText.equalsIgnoreCase(wrdIs))
					{
						isNum++;
					}
					System.out.println (wordNum + ". " + gettyText);
					
				}
				
				
				scan.close();
			} 
			catch (FileNotFoundException e)
			{
				e.printStackTrace();
			}
			
			//Calculates average word length and prints out total number of letters,
			//total number of words and the average number of letters per word.
			avgLength = letterNum / wordNum;
			
			orComp = (double) orNum / wordNum;
			theComp = (double) theNum / wordNum;
			andComp = (double) andNum / wordNum;
			aComp = (double) aNum / wordNum;
			isComp = (double) isNum / wordNum;
			
			DecimalFormat fmt1 = new DecimalFormat("0.###");
			NumberFormat perc = NumberFormat.getPercentInstance();
			
			System.out.println("\nNumber of Words: " + wordNum);
			System.out.println("Number of Letters:" + letterNum);
			System.out.println("Average word length: " + fmt1.format (avgLength));
			System.out.println("Instances of Function word \"or\": " + orNum);
			System.out.println("Instances of Function word \"the\": " + theNum);
			System.out.println("Instances of Function word \"and\": " + andNum);
			System.out.println("Instances of Function word \"a\": " + aNum);
			System.out.println("Instances of Function word \"is\": " + isNum);
			
			System.out.println();
			// I gave a calculated value of the frequency and formatted it to percent.
			System.out.println("Calculated Frequency of Word \"or\": " + perc.format (orComp));
			System.out.println("Calculated Frequency of Word \"the\": " + perc.format (theComp));
			System.out.println("Calculated Frequency of Word \"and\": " + perc.format (andComp));
			System.out.println("Calculated Frequency of Word \"a\": " + perc.format (aComp));
			System.out.println("Calculated Frequency of Word \"is\": " + perc.format (isComp));
		}
	}
}
