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

public class SokobanDriver {
	
	public static void main(String[] args) throws IOException
	{
		
		//to test hashMap data.
		SokobanMapReader newMap = new SokobanMapReader();
		newMap.loadMap();
	}

}
