/**
 *
 * @author bill
 */
public class AggressiveStrategy implements Strategy{
	//(1)Aggressive: Give preference to a move that kicks a pawn;
	private String name = "Aggressive";
	@Override
	public void getMoves(int roll) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void rankMove() {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
	public String getName(){
		return this.name;
	}
	
}