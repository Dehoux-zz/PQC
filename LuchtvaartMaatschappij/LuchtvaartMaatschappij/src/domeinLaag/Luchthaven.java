package domeinLaag;
import java.util.*;

public class Luchthaven
{
   private String naam = "";
   private String code = "";
   private boolean werkPlaats = false;
   private Land land;
   private static Set<Luchthaven> alleLuchthavens = new HashSet<Luchthaven>();


   /**
	* @return java.util.TreeMap
	*/
   public static TreeMap<String, Luchthaven> geefAlle()
   {
	TreeMap<String, Luchthaven> alleLh = new TreeMap<String, Luchthaven>();
	for (Iterator<Luchthaven> i = alleLuchthavens.iterator(); i.hasNext();) {
		Luchthaven lh = i.next();
		alleLh.put(lh.naam, lh);
	}
	return alleLh;
   }

   /**
	 * Constructor bedoelt om in main() test-objecten mee aan te maken.
	 * @param naam
	 * @param code
	 * @param werkplaats
	 */
	public Luchthaven(String naam, String code, boolean werkplaats, Land land)
	{
		 this.naam = naam;
		 this.code = code;
		 this.werkPlaats = werkplaats;
		 this.land = land;
		 alleLuchthavens.add(this);
		 land.addLuchthaven(this);
	}

   /**
	 *  Constructor bedoelt om in RegLuchthavenController te gebruiken.
	 *  De diverse attributen worden met zet-methoden naderhand gevuld.
	 */
	public Luchthaven()
	{
		
	}

	/**
	Controleer of de naam uniek is binnen het land.
	Zo ja, leg naam vast.
	Zo nee, throw exception.

	@param naam de naam van de nieuwe luchthaven.
	@throws java.lang.IllegalArgumentException indien de naam al bestaat binnen het land.
    */
	public void zetNaam(String nm) throws IllegalArgumentException
	{
		String nmTrim = nm.trim();
		TreeMap<String, Luchthaven> alleLh = land.geefLuchthavens();
		Luchthaven bestaandeLuchthaven = alleLh.get(nmTrim);
		if (bestaandeLuchthaven != null)
			throw new IllegalArgumentException("Naam bestaat al!");
		else if (nmTrim.length() == 0)
			throw new IllegalArgumentException("Naam heeft geen geldige waarde!");
		else
			this.naam = nmTrim;
	}

	/**
	 * @return java.lang.String
	 */
	public String geefNaam()
	{
	 return naam;
	}

	/**
	 * @param code
    */
	public void zetCode(String code)
	{
		this.code =code;
	}

	/**
	@param wp
    */
	public void zetWerkPlaats(boolean wp)
	{
		werkPlaats = wp;
	}

	/**
	@param land
	*/
	public void zetLand(Land land)
	{
		this.land = land;
	}

	/**
	Controleer of alle attributen een waarde hebben (alles verplicht).
	Zo ja: roep Land.addLuchthaven().
	Zo nee: IllegalStateException.
	Sluit functie af.

	@throws java.lang.IllegalStateException indien nog niet alle attributen een waarde hebben.
    */
	public void bewaar() throws IllegalStateException
	{
		if(land == null)
			throw new IllegalStateException("Land niet ingevuld!");
		else if (naam.trim().equals( ""))
			throw new IllegalStateException("Naam niet ingevuld!");
		else if (code.trim().equals(""))
			throw new IllegalStateException("Code niet ingevuld!");
		else {
			land.addLuchthaven(this);
			alleLuchthavens.add(this);
		}

	}
	
	public String toString() {
		return naam + "(" + code + ")";
	}

}