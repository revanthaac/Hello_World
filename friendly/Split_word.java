package friendly;

public class Split_word {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String testString = "This is a sentence for example";
		String[] parts = testString.split(" ");
		String Word = parts[parts.length - (3)]; // last 3rd word
		System.out.println(Word); 
		
		
		
		String[] word ="This is a sentence for example".split(" "); // 4th word to be displayed
		System.out.println(word[4]);   
		

	}
}
