
import java.io.*;

public class Temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        
		        FileReader filereader = null;
		        BufferedReader bufferedreader = null;
		        try {
		            filereader = new FileReader("/sys/class/thermal/thermal_zone0/temp.txt");
		            bufferedreader = new BufferedReader(filereader);
		            String strCurrentLine;
		            while ((strCurrentLine = bufferedreader.readLine()) != null) {
		              System.out.println(strCurrentLine);
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
		        

		        
		        
	}

}
