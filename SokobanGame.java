package Sokoban;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class SokobanGame {
	
	private HashMap<Integer, ArrayList> mMapHash = new HashMap<>();
	
	public SokobanGame() throws IOException
	{
		SokobanMapReader newMap = new SokobanMapReader();
		newMap.loadMap();
		
		mMapHash = newMap.getHashMap();
		
		//switch statement regarding the choice of level to seperate the maps will be here. Then it will pass through the Level class.
	}
	
}
