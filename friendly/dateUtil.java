package friendly;

import java.text.DateFormat;
import java.util.Date;

public class dateUtil {

	   public static void main(String[] args) {
		   			
	        Date now = new Date(); // Make a new Date object. It will be initialized to the current time.

	        System.out.println(" 1. " + now.toString());  // See what toString() returns

	        System.out.println(" 2. " + DateFormat.getInstance().format(now)); // Next, try the default DateFormat

	       
	        System.out.println(" 3. " + DateFormat.getTimeInstance().format(now));
	        System.out.println(" 4. " + DateFormat.getDateTimeInstance().format(now));  // And the default time and date-time DateFormats

	       
	        System.out.println(" 5. " + DateFormat.getTimeInstance(DateFormat.SHORT).format(now));
	        System.out.println(" 6. " + DateFormat.getTimeInstance(DateFormat.MEDIUM).format(now));
	        System.out.println(" 7. " + DateFormat.getTimeInstance(DateFormat.LONG).format(now));

	        System.out.println(" 8. " + DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT).format(now));
	        System.out.println(" 9. " + DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.SHORT).format(now));
	        System.out.println("10. " + DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG).format(now));
	    }
	
}


