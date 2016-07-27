package friendly;

public class staticfromNonStatic {

	/**
	 * @param args
	 */
	   public static void main(String args[])
	   {
		  staticfromNonStatic ns=new staticfromNonStatic();
	      ns.addition();   
	   }
	   public static void add(int x ,int y)
	   {
	      int a=x;
	      int b=y;
	      int c=a+b;
	      System.out.println(c);

	   }
	   public void addition(){
		   add(3,5);
		   
	   }
	}


