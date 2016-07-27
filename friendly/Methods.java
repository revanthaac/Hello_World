package friendly;

import Examples.Test;

public class Methods {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Test testobj = new Test();
		testobj.testMethod();
		
	Methods x = new Methods();
	x.process();
	
	int result = x.sum(23, 45);
	System.out.println("result:" + result);
	
	int a = 10;
	int b = 87;
	System.out.println("result:" + x.sum(a+b, result) );
	
	int c = 27;
	int d = 30;
	System.out.println("result of sub:" + x.sub(c-d, result));
	
	}
	
	public void process()
	{
		System.out.println("process");
	}
		
	public int sum(int m, int n)
	{
		int s = m + n;
		return s;
		
	}
	
	public int sub(int m, int n)
	{
		int sub = m - n;
		return sub;
	}
	
	
}
