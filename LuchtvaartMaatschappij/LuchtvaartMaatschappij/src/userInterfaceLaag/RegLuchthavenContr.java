package userInterfaceLaag;
import domeinLaag.*;
import java.util.*;


public class RegLuchthavenContr
{
   private Land land;
   private Luchthaven lh;
   private TreeMap<String, Land> alleLanden;
   private RegLuchthavenFrame rlFrame;


   /**
   Constructor, waarin tevens:
   - Een lijst van alle landen wordt opgevraagd.
   - De constructor van  RegLuchthavenFrame wordt aangeroepen, waarbij een
   		lijst van alleen de namen van alle landen wordt meegegeven.
   - De constructor van Luchthaven wordt aangeroepen. De link naar deze
   		nieuwe luchthaven wordt vastgelegd.
    */
   public RegLuchthavenContr()
   {
   	alleLanden = Land.geefAlleLanden();
   	Set<String> landNamen = alleLanden.keySet();
   	rlFrame = new RegLuchthavenFrame(this,landNamen);
   	rlFrame.setVisible(true);
	lh = new Luchthaven();
   }

   /**
   Zoekt op basis van de naam de bijbehorende land-link op.
   Legt de link naar het geselecteerde land vast en geeft die door aan de nieuwe luchthaven.
   Vraagt land.code op en returned dit.

   @param naam
   @return int
    */
   public int land(String naam)
   {
    land = alleLanden.get(naam);
    lh.zetLand(land);
    int code = land.geefCode();
    return code;
   }

   /**
   Roep lhv.zetNaam().
   Geef de exception door aan het frame, als die optreedt.

   @param naam
   @throws java.lang.IllegalArgumentException
    */
   public void naam(String naam) throws IllegalArgumentException
   {
    lh.zetNaam(naam);
   }

   /**
   Roep lhv.zetCode().

   @param code
    */
   public void code(String code)
   {
	   lh.zetCode(code);
   }

   /**
   Roep lhv.zetWerkPlaats().
   @param wp
    */
   public void werkPlaats(boolean wp)
   {

   }

   /**
   Roep lhv.bewaar().
   Geef de exception door aan het frame, als die optreedt.

   @throws java.lang.IllegalStateException
    */
   public void ok() throws IllegalStateException
   {
	   lh.bewaar();
   }

   /**
   Sluit functie af.
    */
   public void cancel()
   {

   }
   
}
