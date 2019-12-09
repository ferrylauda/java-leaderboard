package com.sap.ase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Leaderboard {
	private Map<Player, Integer> scoresByPlayer = new HashMap<Player, Integer>();

	public void update(Player player, int potSize) {
		if (!scoresByPlayer.containsKey(player) || (potSize > scoresByPlayer.get(player))) {
			scoresByPlayer.put(player, potSize);
		}
	}
	
	public int getPositionOfPlayer(Player player) 
	{
		List<Integer> topScores = new ArrayList<Integer>(scoresByPlayer.values());
		Collections.sort(topScores, Collections.reverseOrder());
		
		for(Player thisPlayer: scoresByPlayer.keySet()) {
			if(thisPlayer.getId() == player.getId()) {
				return topScores.indexOf(scoresByPlayer.get(thisPlayer)) + 1;
			}
		}
		
		return topScores.size()+1;
	}
}
