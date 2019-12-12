/* The Date Time Service Class - Written by Derek Molloy for the EE402 Module
 * See: ee402.eeng.dcu.ie
 */


import java.awt.Color;
import java.io.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;



public class DateTimeService
{
   private Calendar calendar;
   public int actual_time=0;
   //TEMPERATURE
   public float Tmin=0;	//minimum temperature
   public float Tmax=0; 	//maximum temperature
   

   //constructor creates the Calendar object, could use the constructor:
   //   Calendar(TimeZone zone, Locale aLocale) to explicitly specify 
   //	  the time zone and locale
   public DateTimeService()
   {
	 this.calendar = Calendar.getInstance();
   }

   //method returns date/time as a formatted String object
   ///public String getDateAndTime()
   public String[] getDateAndTime()
   {
	 Date d = this.calendar.getTime();
	 
	 //We make a table of string to be able to send the cLient the corresponding time and temperature.
	 String [ ] tab = new String[2];
	 
     FileReader filereader = null;
     BufferedReader bufferedreader = null;
     try {
         filereader = new FileReader("/sys/class/thermal/thermal_zone0/temp");
         bufferedreader = new BufferedReader(filereader);
         String strCurrentLine;
         while ((strCurrentLine = bufferedreader.readLine()) != null) {
        	float value = Float.parseFloat(strCurrentLine);	//converting the String to the float
        	//Convert string to int : https://www.mkyong.com/java/java-convert-string-to-int/
        	
        	///TIME RECOVERY
        	String time;
        	String hour;
        	String minutes;
        	String seconds;
        	
        	String time_rasp= d.toString();
        	hour=String.valueOf(time_rasp.charAt(12))+String.valueOf(time_rasp.charAt(13));
        	//Convert char to string : https://www.javatpoint.com/java-char-to-string
        	//Convert string to char : https://developer.mozilla.org/fr/docs/Web/JavaScript/Reference/Objets_globaux/String/charAt
        	minutes=String.valueOf(time_rasp.charAt(15))+String.valueOf(time_rasp.charAt(16));
        	seconds=String.valueOf(time_rasp.charAt(18))+String.valueOf(time_rasp.charAt(19));
        	time=hour+":"+minutes+":"+seconds;		
        	tab[1]=time;	//The first line of the table collects the date.
        	tab[2]=strCurrentLine;	//The second line of the table collects the temperature.
        	
        	///TEMPERATURE MAX AND MIN
        	///To know the maximum and minimum value of the temperature.
        	///We compare the actual temperature if this temperature is higher than Tmax, Tmax takes the actual temp.
        	///If the actual temperature is smaller than Tmin, Tmin takes the actual temp.
        	//We have to divide the temperature by 1000 because the raspberry give a temperature in mili-degrees
        	if (value>Tmax)	//When the actual temp is highter than Tmax
         	{
        		Tmax=value/1000;
         	}
         	if(value<Tmin)		//When the actual temp is smaller than Tmin
         	{
         		Tmin=value/1000;
         	}
        	 System.out.println(strCurrentLine);
        	 System.out.print("The maximum temperature is : ");
        	 System.out.println(Tmax);
        	 System.out.print("The minimum temperature is : ");
        	 System.out.println(Tmin);
        	 
        	 

         }
       } 
     catch (IOException e) 
     {
         e.printStackTrace();
     } 
     finally {
         try {
           if (bufferedreader != null)
             bufferedreader.close();
           if (filereader != null)
             filereader.close();
         } 
         catch (IOException e) 
         {
           e.printStackTrace();
         }
       }
	 	
     return tab;
   }	
}