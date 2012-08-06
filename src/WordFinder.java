import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class WordFinder 
{


	static int forCount = 0;
	static int itCount = 0;
	static int theCount = 0;
	static int heCount = 0;
	static int sheCount = 0;
	static int inCount = 0;
	static int butCount = 0;

	static double forAvg;
	static double itAvg;
	static double theAvg;
	static double heAvg;
	static double sheAvg;
	static double inAvg;
	static double butAvg;
	
	public static void main(String[] args)
	{
		FuncWrdCounter();

		//FuncWrdAvg();
		
	}
	
	public static void FuncWrdCounter()
	{
		
		
		// needs real file path
		final String FILE_PATH = "C:\\Users\\gprobst\\Documents\\Story1.txt";
		File inputFile = new File(FILE_PATH);
		String docText = new String();
		
		Scanner scan;
		
		
		
		try 
		{
			//Creates a scanner that ignores non alpha-numeric chars
			scan = new Scanner (inputFile).useDelimiter("[\\W]+");
			
			//A loop that counts the number of words as well as the number of letters  in each word.
			//It counts each instance of the word "for". Also, prints each word.
			while(scan.hasNext())
			{
				
				docText = scan.next();
				docText = docText.toLowerCase();
				
				switch (docText)
				{
					case("For"):
						forCount++;
						break;
					case("It"):
						itCount++;
						break;
					case("The"):
						theCount++;
						break;
					case("He"):
						heCount++;
						break;
					case("She"):
						itCount++;
						break;
					case("In"):
						inCount++;
						break;
					case("but"):
						butCount++;
						break;
				}
			
			}
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
	
		System.out.println(butCount);
	}
	
	
	public static void FuncWrdAvg()
	{
		
		
		//the following code needs the real var for word count
		forAvg = forCount / Containment.wordCount;
		itAvg = itCount / Containment.wordcount;
		theAvg = theCount / Containment.wordCount;
		heAvg = heCount / Containment.wordCount;
		sheAvg = sheCount / Containment.wordCount;
		inAvg = inCount / Containment.wordCount;
		butAvg = butCount / containment.wordCount;
		
	}

}

