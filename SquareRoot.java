package javadsa;

import java.util.Scanner;

public class SquareRoot {
	static int getSquareRoot(int num) {
		 if(num<2) return num;
	        int start =0,end = num;
	        while(start<end){
	            int mid = start + (end - start)/2;
	            int mul = num/mid; // This will avoid overflow
	            if(mul==mid) return mid; // if perfect square is found return
	            if(mul<mid){
	                end = mid;
	            }else{
	                start = mid+1;
	            }
	        }
	        return start-1;

    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(	getSquareRoot(num));
		

	}

}
