/**
 *
 */
package domeinLaag;


public class Boeking {

	private int aantalPlaatsen;
	private boolean rook;
	
	public void zetVlucht(Vlucht v) {
		// TODO Auto-generated method stub
		
	}

	public void setAantalPlaatsen(int aantal, boolean roken) throws IllegalArgumentException {
		if (aantal <= 0) {
			throw new IllegalArgumentException("aantal mag niet kleiner dan 0");
			
		}
		aantalPlaatsen = aantal;
		rook = roken;
	}

	public void bewaar() {
		// TODO Auto-generated method stub
		
	}

}