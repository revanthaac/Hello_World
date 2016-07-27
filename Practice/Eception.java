package Practice;

import java.io.FileReader;
import java.io.IOException;

public class Eception {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		FileReader reader = null;
		
		try{
			reader = new FileReader("....");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e){
			e.printStackTrace();
		} finally {
			
			if(reader != null)
			{
				try{
					reader.close();
					
				} catch (IOException e){
					e.printStackTrace();
				}
			} reader=null;
			
		}
	}

}
