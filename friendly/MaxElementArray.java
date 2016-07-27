package friendly;

import java.util.Arrays;

public class MaxElementArray {


		public void printTwoMaxNumbers(int[] nums){

		Arrays.sort(nums);

		System.out.println("1st Maximum : "+nums[nums.length-1]);

		System.out.println("2nd Maximum : "+nums[nums.length-2]);

		}
		public static void main(String a[]){

		int num[] = {5,34,78,2,45,1,99,23};

		MaxElementArray max = new MaxElementArray();

		max.printTwoMaxNumbers(num);

		}
	}



//		}
//	public static void main(String a[]){
//        int num[] = {10,20,30,40,9,41,39};
//        MaxElementArray max = new MaxElementArray();
//        max.maxnumber(num);
//        
//        
//	public void maxnumber(int nums) {
//		
//			int x = 0;
//			int y = 0;
//			
//			for (int n : nums) {
//				if(x < n)
//					{
//						y = x;
//						x = n;
//					}
//				else if (y < n)
//					{
//						y = n; 
//					}
//			}
//			
//			System.out.println("First Max Number: "+ x);
//	        System.out.println("Second Max Number: "+ y);
//	        
//			/*else  if (maxtwo < 0){*/
//				
//				
//			}
//	
//	}
//}
