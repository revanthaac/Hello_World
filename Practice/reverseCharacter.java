package Practice;

public class reverseCharacter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		

		char[] letters = {'J', 'A', 'V', 'A'};
		int i = letters.length - 1, j = 0;
		char[] let = new char[letters.length];
		while(i >= 0){
		     let[j] = letters[i];
		     i--;
		     j++;
		}
		for (char c : let){
		     System.out.print(c );
		}
	}
}