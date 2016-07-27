package friendly;

public class StringBufBuilder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StringBuffer sbuffer = new StringBuffer();
		sbuffer.append("A")
		.append("d")
		.append("o")
		.append("n")
		.append("I")
		.append("s");
		
		System.out.println("sbuffer :" +sbuffer);
		
		StringBuilder sbuilder = new StringBuilder();
		sbuilder.append("R")
		.append("e")
		.append("v");
		
		System.out.println("sbuilder : " +sbuilder);
		

	}

}
