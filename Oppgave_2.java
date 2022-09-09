package Innlevering_1;

import static java.lang.Double.parseDouble;
import static javax.swing.JOptionPane.*;

public class Oppgave_2 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for (int n = 1; n <= 10; n++) {
		
		double K = parseDouble (showInputDialog("Poengsum:"));
		
		if (90 <= K && K <= 100) {
		showMessageDialog(null, "Karakter: A");	
			
		} if (80 <= K && K <= 89) {
		showMessageDialog(null, "Karakter: B");	
			
		} if (60 <= K && K <= 79) {
		showMessageDialog(null, "Karakter: C");	
			
		} if (50 <= K && K <= 59) {
		showMessageDialog(null, "Karakter: D");	
			
		} if (40 <= K && K <= 49) {
		showMessageDialog(null, "Karakter: E");	
			
		} if (0 <= K && K <= 39) {
		showMessageDialog(null, "Karakter: F");	
			
		} if (K < 0 || 100 < K) {
		showMessageDialog(null, "Ugyldig Poengsum");
		n--;
			
		}
		
		}

	}

}
