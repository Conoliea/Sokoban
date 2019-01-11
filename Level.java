package Sokoban;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Level {
	
	private HashMap<Integer, ArrayList> mMapHash = new HashMap<>();
	private String stringMap = "";
	private ArrayList<Object> listOfTiles;
	
	public Level() throws IOException
	{
		SokobanMapReader newMap = new SokobanMapReader();
		newMap.loadMap();
		
		mMapHash = newMap.getHashMap();
		this.listOfTiles = new ArrayList<>();
	}

	public void setMapList()
	{		
		for( int x= 1; x < mMapHash.size(); x++)
		{
			ArrayList cuMap = mMapHash.get(1);
			stringMap = cuMap.toString();
			
			for(int i = 0; i < stringMap.length(); i++ )
			{
				char character = stringMap.charAt(i);
				
				switch(character)
				{
					case 'X': 
						Wall wall = new Wall();
						listOfTiles.add(wall);
					break;
					
					case '@':
						Player player = new Player();
						listOfTiles.add(player);
					break;
					
					case ' ':
						FloorSpace space = new FloorSpace();
						listOfTiles.add(space);
					break;
					
					case '*':
						Crate crate = new Crate();
						listOfTiles.add(crate);
					break;
					
					case '.':
					Diamond diamond = new Diamond();
						listOfTiles.add(diamond);
					break;
				}
				
			}
			
		}
		
	}
	
	public ArrayList<Object> getListOfTiles()
	{
		return(listOfTiles);
	}
	

}
