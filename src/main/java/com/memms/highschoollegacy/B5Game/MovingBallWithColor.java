package com.memms.highschoollegacy.B5Game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MovingBallWithColor extends JPanel {
	
	int xLocation = (int)(Math.random()*375);
	int yLocation = (int)(Math.random()*275);
	int xVelocity = 1;
	int yVelocity = 1;
	int red = (int)(Math.random()*255);
	int green = (int)(Math.random()*255);
	int blue = (int)(Math.random()*255);
	Color a = new Color(red,green,blue);
	public static void main(String[]args) throws InterruptedException {
		JFrame frame = new JFrame("Bouncing ball with color");
		MovingBallWithColor game1 = new MovingBallWithColor();
		frame.add(game1);
		frame.setSize(400,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		while(true){
			game1.moveRose();
			game1.repaint();
			Thread.sleep(15);
		}
	}
	public void paint(Graphics g) {
		Graphics2D g2d=(Graphics2D)g;
		/*int red = (int)(Math.random()*255);
		int green = (int)(Math.random()*255);
		int blue = (int)(Math.random()*255);
		Color a = new Color(red,green,blue);*/
		g2d.setColor(a);
		g2d.fillRect(0, 0, 400, 300);
		int red1 =(int)(Math.random()*254);
		int green1 =(int)(Math.random()*253);
		int blue1=(int)(Math.random()*253);
		Color b = new Color(red1,green1,blue1);
		g2d.setColor(b);
		g2d.fillOval(xLocation, yLocation, 25, 25);
		
		
	}
	public void moveRose() {
		if(xLocation==375)
			xVelocity=-1*(int)(Math.random()*10);
		if(xLocation==0)
			xVelocity=1;
		if(yLocation==0)
			yVelocity=(int)(Math.random()*5);
		if(yLocation==275)
			yVelocity=-1*(int)(Math.random()*100);
		xLocation = xLocation +xVelocity;
		yLocation = yLocation +yVelocity;
	}
	
}