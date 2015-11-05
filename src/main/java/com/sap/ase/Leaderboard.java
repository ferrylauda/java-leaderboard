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
	
	public int getPositionOfPlayer(Player player) {
		if (scoresByPlayer.containsKey(player)) {
			List<Integer> scores = new ArrayList<Integer>(scoresByPlayer.values());
			// we first sort the scores in descending order
			// of course there might be duplicate values when Alice and Bob e.g. have both a score of 5000
			Collections.sort(scores, Collections.reverseOrder());

			// we will iterate through the sorted scores and move a position counter,
			// but we move it only if the score is different from the previous one,
			// so that players with the same score have the same position 
			int p = 1; // position
			int c = 1; // same-score-counter
			
			for (int i = 0; i < scores.size(); i++) {
				int score = scores.get(i);
				
				if (i > 0) {
					// if score same than previous
					if (scores.get(i) == scores.get(i - 1)) {
						c++; // increment the same-score-counter by 1
					}
					// if score not same than previous
					if (scores.get(i) != scores.get(i - 1)) {
						p = p + c; // increment the position by same-score-counter
						c = 1; // reset same-score-counter
					}
				} // if (i > 0) && (scores.get(i) == scores.get(i - 1))
				
				if (scoresByPlayer.get(player) == score) {
					return p;
				} // if (i > 0) {
			} // for (int i = 0; i < scores.size(); i++)
		} // if (scoresByPlayer.containsKey(player))
		return scoresByPlayer.size() + 1;
	}
}
