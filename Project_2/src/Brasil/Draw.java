package Brasil;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")

public class Draw  
{
	private Canvas canvas;
	private JPanel pan = new JPanel();
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		//Graphics2D g2 = (Graphics2D) g;
		//COORDINATE SYSTEM
	 	  g.drawLine(100, 200, 100, 700);	//coordinate system - ordinate
	 	  g.drawLine(100, 200, 90, 210);	//cross - ordinate
	 	  g.drawLine(100, 200, 110, 210);	//cross - ordinate
	 	  g.drawLine(100, 700, 700, 700);	//coordinate system - abscissa
	 	  g.drawLine(700, 700, 690, 690);	//cross- abscissa
	 	  g.drawLine(700, 700, 690, 710);	//cross - abscissa
	}
}
