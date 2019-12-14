package Brasil;

import javax.swing.*;
import java.awt.*;
//import java.awt.event.*;

@SuppressWarnings("serial")
/*public class Graphisme extends JFrame 
{
	private JPanel pan = new JPanel();
	private JButton button = new JButton("Mon bouton");		//create a new button
	
	public void fenetre()
	{
				
		//https://openclassrooms.com/fr/courses/26832-apprenez-a-programmer-en-java/23108-creez-votre-premiere-fenetre
		this.setTitle("Assignment 2 - Noemie Pasquier");	//title of the window
	    this.setSize(800, 800);	//size of the window
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//we close the window when we click on the red cross
	    this.setLocationRelativeTo(null);	//put the object to the center
	    
	    //BUTTON
	    pan.add(button);	//we add the button to the panel
	    this.setContentPane(pan);	//the panel becomes vidible
	    this.setVisible(true);		//Window becomes visible
	    
	  //Nous demandons maintenant à notre objet de se positionner au centre
	  //fenetre.setLocationRelativeTo(null);

	}
	
	
	
}*/

public class Graphisme
{
	private JFrame frame;
	private Canvas canvas;
	
	private JPanel pan = new JPanel();
	private JButton button = new JButton("Mon bouton");		//create a new button
	
	private String Title;
	private int width, height;
	
	public void fenetre() {
		//https://openclassrooms.com/fr/courses/26832-apprenez-a-programmer-en-java/23108-creez-votre-premiere-fenetre
		frame = new JFrame();
		frame.setTitle("Assignment 2 - Noemie Pasquier");	//title of the window
		frame.setSize(800, 800);	//size of the window
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//we close the window when we click on the red cross
		frame.setLocationRelativeTo(null);	//put the object to the center
		//BUTTON
	    pan.add(button);	//we add the button to the panel
	    frame.setContentPane(pan);	//the panel becomes vidible
	    frame.setVisible(true);		//Window becomes visible
		
	    canvas= new Canvas();

		
	}
	
	
	
}
