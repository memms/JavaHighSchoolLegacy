package com.memms.highschoollegacy.B5Game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MovingMineCraft extends JPanel {
	//global variable
	int xBox = 175;
	int xBoxVelocity = 1;
	
	public static void main(String args[]) throws InterruptedException {
		JFrame frame = new JFrame("Moving");
		MovingMineCraft game = new MovingMineCraft();
		frame.add(game);
		frame.setSize(400,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		while(true) {
			game.moveCraft();
			game.repaint();
			Thread.sleep(10);
		}
		
	}
	public void paint(Graphics g) {
		Graphics2D g2d = (Graphics2D)g;
		g2d.setColor(Color.BLUE);
		g2d.fillRect(0,00,400,500);
		g2d.setColor(Color.GREEN);
		g2d.fillRect(0, 400, 400, 100);
		g2d.setColor(Color.YELLOW);
		g2d.fillRect(300, 25, 50, 50);
		// the arguements are 100,10,153
		Color hunter = new Color(100,100,153);
		g2d.setColor(hunter);
		
		g2d.fillRect(xBox, 350, 50, 50);
		for(int i =1; i<=1000; i++) {
			int x = (int)(Math.random()*400);
			int y = (int)(Math.random()*500);
			g2d.fillRect(x, y, 5, 5);
		}
		
		
	}
	public void moveCraft() {
		xBox = xBox+xBoxVelocity;
		if (xBox == 400-50)
			xBoxVelocity =-1;
		if (xBox ==0)
			xBoxVelocity = 1;
	}
}
