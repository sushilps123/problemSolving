package sps.practice.java;

public class LongestCommonSubsequence {
	static int dp[][];
	
	public static void main(String args[]) {
		String str1 = "ABC";
		String str2 = "AC";
		dp = new int[str1.length()][str2.length()];
		char arr1[] = new char[str1.length()];
		char arr2[] = new char[str2.length()];
		for(int i=0;i<str1.length();i++) {
			arr1[i] = str1.charAt(i);
		}
		for(int i=0;i<str2.length();i++) {
			arr2[i] = str2.charAt(i);
		}
		int count = 0;
		
		 count = LCS(arr1,arr2,0,0);
		
		System.out.println(count);
	}
	
	public static int LCS(char arr1[],char arr2[], int str1index , int str2index) {
		

		if(str1index==arr1.length)
			return 0;
		
		if(str2index==arr2.length)
			return 0;
		
		if(dp[str1index][str2index]!=0) {
			return dp[str1index][str2index];
		}
		
		
		int count = 0;
		
		if(arr1[str1index]==arr2[str2index]) {
			count = 1+ LCS(arr1,arr2,str1index+1,str2index+1);
		}
		else
			// max of [ LCS(i,j+1) And LCS[i,j+1] i.e either considering the element or not 
			count = Math.max(LCS(arr1,arr2,str1index,str2index+1),LCS(arr1,arr2,str1index+1,str2index));
		dp[str1index][str2index] = count;
		return count;
	}
	
}
