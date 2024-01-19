package com.memms.highschoollegacy.B5Game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Kaboom_pt1 extends JPanel{
	private int xLoc = 200;
	private int yLoc = 425;
	private int xSpeed = 0;
	private int ySpeed = 0;
	private int lives = 3;
	
	private int xLoc1 = 200;
	private int yLoc1 = 50;
	private int xSpeed1 = 1;
	private int ySpeed1 = 0;
	
	private int xLoc2 = 200;
	private int yLoc2 = 50;

	public static void main(String args []) throws InterruptedException {
		
	
		
		JFrame frame = new JFrame("Game Keyboard");
		Kaboom_pt1 game1 = new Kaboom_pt1();
		frame.add(game1);
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		while(true) {
			game1.repaint();
			game1.movePiece();
			Thread.sleep(5);
		}
	}

	public Kaboom_pt1() {
		addKeyListener(new KeyListener(){

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
			//	System.out.println(e.getKeyCode());
				if (e.getKeyCode() == 32) {
					xSpeed = 0;
					ySpeed = 0;
				}
			//	right = 39
				if(e.getKeyCode() == 39) {
					xSpeed=1;
					ySpeed = 0;
				}
				if(e.getKeyCode() == 37) {
					xSpeed=-1;
					ySpeed = 0;
				}
				//down
				if(e.getKeyCode() == 40) {
			//		xSpeed=0;
			//		ySpeed = 1;
				}
				//up
				if(e.getKeyCode() == 38) {
			//		xSpeed=0;
			//		ySpeed = -1;
				}
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
		//		xSpeed=0;
		//		ySpeed=0;
			}
			
		});
		setFocusable(true);
	}

	public void paint(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(Color.BLUE);
	//	g2d.fillRect(x, y, width, height);
		g2d.fillRect(0, 00, 500, 110);
		g2d.setColor(Color.ORANGE);
		g2d.fillRect(xLoc1, yLoc1, 50, 50);
		g2d.setColor(Color.green);
	
	//	g2d.fillRoundRect(x, y, width, height, arcWidth, arcHeight);
		if (lives == 3) {
			g2d.fillRoundRect(xLoc, yLoc, 100, 10, 30, 20);
			g2d.fillRoundRect(xLoc , yLoc + 15, 100, 10, 30, 20);
			g2d.fillRoundRect(xLoc , yLoc + 30, 100, 10, 30, 20);
		}
		else if (lives == 2) {
			g2d.fillRoundRect(xLoc , yLoc + 15, 100, 10, 30, 20);
			g2d.fillRoundRect(xLoc , yLoc + 30, 100, 10, 30, 20);
		}
		else if (lives == 1) {
			g2d.fillRoundRect(xLoc , yLoc + 30, 100, 10, 30, 20);
		}
		
		
		
		g2d.drawString("Lives: " + lives, 50, 50);
		if (xLoc2 != xLoc1 && yLoc2 != yLoc1) {
			g2d.setColor(Color.BLACK);
			g2d.fillOval(xLoc2, yLoc2, 30, 30);
		}
		else if(xLoc2 == xLoc1 && yLoc2 == yLoc1) {
			yLoc2 = yLoc1;
			xLoc2 = xLoc1;
		}
	}
	
	public void movePiece() {
		
	//	Bomber
		
		xLoc = xLoc +xSpeed;
		yLoc = yLoc + ySpeed;
		
		xLoc1 = xLoc1 +xSpeed1;
		yLoc1 = yLoc1 + ySpeed1;
		
		
		
		if(yLoc2<90) {
			xLoc2 = xLoc1;
		}
		else
			xLoc2 = xLoc2+0;
		
	
		yLoc2 = (yLoc2 + 1);
		
		 if(yLoc2 == 499) {
			yLoc2 = yLoc1;
			lives = lives-1;
		}
			
	//	if(yLoc2 >= 110)
	//		xLoc2 = xLoc2+0;
		
		//right wall
		if(xLoc1 == 400) {
			xSpeed1 = -1;
		//	lives = lives-1;
		}
		//left wall
		if(xLoc1 == 0) {
		//	lives = lives-1;
			xSpeed1 = 1;

		}
		//top
	/*	if(yLoc1 == 0) {
		//	lives = lives-1;
			ySpeed1 = 1;
		}
		//bottom
		if(yLoc1 == 440) {
		//	lives = lives-1;
			ySpeed1 = -1;
		}
	*/
	//	Player
		
		if(xLoc == 400) {
			xSpeed = 0;
		//	lives = lives-1;
		}
		//left wall
		if(xLoc == 0) {
		//	lives = lives-1;
			xSpeed = 0;
		}	
		if (lives == 0) {
			
		}
		
	
			
			
	}
}
