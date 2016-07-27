package Practice;

public class reverseWordinString {

	/**
	 * @param args
	 */
	   static void reverseWord(String inputString)
		    {
		        String[] words = inputString.split(" ");
		         
		        String reverseString = "";
		        
		        String reverseString1 = "";
		        for (int i = 0; i < words.length; i++) 
		        {
		            String word = words[i];
		             
		            String reverseWord = "";
		             
		            for (int j = word.length()-1; j >= 0; j--) 
		            {
		                reverseWord = reverseWord + word.charAt(j);
		            }
		             
		            reverseString = reverseString + reverseWord + " ";
		            
		            reverseString1 = reverseWord + " " + reverseString1;
		        }
		         
		        System.out.println(inputString);
		         
		        System.out.println(reverseString);
		        
		        System.out.println(reverseString1);
		         
		        System.out.println("-------------------------");
		    }
		     
		    public static void main(String[] args) 
		    {
		    	reverseWord("I have reversed a string");
		         
		    	reverseWord("Reversing a String");
		       
		    }
}



