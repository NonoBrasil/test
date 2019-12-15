package Brasil;

//import java.awt.Color;
//import java.io.*;

//import java.awt.Canvas;
import java.awt.*;

import javax.swing.JPanel;

@SuppressWarnings("serial")

public class Temperature extends Canvas {

	 int width, height;
	 public String [][] tab_data = new String [20][2];	//table which save the temperature and the time
	 public int Tmin;	//Maximal temperature
	 public int Tmax;	//Minimal temperature
	 
   /*
   public CustomCanvas(int width, int height){
           this.setSize(width,height);
           this.width = width;
           this.height = height;
           this.update();
   }*/
   
   public void update() 
   { 
	   this.repaint(); 
   }
	  
   public void update(Graphics g)
   {
	   paint(g);
   }
   
   //public void paint(String[][] tableau)		///
   public void paint(Graphics g)
   //public void paint()
   {
	   super.paint(g);
	  //Graphics g = getGraphics();
	   
	  float time; //X->time
 	  float temp; //Y->temperature
 	  int X; //X->time
 	  int Y; //Y->temperature
 	  String Chaine1;	//will be used for string float conversion
 	  String Chaine2;	//will be used for string float conversion
 	  
 	  Canvas cnvs = new Canvas();
      cnvs.setSize(1000, 1000);
 	  //Graphics g = cnvs.getGraphics();
 	  //Graphics g ;//
 	  //g= cnvs.getGraphics();
      //Graphics2D g2d = (Graphics2D)G;
 	  
 	  ///DRAWING 
   	  //The abscissa represent the time and the ordinate represent the temperature at this moment
 	  //COORDINATE SYSTEM
  	  g.drawLine(100, 200, 100, 700);	//coordinate system - ordinate
  	  g.drawLine(100, 200, 90, 210);	//cross - ordinate
  	  g.drawLine(100, 200, 110, 210);	//cross - ordinate
  	  g.drawLine(100, 700, 700, 700);	//coordinate system - abscissa
  	  g.drawLine(700, 700, 690, 690);	//cross- abscissa
  	  g.drawLine(700, 700, 690, 710);	//cross - abscissa
 	  
 	  
 	  for(int i=0; i<20; i++)
 	  {
 		  Chaine1=tab_data[i][0];
 		  Chaine2=tab_data[i][1];
 		  time = Float.parseFloat(Chaine1);
 		  temp = Float.parseFloat(Chaine2);
 		  X = (int) time;
 		  Y = (int) temp;
 		  Color Color1 = new Color(0,6, 255); //blue
 		  g.setColor(Color1);
 		  g.fillOval(X,Y, 10, 10);
 	  }
 	  
      
       //pour avoir couleur random : (float)Math.random()
       
      
  	 /*
  	 Color Color2 = new Color(255,0, 0); //red
    	 G.setColor(Color2);
  	 G.drawLine(0, Tmin, actual_time, Tmin);	//line representing the minimum temperature
  	 G.drawLine(0, Tmax, actual_time, Tmax);	//line representing the maximum temperature
  	 actual_time++;	//incrementing of the time
  	 */
 	 g.dispose();
 	 cnvs.setVisible(true);

   }
	
  
   public void tableau()
   {
	   //int actual_temperature=0;
	   int condition =0;
	   while (condition!=-1)
	  	{
	  			String [] tab = new String[2];
	  			Client theApp = new Client(null);
	  			String convert;
	  			if(condition!=20)
	  			{
	  				tab=theApp.getDate();
	  				tab_data[condition][0]=tab[0];	//date recovery
	  				tab_data[condition][1]=tab[1];	//temperature recovery
	  				convert=tab[1];
	  				Integer actual_temperature = Integer.valueOf(convert);
	  			}
	  			else 
	  			{
	  				for(int i=0; i<20; i++)	//Data shift to leave the last row of the table empty
	  				{
	  	  				
	  					tab_data[i][0]=tab_data[i+1][0];	//date recovery
	  	  				tab_data[i][1]=tab_data[i+1][1];	//temperature recovery
	  				}
	  				//Filling the last line of the table
	  				tab=theApp.getDate();
	  				tab_data[19][0]=tab[0];	//date recovery
	  				tab_data[19][1]=tab[1];	//temperature recovery
	  			}
	  			try
	  	  		{
	  	  			Thread.sleep(1000);
	  	  		}
	  	  		catch(InterruptedException ex)
	  	  		{
	  	  			Thread.currentThread().interrupt();
	  	  			
	  	  		}
	  			condition++;
	  			repaint();	//ça va avec la fonction update
	  		
	  	}
	  		
   }
   
   public static void main(String args[]) 
  {

  	int condition =0;
  	Graphisme graphe =new Graphisme();
  	Temperature Temp = new Temperature();
  	//String[] previous_tab= new String[2];	//this tab is used for saving the previous value of temperature and time
  	
  	graphe.fenetre();
  	
  	//while (condition!=-1)
  //	{	
  		Temp.tableau();
  		
  		/*if(args.length==1)
      	{
  			Temp.tableau();
  			//Temp.paint();
  			
  			/*String [] tab = new String[2];
  			Client theApp = new Client(args[0]);
  			if(condition!=20)
  			{
  				tab=theApp.getDate();
  				tab_data[condition][0]=tab[0];	//date recovery
  				tab_data[condition][1]=tab[1];	//temperature recovery
  			}
  			else 
  			{
  				for(int i=0; i<20; i++)	//Data shift to leave the last row of the table empty
  				{
  	  				
  					tab_data[i][0]=tab_data[i+1][0];	//date recovery
  	  				tab_data[i][1]=tab_data[i+1][1];	//temperature recovery
  				}
  				//Filling the last line of the table
  				tab=theApp.getDate();
  				tab_data[19][0]=tab[0];	//date recovery
  				tab_data[19][1]=tab[1];	//temperature recovery
  			}
  			//Call the function to display the graph
  			//Temp.paint(tab_data);
  		}
      	else
      	{
      		System.out.println("Error: you must provide the address of the server");
      		System.out.println("Usage is:  java Client x.x.x.x  (e.g. java Client 192.168.7.2)");
      		System.out.println("      or:  java Client hostname (e.g. java Client localhost)");
      	}*/
  	
  		//condition++;
  	//}
  	    
  	System.out.println("**. End of Application.");
  }
  
  

  
}
  
     
  
 
