package Test;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Employees e1 = new Employees ("Neki zaposlenik");
		Employees e2 = new Employees ("Neki zaposlenik1");
		Employees e3 = new Employees ("Neki zaposlenik2");
		
		
		HistoricalArtifacts ha = new HistoricalArtifacts("Antcki","SAD");
		HistoricalArtifacts ha1 = new HistoricalArtifacts("Antcki1","BiH");
		
		
		Art art = new Art("Guernica","Picasso",1937);
		Art art1 = new Art("Žena koja plače","Picasso",1937);

		ArrayList<String> showpiece = new ArrayList<>();
		
		showpiece.add(1,"nesto");
		System.out.println(showpiece);
	}

}
