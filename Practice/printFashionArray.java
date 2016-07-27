package Practice;

public class printFashionArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (j <= i) {
					System.out.print(" A");
				} else {
					System.out.print("   ");
				}

			}
			
			System.out.println();
			System.out.println("~~~~~~~~");
			
			for (int x = 4; x > 0; x--) {
				for (int y = 4; y  > 0; y--) {
					if (y>=x) {
						System.out.print(" A");
					} else {
						System.out.print("   ");
					}
				}

			System.out.println();

		}
	}
		}
	}

	

