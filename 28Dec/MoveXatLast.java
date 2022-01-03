package dsa;

public class MoveXatLast {
	static int count = 0; static String result = "";
	static void getX(int indx, String str, char trgt ) {
		
		
		if(indx==str.length()) {
			while(count!=0) {
				result=result+trgt;
				count--;
			}
			System.out.println(result);
			return;
		}
		
		if(str.charAt(indx)!= trgt ) {
			result = result + str.charAt(indx);
			
		}
		else {
			count++;}
			
		
		getX(indx+1,str,trgt);
		
		
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcxdegxxy";
		char trgt = 'x';
		int indx=0;
		
		getX(indx,str,trgt);
	}

}
