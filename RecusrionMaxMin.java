package dsa;

public class RecusrionMaxMin {
	
	static int max=Integer.MIN_VALUE;
	static int min=Integer.MAX_VALUE;
	static int arr[] = {10,20,6,90,-1};
	static void maxNmiv(int indx) {

//		 int max=Integer.MIN_VALUE;
//		 int min=Integer.MAX_VALUE;
//		 int arr[] = {10,20,6,90,-1};
		if(arr.length==indx) {
			System.out.println(max);
			System.out.println(min);
			return;
		}
		if(arr[indx]>max) {
			max=arr[indx];
			
		}
		
		if(arr[indx]<min) {
			min=arr[indx];
		}
		
		maxNmiv(indx+1);
		
		//
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		maxNmiv(0);
	}

}
