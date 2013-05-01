package tests;

import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import domeinLaag.*;

public class VluchtTest {

	static private LuchtvaartMaatschappij lvm;
	static private Vliegtuig vliegtuig;
	static private Luchthaven luchthaven, luchthaven2;
	static private Vlucht vlucht;
	static private Land nederland;
	static private Land duitsland;
	
	@BeforeClass
	public static void setUp() throws Exception {
		lvm = new LuchtvaartMaatschappij("KLM");
		vliegtuig = new Vliegtuig(lvm);
		nederland = new Land("Nederland", 11);
		duitsland = new Land("Duitsland", 12);
		luchthaven = new Luchthaven("Schiphol", "2e45", true, nederland);
		luchthaven2 = new Luchthaven("Tegel", "2e46", true, duitsland);
		vlucht = new Vlucht(vliegtuig, luchthaven);
		
	}

	@Test (expected=VluchtException.class)
	public void testZetIncorrecteBestemming() throws VluchtException {
		vlucht.zetBestemming(luchthaven);
	}
	
	@Test
	public void testZetCorrecteBestemming() {
		try {
			vlucht.zetBestemming(luchthaven2);
		} catch (Exception ve) {
			assertEquals(new VluchtException("Bestemming en vertrek zijn geliijk"), ve);
		}
	}
		
	
	@Test (expected=VluchtException.class)
	public void testZetIncorrecteVertrekTijd() throws VluchtException {
		Calendar tijd = Calendar.getInstance();
		tijd.set(2008, 2, 31, 12, 0);
		vlucht.zetVertrekTijd(tijd);
	}

	@Test
	public void testZetVertrekTijd1159() {
		try {
			Calendar tijd = Calendar.getInstance();
			tijd.set(2008, 1, 1, 11, 59);
			vlucht.zetVertrekTijd(tijd);
		} catch (VluchtException ve) {
			fail("fout bij het zetten van de correcte tijd");
		}
	}
	
	@Test
	public void testZetVertrekTijd1200() {
		try {
			Calendar tijd = Calendar.getInstance();
			tijd.set(2008, 1, 1, 12, 00);
			vlucht.zetVertrekTijd(tijd);
		} catch (VluchtException ve) {
			fail("fout bij het zetten van de correcte tijd");
		}
	}
	
	@Test
	public void testZetVertrekTijd1201() {
		try {
			Calendar tijd = Calendar.getInstance();
			tijd.set(2008, 2, 1, 12, 1);
			vlucht.zetVertrekTijd(tijd);
		} catch (VluchtException ve) {
			fail("fout bij het zetten van de correcte tijd");
		}
	}
	
	@Test
	public void testZetVertrekTijd12002() {
		try {
			Calendar tijd = Calendar.getInstance();
			tijd.set(2008, 2, 1, 12, 00);
			vlucht.zetVertrekTijd(tijd);
		} catch (VluchtException ve) {
			fail("fout bij het zetten van de correcte tijd");
		}
	}
	
	@Test
	public void testZetAankomstTijdVertrekTijd() {
		try {
			Calendar tijdV = Calendar.getInstance();
			Calendar tijdA = Calendar.getInstance();
			tijdV.set(2008, 2, 1, 12, 1);
			vlucht.zetVertrekTijd(tijdV);
			tijdA.set(2008, 2, 1, 12, 2);
			vlucht.zetAankomstTijd(tijdA);
		} catch (VluchtException ve) {
			fail("fout bij het zetten van de correcte tijd");
		}
	}
	
	@Test
	public void testZetAankomstTijdVertrekTijdGelijk() {
		try {
			Calendar tijdV = Calendar.getInstance();
			Calendar tijdA = Calendar.getInstance();
			tijdV.set(2008, 2, 1, 12, 1);
			vlucht.zetVertrekTijd(tijdV);
			tijdA.set(2008, 2, 1, 12, 1);
			vlucht.zetAankomstTijd(tijdA);
		} catch (VluchtException ve) {
			fail("fout bij het zetten van de correcte tijd");
		}
	}
	
	@Test
	public void testZetCorrecteAankomstTijd(){
		
	}
}
