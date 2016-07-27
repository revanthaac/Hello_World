package friendly;

import java.io.IOException;

public class TransferinSameBank implements TransferInterface{
	
	

	public boolean performTransfer(String source, String destination,
			double amount) throws IOException {
		
		return false;
	}

	public boolean canTransfer(String source, String destination, double amount) {
		
		return false;
	}
	
	public static void main(String[] args) throws IOException{
		TransferinSameBank trns = new TransferinSameBank();
		trns.performTransfer("11", "22", 500);
		
		TransferInterface trnsInterface = new TransferinSameBank();
		trnsInterface.performTransfer("11", "22", 500);
	}
	
 
}
