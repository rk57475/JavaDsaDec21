package javadsa;

import java.util.*;

public class IntersectionofTwoArrays {

	    public  int[] intersection(int[] nums1, int[] nums2) {
	        Arrays.sort(nums1);
	        Arrays.sort(nums2);
	        
	        int i=0,j=0,k=0;
	        while(i<nums1.length && j<nums2.length)
	        {
	            while(i<nums1.length-1 && nums1[i]==nums1[i+1])
	            {
	                i++;
	            }
	            while(i<nums2.length-1 && nums2[i]==nums2[i+1])
	            {
	                j++;
	            }
	            if(nums1[i]<nums2[j]) i++;
	            else if(nums1[i]>nums2[j]) j++;
	            else{
	                nums1[k++]=nums1[i];
	                ++i;++j;
	            } 
	        }
	        
	        int ans[]=new int[k];
	        for(i=0;i<k;i++){
	            ans[i]=nums1[i];
	        }  
	        return ans;
	    }
	
	
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int arrLen1 = sc.nextInt();
//		int arrLen2 = sc.nextInt();
//		int nums1[]=new int[arrLen1];
//		int nums2[]=new int[arrLen2];
//		for(int i=0; i<=nums1.length;i++) {
//			nums1[i]=sc.nextInt();
//		}
//		for(int i=0; i<=nums2.length;i++) {
//			nums2[i]=sc.nextInt();
//		}
		int arr1[]={1,2,3,4};
		int arr2[]={2,3,5,6};
		IntersectionofTwoArrays ob = new IntersectionofTwoArrays();
		System.out.println(ob.intersection(arr1,arr2));
	}

}
