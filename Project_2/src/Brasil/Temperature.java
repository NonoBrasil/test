package Brasil;

//import java.awt.Color;
//import java.io.*;

//import java.awt.Canvas;
import java.awt.*;

@SuppressWarnings("serial")

public class Temperature extends Canvas {

	 int width, height;
	 static String [][] tab_data = new String [20][2];	//table which save the temperature and the time
	 
   /*
   public CustomCanvas(int width, int height){
           this.setSize(width,height);
           this.width = width;
           this.height = height;
           this.update();
   }*/
   
   public void update() { this.repaint(); }
	
    public static void paint(String[][] tableau)		///
   {
 	  float time; //X->time
 	  float temp; //Y->temperature
 	  int X; //X->time
 	  int Y; //Y->temperature
 	  String Chaine1;	//will be used for string float conversion
 	  String Chaine2;	//will be used for string float conversion
 	  
 	  Canvas cnvs = new Canvas();
       cnvs.setSize(1000, 1000);
 	  Graphics G = cnvs.getGraphics();
 	  
 	  for(int i=0; i<20; i++)
 	  {
 		  Chaine1=tableau[i][0];
 		  Chaine2=tableau[i][1];
 		  time = Float.parseFloat(Chaine1);
 		  temp = Float.parseFloat(Chaine2);
 		  X = (int) time;
 		  Y = (int) temp;
 		  Color Color1 = new Color(0,6, 255); //blue
 		  G.setColor(Color1);
 		  G.fillOval(X,Y, 10, 10);
 	  }
 	  
      
       //pour avoir couleur random : (float)Math.random()
       
       
       
 	 ///DRAWING 
  	 //The abscissa represent the time and the ordinate represent the temperature at this moment
 	//COORDINATE SYSTEM
 	  G.drawLine(100, 200, 100, 700);	//coordinate system - ordinate
 	  G.drawLine(100, 200, 90, 210);	//cross - ordinate
 	  G.drawLine(100, 200, 110, 210);	//cross - ordinate
 	  G.drawLine(100, 700, 700, 700);	//coordinate system - abscissa
 	  G.drawLine(700, 700, 690, 690);	//cross- abscissa
 	  G.drawLine(700, 700, 690, 710);	//cross - abscissa
  	 /*
  	 Color Color2 = new Color(255,0, 0); //red
    	 G.setColor(Color2);
  	 G.drawLine(0, Tmin, actual_time, Tmin);	//line representing the minimum temperature
  	 G.drawLine(0, Tmax, actual_time, Tmax);	//line representing the maximum temperature
  	 actual_time++;	//incrementing of the time
  	 */
 	 cnvs.setVisible(true);

   }
	
  public static void main(String args[]) 
  {

  	int condition =0;
  	//Graphisme graphe =new Graphisme();
  	//String[] previous_tab= new String[2];	//this tab is used for saving the previous value of temperature and time
  	
  	while (condition!=-1)
  	{
  			
  		if(args.length==1)
      	{
  			String [] tab = new String[2];
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
  			paint(tab_data);
  		}
      	else
      	{
      		System.out.println("Error: you must provide the address of the server");
      		System.out.println("Usage is:  java Client x.x.x.x  (e.g. java Client 192.168.7.2)");
      		System.out.println("      or:  java Client hostname (e.g. java Client localhost)");
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
  	}
  	    
  	System.out.println("**. End of Application.");
  }
  
  

  
}
  
     
  
 
