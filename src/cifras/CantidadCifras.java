package cifras;

import javax.swing.JOptionPane;

public class CantidadCifras {

	public static void main(String[] args) {
		
		int cifra;
		
		cifra = Integer.parseInt(JOptionPane.showInputDialog("Digita un n�mero "));
		
		
		if(cifra<10 && cifra >=0) {
			JOptionPane.showConfirmDialog(null, "El n�mero "+cifra+" tiene una cifra");
		}
		else if(cifra<100 && cifra>=10) {
			JOptionPane.showConfirmDialog(null, "El n�mero "+cifra+" tiene dos cifras");
		}
		else if(cifra<1000 && cifra>=100) {
			JOptionPane.showConfirmDialog(null, "El n�mero "+cifra+" tiene tres cifras");
		}
		else if(cifra<10000 && cifra>=1000) {
			JOptionPane.showConfirmDialog(null, "El n�mero "+cifra+" tiene cuatro cifras");
		}
		else if(cifra<100000 && cifra >=10000) {
			JOptionPane.showConfirmDialog(null, "El n�mero "+cifra+" tiene cinco cifras");
		}
		else {
			JOptionPane.showConfirmDialog(null, "Digita un n�mero entre 0 y 99999");
		}
		

	}

}
