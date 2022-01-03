package dsa;

public class Array2DMatrixLRDigonalPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		for(int i = 0; i<arr.length;i++) {
			int row = i;
			for(int j = 0; j<arr[i].length;j++) {
				int col=j;
				if(row==col) {
				System.out.print(arr[row][col]+" ");}
			}System.out.println("");
		}
		
		
		
		for(int i = 0; i<arr.length;i++) {
			System.out.print(arr[i][i]+" ");
		}
		
		
		
	}

}
