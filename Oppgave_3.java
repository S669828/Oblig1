package Innlevering_1;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;

public class Oppgave_3 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = parseInt (showInputDialog("Skriv inn heltall"));
		int S1 = n;
		n--;
		
		for ( int S = 1; S <= n; S++) {
		S1 = S * S1;	}
		
		showMessageDialog(null, "Sum: " + S1);
		
	}
}

