package com.memms.highschoollegacy.B5Game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class KeyboardGameRectangle extends JPanel {
	
	private int xLoc = 250;
	private int yLoc = 250;
	private int xSpeed = 0;
	private int ySpeed = 0;
	private int lives = 3;
	
	public static void main(String args []) throws InterruptedException {
		
	
		
		JFrame frame = new JFrame("Game Keyboard");
		KeyboardGameRectangle game1 = new KeyboardGameRectangle();
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

	public KeyboardGameRectangle() {
		addKeyListener(new KeyListener(){

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				System.out.println(e.getKeyCode());
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
				if(e.getKeyCode() == 40) {
					xSpeed=0;
					ySpeed = 1;
				}
				if(e.getKeyCode() == 38) {
					xSpeed=0;
					ySpeed = -1;
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
		g2d.setColor(Color.DARK_GRAY);
		g2d.fillRoundRect(xLoc, yLoc, 100, 50, 30, 20);
		
		g2d.drawString("Lives: " + lives, 50, 50);
	}
	public void movePiece() {
		xLoc = xLoc +xSpeed;
		yLoc = yLoc + ySpeed;
		//right wall
		if(xLoc == 400) {
			xSpeed = -1;
			lives = lives-1;
		}
		//left wall
		if(xLoc == 0) {
			lives = lives-1;
			xSpeed = 1;

		}
		//top
		if(yLoc == 0) {
			lives = lives-1;
			ySpeed = 1;
		}
		//bottom
		if(yLoc == 440) {
			lives = lives-1;
			ySpeed = -1;
		}
		if (lives == 0) {
			
		}
			
			
	}
}
