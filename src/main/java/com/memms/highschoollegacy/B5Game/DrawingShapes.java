package com.memms.highschoollegacy.B5Game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

//extends uses inheritance
public class DrawingShapes extends JPanel {
	public static void main (String args[]) {
		//frame is an object created from JFrame
		JFrame frame = new JFrame("Number One");
		frame.add(new DrawingShapes());
		frame.setSize(500,400);		//width = 500 pixels and 'height' is 400 pixels
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	//A void method called paint
	public void paint(Graphics g) {
		Graphics2D g2d = (Graphics2D)g;
		g2d.setColor(Color.RED);
		g2d.drawOval(0, 0, 20, 20);
		g2d.drawOval(20, 0, 40, 20);
		g2d.setColor(Color.BLUE);
		g2d.fillOval(0, 20, 50, 50);
		g2d.drawRect(0, 380, 400, 20);
		g2d.drawLine(200, 200, 300, 500);
		g2d.drawString("Steelers beat Browns!", 300, 300);
	}
}
