package userInterfaceLaag;
import java.util.*;
import domeinLaag.*;

public class Main 
{
   
	public static void main(String[] args) 
   {
    LuchtvaartMaatschappij lvm = new LuchtvaartMaatschappij("NLM");
	Fabrikant f1 = new Fabrikant("Airbus","G. Dejenelle");
    Fabrikant f2 = new Fabrikant("Fokker","A.J. Berger");

	VliegtuigType vtt1 = f1.creëerVliegtuigType("A-200", 60, 80);
	VliegtuigType vtt2 = f1.creëerVliegtuigType("A-201", 65, 88);
	VliegtuigType vtt3 = f2.creëerVliegtuigType("F-100", 37, 70);
	VliegtuigType vtt4 = f2.creëerVliegtuigType("F-101", 45, 82);

	Calendar datum = Calendar.getInstance();
	datum.set(2000, 01, 01);
	Vliegtuig vt1 = new Vliegtuig(lvm, vtt1, "Luchtbus 100", datum);
	datum.set(2006, 06, 01);
	Vliegtuig vt2 = new Vliegtuig(lvm, vtt3, "Karel Doorman", datum);
	datum.set(1999, 11, 01);
	Vliegtuig vt3 = new Vliegtuig(lvm, vtt4, "Fokke", datum);
	
	Land l1 = new Land("Nederland", 31);
	Land l2 = new Land("België", 32);
	Land l3 = new Land("Frankrijk", 11);
	Land l4 = new Land("Duitsland", 13);
	
	Luchthaven lh1 = new Luchthaven("Schiphol", "ASD", true, l1);
	Luchthaven lh2 = new Luchthaven("Charles de Gaule", "PRI", true, l3);
	Luchthaven lh3 = new Luchthaven("Tegel", "TEG", true, l4);
	
	Calendar vertrek = Calendar.getInstance();
	vertrek.set(2008, 0, 1, 12, 0);
	Calendar aankomst = Calendar.getInstance();
	aankomst.set(2008, 0, 2, 12, 0);
	Vlucht v1 = new Vlucht(vt3, lh1, lh2, vertrek, aankomst);
	

	try {
		MenuFrame lvmMenu = new MenuFrame(lvm);
		lvmMenu.setVisible(true);
	} catch (Exception e) {
		e.printStackTrace();
	}
   }
}
