package repete2;

import javax.swing.JOptionPane;

public class repeticao {
	
	public void repetir() {
		
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor: "));
		do {
			if(num == 15) {
				break;
			}
			JOptionPane.showMessageDialog(null, "aguarde "+num);
			System.out.println("aguarde "+num);
			num++;
			
		} while (num >= 10);
		
	}
	
}
