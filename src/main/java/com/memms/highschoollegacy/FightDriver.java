package com.memms.highschoollegacy;

import javax.swing.JOptionPane;

public class FightDriver {
	public static void main(String args[]) {
		Fight rose = new Fight("RoseMad",80,11);
		Fight wyatt = new Fight();
		while (rose.getHealth()>0 && wyatt.getHealth()>0) {
			JOptionPane.showMessageDialog(null, rose+" " + wyatt);

			if(rose.getRoll()<wyatt.getRoll()) {
				JOptionPane.showMessageDialog(null, "Hulk Hogan won this round");
				int power = wyatt.getPower();
				rose.newHealth(power);
				
			}
			else  {
				JOptionPane.showMessageDialog(null, "RoseMad won this round");
				int power = rose.getPower();
				wyatt.newHealth(power);
			
		}
		}
	}
}
