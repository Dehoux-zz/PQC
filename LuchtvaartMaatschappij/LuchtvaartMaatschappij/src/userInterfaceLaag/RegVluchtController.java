package userInterfaceLaag;
import java.util.*;

import domeinLaag.Luchthaven;
import domeinLaag.LuchtvaartMaatschappij;
import domeinLaag.Vliegtuig;
import domeinLaag.Vlucht;
import domeinLaag.VluchtException;

public class RegVluchtController
{
   private TreeMap<String, Vliegtuig> vt;
   private Vliegtuig hetVliegtuig;
   private LuchtvaartMaatschappij lvm;
   private TreeMap<String, Luchthaven> lh;
   private Vlucht deVlucht;
   private RegVluchtJFrame myFrame;

   /**
    * @roseuid 4030E54F01FE
    */
   public RegVluchtController()
   {

   }

   /**
    * Toon frame met alle fabrikanten.
    *
    * @param lvm
    * @roseuid 4027A18D02BC
    */
   public RegVluchtController(LuchtvaartMaatschappij lvm)
   {
   	this.lvm = lvm;
   	vt = lvm.geefVliegtuigen();
   	lh = Luchthaven.geefAlle();

   	myFrame = new RegVluchtJFrame(vt.keySet(), lh.keySet(), this);
   	myFrame.setVisible(true);




   }

   /**
    * Onthoud het vliegtuig. En toon de capaciteit van het vliegtuig.
    * @roseuid 4030DB5701FE
    */
   public int[] vliegtuig(String naam)
   {
   	hetVliegtuig = (Vliegtuig) vt.get(naam);
   	int[] cap = hetVliegtuig.geefCapaciteit();
   	return cap;
   	//todo toon capaciteit

   }

   /**
    * Creëer een nieuwe vlucht en geef de maatschappij, het vliegtuig en vertrekpunt
    * mee.
    * @roseuid 4030DCB6032A
    */
   public void vertrekpunt(String naam)
   {
   	Luchthaven eenLuchthaven = lh.get(naam);
   	deVlucht = new Vlucht(hetVliegtuig, eenLuchthaven);



   }

   /**
    * Leg bestemming vast bij vlucht.
    * @roseuid 4030DD750082
    */
   public void bestemming(String naam)
   {
    Luchthaven eenLuchthaven = (Luchthaven)lh.get(naam);
    deVlucht.zetBestemming(eenLuchthaven);
   }

   /**
    * Leg vertrektijd vast bij vlucht.
    *
    * @param vertrektijd
    * @roseuid 4030DDD90104
    */
   public void vertrektijd(Calendar vertrektijd) throws VluchtException
   {
    deVlucht.zetVertrekTijd(vertrektijd);
   }

   /**
    * Leg aankomstTijd vast bij Vlucht.
    *
    * @param tijd
    * @roseuid 4030DEAB0082
    */
   public void aankomstTijd(Calendar tijd) throws VluchtException
   {
    deVlucht.zetAankomstTijd(tijd);
   }

   /**
    * Bewaar de vluchtgegegevens.
    * @roseuid 4030E062024E
    */
   public void ok() throws VluchtException
   {
    deVlucht.bewaar();
   }
}
