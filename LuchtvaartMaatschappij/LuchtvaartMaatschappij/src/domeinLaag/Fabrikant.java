package domeinLaag;

import java.util.TreeMap;
import java.util.HashSet;

public class Fabrikant {
	private String naam;
	private String contactPersoon;
	private static HashSet<Fabrikant> alleFabrikanten = new HashSet<Fabrikant>();
	private HashSet<VliegtuigType> vliegtuigTypen;

	/**
	@param naam
	@param cp
	 */
	public Fabrikant(String naam, String cp) {
		this.naam = naam;
		this.contactPersoon = cp;
		Fabrikant.alleFabrikanten.add(this);
		vliegtuigTypen = new HashSet<VliegtuigType>();
	}

	/**
	@return TreeMap met key = naam en value = referentie naar het fabrikant-object.
	 */
	public static TreeMap<String, Fabrikant> geefAlle() {
		TreeMap<String, Fabrikant> alle = new TreeMap<String, Fabrikant>();
		for (Fabrikant f : alleFabrikanten) {
			String nm = f.naam;
			alle.put(nm, f);
		}
		return alle;
	}

	public String geefNaam() {
		return naam;
	}

	/**
	@return String
	 */
	public String geefContactpersoon() {
		return contactPersoon;
	}

	/**
	@return TreeMap met key = code en value = referentie naar het vliegtuigtype-object.
	 */
	public TreeMap<String, VliegtuigType> geefVliegtuigTypen() {
		TreeMap<String, VliegtuigType> alleVtt = new TreeMap<String, VliegtuigType>();
		for (VliegtuigType vtt : vliegtuigTypen) {
			String cd = vtt.geefCode();
			alleVtt.put(cd, vtt);
		}
		return alleVtt;
	}

	/**
	@param code
	@param capR
	@param capNR
	@return VliegtuigType
	 */
	public VliegtuigType creëerVliegtuigType(String code, int capR, int capNR) {
		VliegtuigType vtt = new VliegtuigType(this, code, capR, capNR);
		vliegtuigTypen.add(vtt);
		return vtt;
	}
}
