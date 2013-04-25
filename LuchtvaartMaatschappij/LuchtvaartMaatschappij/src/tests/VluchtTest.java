package tests;

import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Before;
import org.junit.Test;

import domeinLaag.*;

public class VluchtTest {

	private LuchtvaartMaatschappij lvm;
	private Vliegtuig vliegtuig;
	private Luchthaven luchthaven, luchthaven2;
	private Vlucht vlucht;
	private Land nederland;
	private Land duitsland;
	
	@Before
	public void setUp() throws Exception {
		lvm = new LuchtvaartMaatschappij("KLM");
		vliegtuig = new Vliegtuig(lvm);
		nederland = new Land("Nederland", 11);
		duitsland = new Land("Duitsland", 12);
		luchthaven = new Luchthaven("Schiphol", "2e45", true, nederland);
		luchthaven2 = new Luchthaven("Tegel", "2e46", true, duitsland);
		vlucht = new Vlucht(vliegtuig, luchthaven);
		
	}

	@Test (expected=IllegalArgumentException.class)
	public void testZetIncorrecteBestemming() throws VluchtException {
		luchthaven2.zetNaam("Schiphol");
		vlucht.zetBestemming(luchthaven2);
	}
	
	@Test
	public void testZetCorrecteBestemming() {
		try {
			luchthaven2.zetNaam("Tegel");
			vlucht.zetBestemming(luchthaven2);
		} catch (IllegalArgumentException ve) {
			fail("fout bij het zetten van de correcte bestemming");
		}
	}
		
	
	@Test (expected=VluchtException.class)
	public void testZetIncorrecteVertrekTijd() throws VluchtException {
		Calendar tijd = Calendar.getInstance();
		tijd.set(2008, 2, 31, 12, 0);
		vlucht.zetVertrekTijd(tijd);
	}

	@Test
	public void testZetAankomstTijd() {
		fail("Not yet implemented");
	}
	
	@Test
	public void nada(){
		
	}

}
