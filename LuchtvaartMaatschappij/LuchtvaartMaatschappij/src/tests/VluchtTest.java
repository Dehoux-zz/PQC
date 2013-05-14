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
	static private Vlucht vluchtTest;
	static private Land nederland;
	static private Land duitsland;
	static private Calendar tijdV = Calendar.getInstance();
	static private Calendar tijdA = Calendar.getInstance();

	
	@BeforeClass
	public static void setUp() throws Exception {
		lvm = new LuchtvaartMaatschappij("KLM");
		vliegtuig = new Vliegtuig(lvm);
		nederland = new Land("Nederland", 11);
		duitsland = new Land("Duitsland", 12);
		luchthaven = new Luchthaven("Schiphol", "2e45", true, nederland);
		luchthaven2 = new Luchthaven("Tegel", "2e46", true, duitsland);
		vlucht = new Vlucht(vliegtuig, luchthaven);
		tijdV.set(2008, 1, 3, 12, 0);
		tijdA.set(2008, 1, 3, 14, 0);
	}

	@Test (expected=VluchtException.class)
	public void test1() throws VluchtException {
		vlucht.zetBestemming(luchthaven);
	}
	
	@Test
	public void test2() {
		try {
			vlucht.zetBestemming(luchthaven2);
		} catch (Exception ve) {
			assertEquals(new VluchtException("Bestemming en vertrek zijn geliijk"), ve);
		}
	}
		
	
	@Test (expected=VluchtException.class)
	public void test3() throws VluchtException {
		tijdV.set(2008, 1, 31, 12, 0);
		vlucht.zetVertrekTijd(tijdV);
	}

	@Test
	public void test4() {
		try {
			tijdV.set(2008, 0, 1, 11, 59);
			vlucht.zetVertrekTijd(tijdV);
		} catch (VluchtException ve) {
			fail("fout bij het zetten van de correcte tijd");
		}
	}
	
	@Test
	public void test5() {
		try {
			tijdV.set(2008, 0, 1, 12, 00);
			vlucht.zetVertrekTijd(tijdV);
		} catch (VluchtException ve) {
			fail("fout bij het zetten van de correcte tijd");
		}
	}
	
	@Test
	public void test6() {
		try {
			tijdV.set(2008, 1, 1, 12, 1);
			vlucht.zetVertrekTijd(tijdV);
		} catch (VluchtException ve) {
			fail("fout bij het zetten van de correcte tijd");
		}
	}
	
	@Test
	public void test7() {
		try {
			tijdV.set(2008, 1, 1, 12, 00);
			vlucht.zetVertrekTijd(tijdV);
		} catch (VluchtException ve) {
			fail("fout bij het zetten van de correcte tijd");
		}
	}
	
	@Test
	public void test8() {
		try {
			tijdV.set(2008, 1, 1, 12, 1);
			vlucht.zetVertrekTijd(tijdV);
			tijdA.set(2008, 2, 1, 12, 2);
			vlucht.zetAankomstTijd(tijdA);
		} catch (VluchtException ve) {
			fail("fout bij het zetten van de correcte tijd");
		}
	}
	
	@Test
	public void test9() {
		try {
			tijdV.set(2008, 1, 1, 12, 1);
			vlucht.zetVertrekTijd(tijdV);
			tijdA.set(2008, 1, 1, 12, 1);
			vlucht.zetAankomstTijd(tijdA);
		} catch (VluchtException ve) {
			fail("fout bij het zetten van de correcte tijd");
		}
	}
	
	@Test
	public void test10(){
		try {
			tijdV.set(2008, 0, 3, 12, 0);
			vlucht.zetVertrekTijd(tijdV);
			tijdA.set(2008, 1, 3, 14, 0);
			vlucht.zetAankomstTijd(tijdA);
		} catch (VluchtException ve) {
			fail("fout bij het zetten van de correcte tijd");
		} 
	}
	
	@Test (expected=VluchtException.class)
	public void test11() throws VluchtException{
		vluchtTest = new Vlucht(null, luchthaven, luchthaven2, tijdV, tijdA);	
	}
	
	@Test (expected=VluchtException.class)
	public void test12() throws VluchtException{
		vluchtTest = new Vlucht(vliegtuig, null, luchthaven2, tijdV, tijdA);	
	}
	
	@Test (expected=VluchtException.class)
	public void test13() throws VluchtException{
		vluchtTest = new Vlucht(vliegtuig, luchthaven, null, tijdV, tijdA);	
	}
	
	@Test (expected=VluchtException.class)
	public void test14() throws VluchtException{
		vluchtTest = new Vlucht(vliegtuig, luchthaven, luchthaven2, null, tijdA);	
	}
	
	@Test (expected=VluchtException.class)
	public void test15() throws VluchtException{
		vluchtTest = new Vlucht(vliegtuig, luchthaven, luchthaven2, tijdV, null);	
	}
	
	
	
}
