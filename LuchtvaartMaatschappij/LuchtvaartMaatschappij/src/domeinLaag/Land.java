package domeinLaag;
import java.util.HashSet;
import java.util.TreeMap;

public class Land
{
   /** De naam van het land */
	private String naam;
	/** De code van het land */
   private int code;
   /** Alle luchthavens binnen het land */
   private HashSet<Luchthaven> lh;
   private static HashSet<Land> alleLanden = new HashSet<Land>();

   /**
   @param naam De naam van het nieuwe land
   @param code De code van het nieuwe land
	*/
   public Land(String nm, int cd)
   {
    naam = nm;
    code = cd;
    lh = new HashSet<Luchthaven>();
    alleLanden.add(this);
   }

   
   /**
    * Geeft de naam van het land.
    * @return de naam van het land.
    */
   public String geefNaam()
   {
	return naam;
   }

   /**
   @return int
    */
   public int geefCode()
   {
    return code;
   }

   /**
    * @return java.util.TreeMap een TreeMap met naam als key en een referentie naar het land als value.
   */
   public static TreeMap<String, Land> geefAlleLanden()
   {
	TreeMap<String, Land> landMap = new TreeMap<String, Land>();
	for (Land l : alleLanden) {
		String nm = l.geefNaam();
		landMap.put(nm,l);
	}
	return landMap;
   }

   /** Voegt een Luchthaven toe aan het land. */
   public void addLuchthaven(Luchthaven lhv){
   	lh.add(lhv);
   }

   /**
   @return java.util.TreeMap een TreeMap met naam als key en een referentie naar het land als value.
   */
   public TreeMap<String, Luchthaven> geefLuchthavens()
   {
	TreeMap<String, Luchthaven> luchthavenMap = new TreeMap<String, Luchthaven>();
	for (Luchthaven l : lh){
		String nm = l.geefNaam();
		luchthavenMap.put(nm,l);
	}
	return luchthavenMap;
   }
}

