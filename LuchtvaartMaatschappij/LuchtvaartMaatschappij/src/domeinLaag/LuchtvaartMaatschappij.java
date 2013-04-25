package domeinLaag;

import java.util.TreeMap;
import java.util.HashSet;

public class LuchtvaartMaatschappij {
	private String naam;
	private HashSet<Vliegtuig> vliegtuigen = new HashSet<Vliegtuig>();

	/**
	@param naam
	 */
	public LuchtvaartMaatschappij(String naam) {
		this.naam = naam;
	}

	/**
	@param vt
	 */
	public void addVliegtuig(Vliegtuig vt) {
		vliegtuigen.add(vt);
	}

	/**
	@return TreeMap met key = naam en value = een referentie naar het vliegtuig-object
	 */
	public TreeMap<String, Vliegtuig> geefVliegtuigen() {
		TreeMap<String, Vliegtuig> alleVt = new TreeMap<String, Vliegtuig>();
		for (Vliegtuig vt : vliegtuigen) {
			String naam = vt.geefNaam();
			alleVt.put(naam, vt);
		}
		return alleVt;
	}
}
