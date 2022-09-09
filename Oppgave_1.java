package Innlevering_1;

import static java.lang.Double.parseDouble;
import static javax.swing.JOptionPane.*;

public class Oppgave_1 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double Ø0 = 163100;
		double N1 = 163101;
		double Ø1 = 230950;
		double N2 = 230951;
		double Ø2 = 580650;
		double N3 = 580651;
		double Ø3 = 934050;
		double N4 = 934051;
		
		double B = parseDouble (showInputDialog("Bruttolønn:"));
		
		if (B<=Ø0) {
		showMessageDialog(null, "Trinnskatt: 0");
		
		} if (N1 <= B && B <= Ø1) {
		double T1 = B * 0.0093;
		showMessageDialog(null, "Trinnskatt: " + T1);
		
		} if (N2 <= B && B <= Ø2) {
		double T2 = B * 0.0241;
		showMessageDialog(null, "Trinnskatt: " + T2);
		
		} if (N3 <= B && B <= Ø3) {
		double T3 = B * 0.1152;
		showMessageDialog(null, "Trinnskatt: " + T3);
		
		} if (N4 <= B) {
		double T4 = B * 0.1452;
		showMessageDialog(null, "Trinnskatt: " + T4);
			
		}
	}

}
