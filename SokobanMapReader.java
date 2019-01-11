//for help with reading files this was used:-
//https://www.geeksforgeeks.org/different-ways-reading-text-file-java/
//https://stackoverflow.com/questions/4716503/reading-a-plain-text-file-in-java

package Sokoban;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.*;

public class SokobanMapReader {
	
	
	HashMap<Integer, ArrayList> mapHash = new HashMap<>();
	
	public void loadMap() throws IOException 
	{
		
		int levelNumber = 1;
		int i;
		
		for( i = 0; i < 5; i++ )
		{
			ArrayList<String> mapNumber = new ArrayList<>();
			File readMapFile = new File("H:\\SokobanMaps\\level" + levelNumber + ".txt");
			BufferedReader br = new BufferedReader(new FileReader(readMapFile));
			
			try
			{
				String line;
				while((line = br.readLine()) != null )
				{
					mapNumber.add(line);
				}
			}
			
			catch(FileNotFoundException fnfe) 
			{
		          System.out.println("File does not exist");
		          fnfe.printStackTrace();
			}
			
			finally 
			{
				if (br != null) 
				{
					br.close();                    
			    }
			}
			
			mapHash.put(levelNumber, mapNumber);
			levelNumber++;
		}
	
		//to test if data is being inserted into the map. So far, all levels are being inserted and into the different keys. (5).
		System.out.println(mapHash);
	}
	
	//will need to return to access it elsewhere
	public HashMap<Integer, ArrayList> getHashMap()
	{
		return(mapHash);
	}
}