package userInterfaceLaag;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;
import java.util.Date;
import domeinLaag.Boeking;
import domeinLaag.Klant;
import domeinLaag.Luchthaven;
import domeinLaag.Vlucht;

/**
 * 
 */

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author JZuurbier
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class BoekvluchtContr {
	
	TreeMap<String, Luchthaven> luchthavens;
	Boeking nieuweBoeking;
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public BoekvluchtContr() {
		// begin-user-code
		// TODO Auto-generated method stub
		luchthavens = Luchthaven.geefAlle();
		nieuweBoeking = new Boeking();
		new BoekvluchtFrame(luchthavens.keySet(), this).setVisible(true);
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Set<String> vertrEnBest(String vertrek, String bestemming) {
		// begin-user-code
		// TODO Auto-generated method stub
		DateFormat format = new SimpleDateFormat("dd-MM-yyyy");
		Set<Vlucht> vluchten = Vlucht.geefAlleVluchten();
		Set<String> tijden = new HashSet<String>();
		for(Vlucht v : vluchten){
			if(v.getVertrekpunt().equals(vertrek)&& v.getBestemming().equals(bestemming)){
				Calendar cal = v.getVertrekTijd();
				 Date d = cal.getTime();
				 String s = format.format(d);
				 tijden.add(s);
			}
		}
		return tijden;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public ArrayList<String> vlucht(String vertrek, String bestemming, String vertrektijd) throws IllegalArgumentException {
		// begin-user-code
		DateFormat format1 = new SimpleDateFormat("dd-MM-yyyy");
		DateFormat format2 = new SimpleDateFormat("hh:mm aa");
		Set<Vlucht> vluchten = Vlucht.geefAlleVluchten();
		ArrayList<String> tijden = new ArrayList<String>();
		for(Vlucht v : vluchten){
			if(v.getVertrekpunt().equals(vertrek)&& v.getBestemming().equals(bestemming)
					&& format1.format(v.getVertrekTijd().getTime()).equals(vertrektijd)){
				nieuweBoeking.zetVlucht(v);
				tijden.add(format2.format(v.getVertrekTijd().getTime()));
				tijden.add(format1.format(v.getAankomstTijd().getTime()));
				tijden.add(format2.format(v.getAankomstTijd().getTime()));
				return tijden;
			}
		}
		tijden.add("");
		tijden.add("");
		tijden.add("");
		return tijden;
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void klant(String naam, String straat, int huisnummer, String plaats) {
		// begin-user-code
		new Klant(naam, straat, huisnummer, plaats, nieuweBoeking);

		// end-user-code
	}
	
	public void plaatsen(int aantal, boolean roken)throws IllegalArgumentException {
		nieuweBoeking.setAantalPlaatsen(aantal, roken);
	}
	
	public void bewaar() {
		nieuweBoeking.bewaar();
	}
	
	public void cancel(){
		nieuweBoeking = null;
	}
	
}