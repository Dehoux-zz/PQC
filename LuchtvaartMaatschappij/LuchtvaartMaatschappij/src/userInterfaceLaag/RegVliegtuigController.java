package userInterfaceLaag;
import java.util.Calendar;
import java.util.TreeMap;
import java.util.Set;
import java.util.Vector;

import domeinLaag.Fabrikant;
import domeinLaag.LuchtvaartMaatschappij;
import domeinLaag.Vliegtuig;
import domeinLaag.VliegtuigType;


public class RegVliegtuigController {
   private LuchtvaartMaatschappij lvm;
   private VliegtuigType vtt;
   private Vliegtuig vt;
   private Fabrikant fbr;
   private RegVliegtuigFrame rvf;
   private TreeMap<String, Fabrikant> fabrMap;
   private TreeMap<String, VliegtuigType> vliegtuigTypen;

   /**
   Toon frame met alle fabrikanten.
      @param lvm
    */
   public RegVliegtuigController(LuchtvaartMaatschappij lvm)
   {
	this.lvm = lvm;
	vt = new Vliegtuig(lvm);
	//Vraag alle fabrikanten op en maak een (gesorteerde) Set met hun namen voor het frame.
	fabrMap = Fabrikant.geefAlle();
	Set<String> fabrSet = fabrMap.keySet();
	rvf = new RegVliegtuigFrame(this, fabrSet);
	rvf.setVisible(true);
   }


   /**
   Toon contactpersoon en de vliegtuigtypes van
   deze fabrikant.
   @param fbr de naam van de fabrikant
   @return Vector<String> met de contactpersoon en vliegtuigtype-codes.
    */
   public Vector<String> fabrikant(String fbrn)
   {
   	Vector<String> v = new Vector<String>() ;
   	//Zoek (de link naar) het fabrikant-object, op basis van de naam.
   	this.fbr = fabrMap.get(fbrn);
   	String cp = this.fbr.geefContactpersoon();
   	v.add(cp);
	//Vraag alle vliegtuigtypen op en maak een (gesorteerde) Set met hun namen voor het frame.
	vliegtuigTypen = fbr.geefVliegtuigTypen();
	Set<String> vttSetc = vliegtuigTypen.keySet();
	for(String s : vttSetc)
   		v.add(s);
   	return v;
   }

  /**
   Zet vliegtuigtype bij het vliegtuig en toon capaciteit.
   @param vttcd de code van een vliegtuigtype
    */
   public int[] type(String vttcd)
   {
	//Zoek (de link naar) het vliegtuigtype-object, op basis van de naam.
   	vtt = vliegtuigTypen.get(vttcd);
	vt.zetVliegtuigType(vtt);
	int[] cap= this.vtt.geefCapaciteit();
	return cap;
   }

   /**
   Zet naam bij het vliegtuig.
   @param naam
    */
   public void naam(String naam) throws IllegalArgumentException
   {
	vt.zetNaam(naam);
   }

   /**
   Zet datumInGebruik bij het vliegtuig.
   @param inGebruik
    */
   public void inGebruik(Calendar inGebruik) throws IllegalArgumentException
   {
    vt.zetInGebruik(inGebruik);
   }

   public void ok() throws IllegalStateException
   {
   	vt.bewaar();
	rvf.dispose(); //Sluit het Jframe; afhankelijk van de ingestelde defaultCloseOperation.
   }

	public void cancel()
	{
	 rvf.dispose();
	}

}
