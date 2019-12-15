package Brasil;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
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
	private JButton button = new JButton("Mon Bouton");		//create a new button
	private JButton button2 = new JButton("Mon Bouton2");		//create a new button
	
	private String Title;
	private int width, height;
	
	public void fenetre() {
		//https://openclassrooms.com/fr/courses/26832-apprenez-a-programmer-en-java/23108-creez-votre-premiere-fenetre
		frame = new JFrame();
		frame.setTitle("Assignment 2 - Noemie Pasquier");	//title of the window
		frame.setSize(800, 600);	//size of the window
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//we close the window when we click on the red cross
		frame.setLocationRelativeTo(null);	//put the object to the center
		
		
		
		//BUTTON
		JPanel panelButtons = new JPanel();	//panel with 2 buttons
		pan.setLayout(new BorderLayout());	//set a layout		
		//button.addActionListener(pan);
		panelButtons.add(button);	//we add the button to the panel and the end of the window
		panelButtons.add(button2);	//we add the button to the panel and the end of the window
		pan.add(panelButtons, BorderLayout.SOUTH);
		//button.addActionListener(?);
		
		//TITLE
		JLabel title = new JLabel("Graph: Temperature of the CPU of the raspberry");	//Title of the graph
		pan.add(title, BorderLayout.NORTH);		//The title is on the top of the window
		
		//TEXT AREA - FREQUENCY
		//JTextArea frequency = new JTextArea(1,1);
		//pan.add(frequency,BorderLayout.CENTER); 
		
		frame.setContentPane(pan);	//the panel becomes vidible
	    frame.setVisible(true);		//Window becomes visible
		
	    /*canvas= new Canvas();
        canvas.setSize(400, 400);
        Graphics G = canvas.getGraphics();
        frame.add(canvas);
        frame.setVisible(true);*/
        

		
	}
	
	public void actionPerformed(ActionEvent e)	//
	{
		Object source = e.getSource();
		String classeSource = source.getClass().getName();
		if(classeSource.equals("JButton"))	//action with the buttons
		{
			if(source==button)
			{
				//Daltoniens
				JLabel title = new JLabel("Graph: Temperature of the CPU of the raspberry");	//Title of the graph
				pan.add(title, BorderLayout.CENTER);		//The title is on the top of the window
			}
			else if(source==button2)
			{
				//format normal
			}
		}
	}
	
	
	
}
