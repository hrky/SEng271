/**
 *
 * @author bill
 */
public class MoveLastStrategy implements Strategy{
	//(5)Move-last: Give preference to moving the hindmost pawn.
	private String name = "Move Last";
	public String getName(){
		return this.name;
	}
	@Override
	public int[] getMoves(Ludogame game, int roll) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public int rankMove() {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
    
}
