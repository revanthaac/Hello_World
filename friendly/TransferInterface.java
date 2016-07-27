package friendly;

import java.io.IOException;


public class TransferInterface {
	
	public static final boolean Immediate = true;
	
	public boolean performTransfer(String source, String destination, double amount) throws IOException {
		return false;
	}
				
	public boolean canTransfer(String source, String destination, double amount) {
		return false;
	}

}
