package com.memms.highschoollegacy.B5Game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CapitalsShooting3 extends JPanel
{
	//global variables
	ImageIcon temp = new ImageIcon ("penguin.png");
	Image penguin = temp.getImage();
	ImageIcon temp2 = new ImageIcon ("crosshair.png");
	Image cross = temp2.getImage();
	private int xCross = 100;
	private int yCross = 100;
	private int xPen = 300;
	private int yPen=100;
	private int xSpeed= 1;
	private int ySpeed= 1;
	private int counter = 0;
	private int score = 0;
	private boolean dead = false;
	
	public static void main(String [] args) throws InterruptedException{
		
	
		JFrame frame = new JFrame("Capitals Shooting Game");
		CapitalsShooting3 g1 = new CapitalsShooting3();
		frame.add(g1);
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		while(true)
		{
			g1.repaint();
			Thread.sleep(10);
			g1.movePen();
		}
	}
	public void paint(Graphics g)
	{
		
		Graphics2D g2 = (Graphics2D)g;
		g2.setColor(Color.GREEN);
		g2.fillRect(0, 400, 500, 100);
		g2.setColor(Color.BLUE);
		g2.fillRect(0, 0, 500, 400);
		g2.drawImage(penguin, xPen, yPen, 50, 50, null);
		g2.setColor(Color.WHITE);
		g2.drawString("Counter "+counter,50,50);
		g2.drawString("Score "+score,51,70);

		g2.drawImage(cross, xCross-20, yCross-20, 40, 50, null);
		
	}
	public void movePen()
	{
	xPen=xPen+xSpeed;
	yPen=yPen+ySpeed;
	if (xPen<=0)
	{
		xSpeed = (int)(Math.random()*4+1);
		xPen=1;
		counter++;
	}
	else if (xPen>=450)
	{
		xSpeed=(int)(Math.random()*(4+1)*(-1));
		xPen=449;
		counter++;
	}
	else if (yPen<=0)
	{
		ySpeed=(int)(Math.random()*(4+1));
		yPen=1;
		counter++;
		
	}
	else if (yPen >= 350 && dead == false)
	{
		ySpeed=(int)(Math.random()*4+1)*-1;
		yPen=349;
		counter++;
	}
	
//	if (counter==5)
//	{
//		xSpeed=0;
//		ySpeed=(int)(Math.random()*10+1);
//	}
	
	if(yPen >= 550 ) {
		xPen = (int)(Math.random()*300+100);
		yPen= (int)(Math.random()*300+100);
		xSpeed = (int)(Math.random()*2+1);
		ySpeed = (int)(Math.random()*2+1);
		dead = false;

		}
	 
	}
	public CapitalsShooting3()
	{
		addMouseMotionListener(new MouseMotionListener() {

			@Override
			public void mouseDragged(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseMoved(MouseEvent e) {
				// TODO Auto-generated method stub
				xCross = e.getX();
				yCross = e.getY();
			}
			
		});
		addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				int shotX = e.getX();
				int shotY = e.getY();
				System.out.println(shotX+ " " + shotY);
				
				if(shotX >= xPen-20 && shotX <= xPen+50 && shotY >= yPen-20 && shotY <= yPen+50) {
	//				die penguin
					xSpeed = 0;
					ySpeed = 1;
					score++;
					dead = true;
		//			if (yPen >= 350)
		//			{
		//				xPen = (int)(Math.random()*300+100);
		//				yPen= (int)(Math.random()*300+100);
		//				xSpeed = (int)(Math.random()*2+1);
		//				ySpeed = (int)(Math.random()*2+1);
		//			}
				}
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
	}
	

	
}