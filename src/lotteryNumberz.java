import java.util.Random;

import javax.swing.JOptionPane;

public class lotteryNumberz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r = 0;
	
		String lotto = "";
				for(int i= 0; i<6; i++) { 
					int num = new Random().nextInt(100);
					lotto =lotto + num + " ";
					
				} JOptionPane.showMessageDialog(null, lotto);
				
		
		
	}

}
