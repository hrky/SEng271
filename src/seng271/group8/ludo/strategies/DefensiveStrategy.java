package seng271.group8.ludo.strategies;

import seng271.group8.ludo.model.Pawn;
import seng271.group8.ludo.model.Player;

/**
 *
 * @author bill
 */
public class DefensiveStrategy implements Strategy{
	//(3)Defensive: Give preference to a move to a target field where the pawn cannot be kicked;
	private String name = "Defensive";

	public Pawn getMove(Player player, int roll) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	public String getName(){
		return this.name;
	}
    
}
