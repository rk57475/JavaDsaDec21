package dsa;

public class Array2DMatrixRLDigonalPrint {
	
	public static void main(String[] args) {
		int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		
		for(int i = 0; i<arr.length;i++) {
			int row = i;
			for(int j = arr[i].length; j>=0;j--) {
				int col=j;
				if(row+col==arr.length-1) {
				System.out.print(arr[i][j]+" ");}
			}System.out.println("");
		}
		
		for(int i = 0; i<arr.length;i++) {
			int j= arr.length-1;
			System.out.print(arr[i][j--]+" ");
		}
	}
}
